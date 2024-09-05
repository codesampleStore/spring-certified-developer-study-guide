building-a-rest-api-with-spring-boo

1. build.gradle:

```
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.1.4'
    id 'io.spring.dependency-management' version '1.1.3'
}

group = 'example'
version = '0.0.1-SNAPSHOT'

java {
    sourceCompatibility = '17'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher' // See https://docs.gradle.org/8.3/userguide/upgrading_version_8.html#test_framework_implementation_dependencies
}

tasks.named('test') {
    useJUnitPlatform()
}

// This section causes useful test output to go to the terminal.
test {
    testLogging {
        events "passed", "skipped", "failed" //, "standardOut", "standardError"

        showExceptions true
        exceptionFormat "full"
        showCauses true
        showStackTraces true

        // Change to `true` for more verbose test output
        showStandardStreams = false
    }
}
```


2. Test


   
```
package example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
class CashCardJsonTest {

    @Autowired
    private JacksonTester<CashCard> json;


    @Test
    void myFirstTest() {
        assertThat(42).isEqualTo(42);
    }

    @Test
    void cashCardSerializationTest() throws IOException {
        CashCard cashCard = new CashCard(99L, 123.45);

        assertThat(json.write(cashCard)).isStrictlyEqualToJson("expected.json");
        
        assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.id");
        
        assertThat(json.write(cashCard)).extractJsonPathNumberValue("@.id")
        .isEqualTo(99);
        
        assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.amount");
        
        assertThat(json.write(cashCard)).extractJsonPathNumberValue("@.amount")
        .isEqualTo(123.45);

    }

}

  ```

```
package example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CashCardApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	void shouldReturnACashCardWhenDataIsSaved() {

		ResponseEntity<String> response = restTemplate.getForEntity("/cashcard/99", String.class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}



}


```


3. Create a REST Controller

```
package example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
class CashCardController {


    @GetMapping("/{requestId}")
    private ResponseEntity<CashCard> findById() {
        CashCard cashCard = new CashCard(99L, 123.45);
        return ResponseEntity.ok(cashCard);
    }
}
```  


4. PathVariable

```
   @Test
void shouldNotReturnACashCardWithAnUnknownId() {
  ResponseEntity<String> response = restTemplate.getForEntity("/cashcards/1000", String.class);

  assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  assertThat(response.getBody()).isBlank();
}

   @GetMapping("/{requestedId}")
private ResponseEntity<CashCard> findById(@PathVariable Long requestedId) {
    if (requestedId.equals(99L)) {
        CashCard cashCard = new CashCard(99L, 123.45);
        return ResponseEntity.ok(cashCard);
    } else {
        return ResponseEntity.notFound().build();
    }
}
```



5. Repositories & Spring Data

![Screenshot 2024-08-06 at 11 21 38](https://github.com/user-attachments/assets/988639c6-1792-4628-b697-6eda824e49a4)

```
Entity:

package example.cashcard;
import org.springframework.data.annotation.Id;

record CashCard( @Id Long id, Double amount) {
}


@Repository
public interface CashCardRepository extends JpaRepository<CashCard,Long>, JpaSpecificationExecutor<CashCard> {

}

--OR--

interface CashCardRepository extends CrudRepository<CashCard, Long> {
}


cashCard = cashCardRepository.findById(99);


```

6. Controller shouldn't be concerned with checking IDs or creating data.
7. H2 database
```
   // Add the two dependencies below
   implementation 'org.springframework.data:spring-data-jdbc'
   implementation 'com.h2database:h2'
```

8.  update the test output section of build.gradle with showStandardStreams = true, so that our test runs will produce a lot more output.
```
 test {
 testLogging {
     events "passed", "skipped", "failed" //, "standardOut", "standardError"

     showExceptions true
     exceptionFormat "full"
     showCauses true
     showStackTraces true

     // Change from false to true
     showStandardStreams = true
 }
}
```

9. POST
    Let's refer to the official Request for Comments for HTTP Semantics and Content (RFC 9110) for guidance as to how our API should behave.

For our POST endpoint, review this section about HTTP POST; note that we've added emphasis:

    If one or more resources has been created on the origin server as a result of successfully processing a POST request, the origin server SHOULD send a 201 (Created) response containing a Location header field that provides an identifier for the primary resource created ...

```

    @PostMapping
    private ResponseEntity<Void> createCashCard(@RequestBody CashCard newCashCardRequest, UriComponentsBuilder ucb) {
        CashCard savedCashCard = cashCardRepository.save(newCashCardRequest);
        
        URI locationOfNewCashCard = ucb
        .path("cashcards/{id}")
        .buildAndExpand(savedCashCard.id())
        .toUri();

        return ResponseEntity.created(locationOfNewCashCard).build();
    }
}
```

Our CashCardController now implements the expected input and results of an HTTP POST.

    createCashCard(@RequestBody CashCard newCashCardRequest, ...)

    Unlike the GET we added earlier, the POST expects a request "body". This contains the data submitted to the API. Spring Web will deserialize the data into a CashCard for us.

    URI locationOfNewCashCard = ucb
       .path("cashcards/{id}")
       .buildAndExpand(savedCashCard.id())
       .toUri();

    This is constructing a URI to the newly created CashCard. This is the URI that the caller can then use to GET the newly-created CashCard.

    Note that savedCashCard.id is used as the identifier, which matches the GET endpoint's specification of cashcards/<CashCard.id>.

    Where did UriComponentsBuilder come from?

    We were able to add UriComponentsBuilder ucb as a method argument to this POST handler method and it was automatically passed in. How so? It was injected from our now-familiar friend, Spring's IoC Container. Thanks, Spring Web!

    return ResponseEntity.created(locationOfNewCashCard).build();

    Finally, we return 201 CREATED with the correct Location header.


10. Returning a list with GET

Pagination and Sorting

To start our pagination and sorting work, we’ll use a specialized version of the CrudRepository, called the PagingAndSortingRepository. As you might guess, this does exactly what its name suggests. But first, let’s talk about the “Paging” functionality.

Even though we’re unlikely to have users with thousands of Cash Cards, we never know how users might use the product. Ideally, an API should not be able to produce a response with unlimited size, because this could overwhelm the client or server memory, not to mention taking quite a long time!
    
```
Page<CashCard> page2 = cashCardRepository.findAll(
    PageRequest.of(
        1,  // page index for the second page - indexing starts at 0
        10, // page size (the last page might have fewer items)
        Sort.by(new Sort.Order(Sort.Direction.DESC, "amount"))));
```


The URI

Now let’s learn how we can compose a URI for the new endpoint, step-by-step (we've omitted the https://domain prefix in the following):

    Get the second page

  ```  /cashcards?page=1```

    …where a page has length of 3

   ``` /cashcards?page=1&size=3```

    …sorted by the current Cash Card balance

  ```  /cashcards?page=1&size=3&sort=amount```

    …in descending order (highest balance first)

  ```  /cashcards?page=1&size=3&sort=amount,desc```

The Java Code

Let’s go over the complete implementation of the Controller method for our new “get a page of Cash Cards” endpoint:
```
@GetMapping
private ResponseEntity<List<CashCard>> findAll(Pageable pageable) {
   Page<CashCard> page = cashCardRepository.findAll(
           PageRequest.of(
                   pageable.getPageNumber(),
                   pageable.getPageSize(),
                   pageable.getSortOr(Sort.by(Sort.Direction.DESC, "amount"))));
   return ResponseEntity.ok(page.getContent());
}
```
