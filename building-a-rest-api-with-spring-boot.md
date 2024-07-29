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
