
</br></br>

# TABLE OF CONTENTS
1. <a href="#1-introduction-" id="1">INTRODUCTION</a>
2. <a href="#2-exam-overview-" id="2">EXAM OVERVIEW</a>
3. <a href="#3-rest-concepts-" id="3">REST CONCEPTS</a>
4. <a href="#4-spring-core-concepts-" id="4">SPRING CORE CONCEPTS</a>
5. <a href="#5-spring-boot-basics-and-auto-configuration-" id="5">SPRING BOOT BASICS AND AUTO-CONFIGURATION</a>
6. <a href="#6-aspect-oriented-programming-" id="6">ASPECT-ORIENTED PROGRAMMING</a>
7. <a href="#7-data-management-jdbc-transactions-" id="7">DATA MANAGEMENT: JDBC, TRANSACTIONS</a>
8. <a href="#8-spring-data-jpa-" id="8">SPRING DATA JPA</a>
9. <a href="#9-spring-mvc-" id="9">SPRING MVC</a>
10. <a href="#10-spring-security-" id="10">SPRING SECURITY</a>
11. <a href="#11-spring-boot-actuator-" id="11">SPRING BOOT ACTUATOR</a>
12. <a href="#12-spring-boot-testing-" id="12">SPRING BOOT TESTING</a>
13. <a href="#13-build-test-" id="13">BUILD & TEST</a>
</br></br>


# 1. INTRODUCTION <a id="1-introduction-" href="#1"></a>
This guide walks through some technical notes and references about the Spring Framework, with focus on the Spring Boot Framework, serving as a _supporting material_ for whoever is preparing to take the [Spring Certified Professional](https://www.vmware.com/education-services/certification/vcp-spring-exam.html) exam. I came up with this guide in order to consolidate my knowledge throughout my studies, hence all the content presented here are by no means definitive and exhaustive so that someone only based on what I present here can take the exam fully prepared. Ultimately this guide contains many sources for relevant technical documentations, tutorials and notes, and also offers a structured and concise study planning to help on your preparation.
</br></br>


# 2. EXAM OVERVIEW <a id="2-exam-overview-" href="#2"></a>
The **Spring Certified Professional** certification offered by VMWare is an exam scaled on a range from 100-500, with the determined raw cut score scaled to a value of 300. The exam may contain unscored questions in addition to the scored questions, this is a standard testing practice used by VMWare. We can't know which questions are unscored and the final result will reflect the scored questions only. This certification exam is designed to test and validate the overall understanding and familiarity with core aspects of Spring and Spring Boot frameworks as follows:
 - Container, Dependency, and IoC
 - Aspect-Oriented Programming (AOC)
 - Data Management: JDBC, Transactions
 - Spring Data JPA
 - Spring MVC Basics
 - Spring MVC REST
 - Security
 - Testing 
 - Spring Boot Basics
 - Spring Boot Auto Configuration
 - Spring Boot Actuator
 - Spring Boot Testing

## EXAM INFO
**Duration:** 90 Minutes </br>
**Number of Questions:** 50 Questions </br>
**Passing Score:** 300 </br>
**Format:** Multiple Choice, Multiple Choice Multiple Selection, Drag and Drop, Matching
</br></br>


# 3. REST CONCEPTS <a id="3-rest-concepts-" href="#3"></a>
## REFERENCES
- https://restfulapi.net
- https://restapitutorial.com

## OVERVIEW
**REST** stands for **RE**presentational **S**tate **T**ransfer and it is a software architectural style introduced by [Roy Fielding](https://en.wikipedia.org/wiki/Roy_Fielding) on 2000 as a design guide to the WEB on its early days.

Any web API that conforms to [The REST Principles](https://en.wikipedia.org/wiki/Representational_state_transfer) is classified as **RESTful**.

The data and its functionalities provided by a RESTful API are referred _resources_ and are accessed through **Uniform Resource Identifiers**.

## HTTP METHODS
REST API resources are manipulated by HTTP methods and the most-commonly-used HTTP methods are POST, GET, PUT and DELETE. These methods correspond, respectively, to **C**reate, **R**ead, **U**pdate, and **D**elete operations and those actions are commonlly referred by the **CRUD** acronym.

The following summarises the use of those HTTP methods:
| Method | Action |
| :----- | :----- |
| POST   | Create a resource |
| GET    | Retrieve information about a specific resource or a collection |
| PUT    | Update a resource |
| DELETE | Delete a resource or related component |

## HTTP STATUS
In REST APIs, HTTP status codes are used to inform the consumer about the request's result. The status codes are divided into five categories:</br>
| Category   | Description |
| :--------- | :---------- |
| 1xx Status | Indicates that the server received the request and is continuing the process |
| 2xx Status | Indicates that the client’s request was accepted successfully |
| 3xx Status | Indicates that the client must take some additional action in order to complete the request |
| 4xx Status | Indicates that the client's request contains erros or bad syntax |
| 5xx Status | Indicates that the client's request was unable to be performed due to a server-side error |

## API CONVENTIONS
The key principles of REST involves separating the API into _logical resources_ and manipulate them through HTTP requests where every HTTP method (GET, POST, PUT, DELETE etc) performs a specific operation.

The functionalities provided by an API are related to _resources_ and by convention the resources are represented on URIs as **nouns in the plural**. All operation made available via URI should be mapped to a HTTP method that corresponds to the action is intended to be carried out. 

Follows some common examples of mapping correspondence between the HTTP method, operation type and URI format:</br>
| Method | URL        | Operation |
| :----- | :--------- | :-------- |
| GET    | `/todos`   | Retrieves a list of all todos
| GET    | `/todos/{id}` | Retrieves todo referenced by `id`
| POST   | `/todos`   | Creates a new todo
| PUT    | `/todos/{id}` | Fully updates todo referenced by `id`
| PATCH  | `/todos/{id}` | Partially updates todo referenced by `id`
| DELETE | `/todos/{id}` | Deletes todo referenced by `id`



![Screenshot 2024-06-27 at 14 47 28](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/602d42a3-6fe5-4e5b-8614-009ad5a7a69a)

![Screenshot 2024-06-27 at 14 48 40](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/157f4ccb-1461-43b5-8574-43403e56db73)

![Screenshot 2024-06-27 at 14 48 50](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/ea15b370-0d32-49a4-820f-b06156870851)

![Screenshot 2024-06-27 at 14 50 00](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d86f419d-ec20-4a95-b3bd-b53c38df7ce8)


![Screenshot 2024-06-27 at 14 51 03](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/1d752540-7c84-418d-a829-6178d262248a)

![Screenshot 2024-06-27 at 14 52 00](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b930cfd1-b762-4050-8b30-30fa622b789f)

![Screenshot 2024-06-27 at 14 53 48](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/fee317fc-4bde-4011-aee7-70d691eabeca)

![Screenshot 2024-06-27 at 14 57 37](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7284eb2d-b5c1-4041-9faa-340f32708ffa)


![Screenshot 2024-06-27 at 14 58 48](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/18531616-003c-4fed-9390-e63f40ba462e)


![Screenshot 2024-06-27 at 14 59 12](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/364cd4fa-e363-4663-96dc-395682b88597)

![Screenshot 2024-06-27 at 15 01 02](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/99ea808e-fd90-4cc1-b01e-f3d255b0ee31)

DELETE:

![Screenshot 2024-06-27 at 15 05 40](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7a96058a-ab60-44a2-afce-d4e538d50602)


REST TEMPLATE - blocking client

![Screenshot 2024-06-28 at 09 38 13](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/9e05bcdd-202a-4aa4-bb55-d1bf25f05fda)

- GET - getForObject
- POST - postForLocation

![Screenshot 2024-06-28 at 10 03 04](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d425d014-ead4-4d24-8b4d-c27916ef14e5)


![Screenshot 2024-06-28 at 10 03 33](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/8ed822f8-1862-4bbb-8fa5-72f6a82256cd)

![Screenshot 2024-06-28 at 10 06 25](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/5e9ed6ea-7548-4cae-9575-879a37049a4e)

![Screenshot 2024-06-28 at 10 11 22](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/926cae66-f841-45c2-a576-ba35a3dbd213)

WebClient - non blocking, reactive





</br>

# 4. SPRING CORE CONCEPTS <a id="4-spring-core-concepts-" href="#4"></a>
## SAMPLE PROJECTS
- [spring-bean](./spring-bean/)
- [spring-bean-factory-post-processor](./spring-bean-factory-post-processor/)
- [spring-bean-lifecycle-callback-order](./spring-bean-lifecycle-callback-order/)
- [spring-bean-post-processor](./spring-bean-post-processor/)
- [spring-spel](./spring-spel/)
- [spring-startup](./spring-startup/)

## REFERENCES
- https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
- https://knpcode.com/spring/spring-ioc-container-types-applicationcontext-and-beanfactory
- https://www.journaldev.com/2410/spring-dependency-injection
- https://www.baeldung.com/spring-bean
- https://www.baeldung.com/spring-bean-scopes
- https://dzone.com/articles/spring-bean-lifecycle
- https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring
- https://knpcode.com/spring/spring-bean-lifecycle-callback-methods
- https://www.baeldung.com/spring-core-annotations
- https://www.baeldung.com/spring-expression-language
- https://asyncstream.com/tutorials/spring-initmethod-or-initializingbean/
- https://programmer.help/blogs/after-properties-set-and-init-method-postconstruct-of-spring-initializing-bean.html
- https://www.dineshonjava.com/writing-beanpostprocessor-in-spring/
- https://www.dev2qa.com/spring-expression-language-example-vs/

## OVERVIEW
**Bean** is an object that is instantiated and managed from creation to destruction by the **Spring IoC Container**.

**Spring IoC Container** is responsible for instantiating beans, wiring dependencies and managing the bean lifecycle from its instantiation till destruction. Spring have two IoC container implementations: [BeanFactory](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html) and [ApplicationContext](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html).

**Inversion of Control (IoC)** is a process in which an object defines its dependencies without creating them explicitly. The object delegates the construction/instantiation job of its dependencies to the IoC container.

**Dependency Injection** is a pattern used to implement IoC, where the control being inverted is the setting and injection of object's dependencies.

## SPRING EXPRESSION LANGUAGE
The Spring Expression Language (SpEL for short) is used to query property values from properties file or to manipulate Java objects and its attributes at runtime. @Value annotation is the most used way to process SpEL.

A SpEL expression begins with `#` and is enclosed by braces, e.g. `#{2 + 2}`. Properties can be referenced in a similar fashion with `$`, and are enclosed by braces too, e.g. `${foo.bar}`. Property placeholders cannot contain SpEL expressions, but expressions can, e.g. `#{'${foo.bar}' + 2}`. **Notice that to access the property contained in the properties file from SpEL, is mandatory to reference the property enclosed by single quotes**.

Example:
- @Value("#{systemProperties['user.name]'}") #<expression>

SpEL provides two special built-in variables: `systemProperties` and `systemEnvironment`:
- **systemProperties** – a java.util.Properties object which provides runtime environment properties, like `os.name`, or JVM argument;
- **systemEnvironment** – a java.util.Properties object which provides access to environment variables;
- **environment** - systemProperties + systemEnvironment

If atribute is not found there ^^ it will depend on context (bean) 

- Inject method return value into a field:

![Screenshot 2024-05-13 at 09 13 04](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/924315a0-0188-4f42-a457-330a14d74bf4)

- Properties are Strings:
  
![Screenshot 2024-05-13 at 09 14 16](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/6748e16c-ff67-4fcb-b654-2d2312f2c88f)

- Fallback values
@Value("${daily.limit : 100000}")
@Value("environment['daily.limit']?:10000") (x ?: y is short for x != numm ? x : y)

![Screenshot 2024-05-12 at 12 41 45](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b9a0e104-a13e-4513-b5a4-079152860f9c)

## STARTUP INTERFACES
Spring Boot provides two interfaces to run specific pieces of code as soon as the application starts: [CommandLineRunner](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/CommandLineRunner.html) and [ApplicationRunner](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationRunner.html).

> 📌 When defining multiple beans of both types ***in the same configuration class*** (@SpringBootApplication or @Configuration), beans of ApplicationRunner type will be executed before beans of CommandLineRunner type. That rule also applies when they are defined individually as components (@Component). However when defined as components, that default execution order can be changed through the use of [@Order](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/annotation/Order.html) annotation.

## FACTORY HOOK INTERFACES
[BeanFactoryPostProcessor](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanFactoryPostProcessor.html) - used to modify the definition of any bean before it get created/instantiated by working on its configuration metadata phase, such as loading value from external property files.

[BeanPostProcessor](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html) - Factory hook interface that allows for custom modification of new bean instances _before_ and _after_ properties are set from initialization callbacks.

[InitializingBean](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html) - interface to be implemented by beans that need to react once all their properties have been set by overriding the [afterPropertiesSet](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html#afterPropertiesSet--) method.

[DisposableBean](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html) - interface to be implemented by beans that want to release resources upon their destruction by overriding the [destroy](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html#destroy--) method.

### BEAN STATE ANNOTATIONS
[@PostConstruct](https://docs.oracle.com/javaee/7/api/javax/annotation/PostConstruct.html) - used on beans to mark a method to be executed, like a callback, after the dependency injection is done.
![Screenshot 2024-05-13 at 14 22 41](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7e574b8b-7d61-420f-abec-c168fc7b2ee9)

[@PreDestroy](https://docs.oracle.com/javaee/7/api/javax/annotation/PreDestroy.html) - used on beans to mark a method as a callback to signal the instance is in the process of being removed from the container;

![Screenshot 2024-05-13 at 14 24 27](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/5a0c81bf-1bc7-46a8-9273-cadc9bbce85a)


[@PreDestroy](https:![Screenshot 2024-05-13 at 12 23 11](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/634fd4fd-531a-4ad5-9f41-d1bfb01a877a)

### CALLBACK ORDER EXECUTION
If all lifecycle callbacks, annotations and a BeanPostProcessor implementation are used in conjuction, the execution sequence goes like this: <br>
➡️ **Bean's constructor**<br>
➡️ **BeanPostProcessor's postProcessBeforeInitialization**<br>
➡️ **@PostConstruct method**<br>
➡️ **InitializingBean's afterPropertiesSet**<br>
➡️ **Bean's init-method**<br>
➡️ **BeanPostProcessor's postProcessAfterInitialization**<br>
➡️ **@PreDestroy method**<br>
➡️ **DisposableBean's destroy**<br>
➡️ **Bean's destroy-method**

## KEY ANNOTATIONS
[@Bean](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html) - used on factory methods to indicate that the produced object will be managed by the Spring container;
> 📌 If from a bean definition method another bean definition method is invoked, both within the same configuration class, and the called method is set to have SINGLETON scope then the returned object will always be the same, regardless of the number of invocations; i.e. even on direct calls, the scope defined for the bean determines whether the returning object has to be reused or a new one has to be created.

> The @Bean annotation is a method-level annotation in the Spring Framework. Part of the Spring Framework’s core container, this annotation plays a pivotal role in enabling Dependency Injection (DI) and Inversion of
Control (IoC). It’s used to explicitly declare a single bean, rather than letting Spring do it automatically. The bean returned by the annotated method is registered as a bean in the Spring Application Context.

```

@Configuration
public class AppConfig {
    
    @Bean
    public MyBeanClass myBean() {
        return new MyBeanClass();
    }
}

```

additional resources: https://medium.com/@AlexanderObregon/understanding-the-bean-annotation-in-spring-and-when-to-use-it-dd4396ef8eeb

[@Scope](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Scope.html) - used to indicate the scope for instances of the annotated bean;

> 📌 Singleton - it is default (@Scope("singleton")). The beans are access by multiple threads in the same state (use stateless or immutable beans, synchronized (hard), use a diffeent scope)

> 📌 Prototype - new instabce created every time bean is referenced. (@Scopr(scopeName=prototype)

> 📌 Session - a new instance is created once per user session - web enviroment only

> 📌 Request - a new instance is created once per request - web enviroment only

> 📌 Web Scoket - a new instance is created per web socket session (Spring 4)

> 📌 Refresh - belongs to spring cloud, allow to refresh a single component within applicaiton context

> 📌 Thread - defined but not registered by default, needs to be registered explicitly

> 📌 Custome scope (rarely) - you define a factory for creating bean instances, register to create a custom scope name - multi tenant env for example

[@Autowired](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html) - used at constructors, methods and fields to indicate that the injection (i.e. instantiation) will be managed by the Spring container dinamically;
> 📌 @Autowired can not be used to inject primitive and string values. It only works with reference objects.

> 📌 @Autowired, when processing field injection, first looks for a bean which type is the same as the field to be injected. If multiple beans of the same type are found, then it may require further qualifications like the bean name or @Qualifier to determine the correct bean to be injected.

> 📌 @Autowired(required=false) - only inject if dependency exist, required is set to true by default

![Screenshot 2024-05-13 at 09 41 15](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/9213235f-41a1-49ec-a9df-22d8762f8d03)

![Screenshot 2024-05-13 at 09 45 25](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/63ba8dab-5809-497b-a067-350f1ddde50a)

![Screenshot 2024-05-13 at 09 47 34](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/825294db-9ef8-40b3-b182-1878127e788b)

> 📌 Disambiguation - At startup: NoSuchBeanDefinitionException, no unique bean of type [TypeName] is defined: expected single bean but found 2...

@Component("beanName")
@Qualifier("beanName")

![Screenshot 2024-05-13 at 09 50 18](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/08293eec-9676-4947-b8e5-c3ad35916162)

![Screenshot 2024-05-13 at 09 53 20](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/92fb5ba0-483c-4127-931b-d280a5807507)

Using @Value to set Atribute:

![Screenshot 2024-05-13 at 09 55 44](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/c1e8c718-140c-4ad9-ba40-da1e8953b8ad)

![Screenshot 2024-05-13 at 10 09 44](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/5db495a5-bf57-423c-b499-764ec8e50406)


[@Qualifier](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Qualifier.html) - used to specify the id of the bean that have to be used for injection when more than one type is eligible, i.e. when there are multiple beans resulting in ambiguity;

[@Primary](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Primary.html) - used to indicate that a bean must be given preference when multiple candidates are qualified to autowire a single-valued dependency, i.e. is used to set higher preference for a given bean when there are multiple ones of the same type;

> 📌 When the injection of a field/parameter marked to be autowired is going to be via its type and there are many candidate instances for the given type, an [NoUniqueBeanDefinitionException](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/NoUniqueBeanDefinitionException.html) will be thrown. To solve, we can either add @Primary to one of the bean definition or add @Qualifier to the field/parameter specifying the name from one of the matching candidate beans

[@Lazy](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html) - used to indicate whether a bean is to be lazily initialized, i.e. if present on a @Component or @Bean definition and set to `true`, the bean or component will not be initialized until referenced by another bean or explicitly retrieved from the enclosing [BeanFactory](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html). This annotation may also be placed on injection points marked with @Autowired, like constructor parameters, method parameters etc;

[@Profile](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Profile.html) - used to indicate that a component class or bean is eligiable for registration when the specified profile(s) are active; configuration for specific enviroment. 

![Screenshot 2024-05-12 at 14 05 08](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/40eb805e-3a34-4ad9-9faa-74b776324314)

![Screenshot 2024-05-12 at 14 06 25](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/30a4e4e6-5f42-4435-84ff-064cf3aee3fc)

![Screenshot 2024-05-12 at 14 07 51](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b2b7dc28-77da-4914-84ad-89e7af1e83e3)

-Dspring.profiles.active=jpa - it will select classes/methods without profile at all and classes/methid with @Profile("jpa")


[@Component](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Component.html) - generic stereotype annotation used to indicate that a class is a managed component, registering as a bean;

> 📌  adnotation based configuration

![Screenshot 2024-05-13 at 09 39 56](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/a6523e9a-19a6-4474-be1c-8a062c971547)

> 📌 @Autowired

[@Repository](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Repository.html) - is a @Component stereotype annotation used to indicate that a class defines a data repository. Enables automatic translation of exceptions thrown from the underlying persistence layer;

[@Service](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html) - is a @Component stereotype annotation used to indicate that a class defines business logic;

[@Configuration](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html) - used to mark a class as a source of bean definitions. 

> 📌 Spring creates dynamic proxies for classes annotated with @Configuration and uses CGLIB to extend those class to create proxies. Hence, @Configuration classes must not be final, because final classes cannot be extended, i.e. cannot be subclassed;

> 📌  @Import - provides a way to combine multiple configuration classes:

![Screenshot 2024-05-12 at 08 58 56](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/2cfcaccb-f474-4925-b7c4-bf0e5ea55ff0)

![Screenshot 2024-05-12 at 09 07 19](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/e8dbe6ec-8be2-40a1-9965-0a5e833c824e)

The @Configuration tells Spring to treat this class as a set of configuration instructions to be used when the application is starting up.

[@Import](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Import.html) - used to indicate one or more component class to import — typically from @Configuration classes.

[@ImportAutoConfiguration](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/ImportAutoConfiguration.html) - used to disable the default autoconfiguration flow performed by @EnableAutoConfiguration, importing only the configuration classes provided in the annotation.

[@Value](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Value.html) - used at field or method/constructor parameter level to inject value from properties located at .properties/.yml files, SpEL, classpath's resources etc;

```
@Configuration
public class DbConfig {
  @Bean
  public DataSource dataSource(
    @Value("${db.driver}") String driver,
    @Value("${db.url}") String url,
    @Value("${db.user}") String user,
    @Value("${db.password}") String password) {

    BasicDataSource ds = new BasicDataSource();
    ds.setDriverClassName(drivver);
    ds.setUrl(url);
    ds.setUser(user);
    ds.setPassword(password);
    return ds;
  }
}
```

Alternative use Environment:

![Screenshot 2024-05-12 at 12 58 48](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/feed5fc8-4b03-4b28-81d1-d8c92bb105d1)

[@PropertySource](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/PropertySource.html) - used to load values from property files — the values can be accessed from [Environment](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/env/Environment.html) or injected by the @Value annotation;
> 📌 Avaliavle resource prefixes: classpath:, file:, http: 

[@ConfigurationProperties](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/properties/ConfigurationProperties.html) - used to map resource files such as properties or YAML files to Java Bean object.

[@EnableConfigurationProperties](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/properties/EnableConfigurationProperties.html) - enables support for @ConfigurationProperties annotated classes in our application.
</br></br>


# 5. SPRING BOOT BASICS AND AUTO-CONFIGURATION <a id="5-spring-boot-basics-and-auto-configuration-" href="#5"></a>
## SAMPLE PROJECTS
- [spring-conditional](./spring-conditional/)

## REFERENCES
- https://www.baeldung.com/spring-boot-annotations
- https://www.baeldung.com/spring-conditional-annotations
- https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/using-boot-auto-configuration.html
- https://www.marcobehler.com/guides/spring-boot
- https://www.baeldung.com/spring-component-scanning
- https://reflectoring.io/spring-boot-conditionals
- https://zetcode.com/springboot/conditionalbeans
- https://www.baeldung.com/spring-boot-custom-starter

## AUTO-CONFIGURATION
Auto-configuration is a mechanism in which Spring automatically configures an application based on the dependencies found on its classpath.

When every Spring application boots up, Spring tries to read in properties from 17 locations in addition to the `spring.factories` file in the classpath.

`spring.factories` file is a special file that Spring automatically loads when booting up. It contains reference to a lot of @Configuration class mappings which Spring will try to run. The `spring.factories` file is located in `META-INF` of the [org.springframework.boot:spring-boot-autoconfigure](https://github.com/spring-projects/spring-boot/tree/main/spring-boot-project/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure) dependency.

@Conditional-based annotations are one of the key pieces that makes Spring auto-configuartion mechanism work. We can apply @Conditional-based annotations to common Spring components, like @Bean, @Component, @Service, @Repository and @Controller.

[@Conditional](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Conditional.html) - used to indicate that a given component is only eligible for registration when all specified condition match;

[@ConditionalOnBean](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnBean.html) - used to condition the registration of the annotated component when beans of all classes specified are contained in the BeanFactory;

[@ConditionalOnMissingBean](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnMissingBean.html) - used to condition the registration of the annotated component when none of the bean class specified is contained in the BeanFactory;

[@ConditionalOnClass](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnClass.html) used to condition the registration of the annotated component only if the specified classes are on the classpath;

[@ConditionalOnMissingClass](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnMissingClass.html) - used to condition the registration of the annotated component only if none of the specified classes are on the classpath;

[@ConditionalOnExpression](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnExpression.html) - used to condition the registration of the annotated component only if the specified SpEL expression returns true;

[@ConditionalOnProperty](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnProperty.html) - used to condition the registration of the annotated component only if the specified property is set;

[@ConditionalOnResource](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnResource.html) - used to condition the registration of the annotated component only if the specified resources exist;

[@ConditionalOnJava](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnJava.html) - used to condition the registration of the annotated component only if the application is running on the specified JVM version. By default returns true if the running JVM version is equal to or greater than the specified version;

[@ConditionalOnJndi](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnJndi.html) - used to condition the registration of the annotated component only if the specified JNDI context exists;

[@ConditionalOnWebApplication](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnWebApplication.html) - used to condition the registration of the annotated component only if the application is a web application (SERVLET or REACTIVE);

[@ConditionalOnNotWebApplication](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnNotWebApplication.html) - used to condition the registration of the annotated component only if the application is not a web application;

[@ConditionalOnWarDeployment](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnWarDeployment.html) - used to condition the registration of the annotated component only if the application is a traditional WAR deployment. For applications with embedded servers, this condition will always return `false`.

[@ConditionalOnSingleCandidate](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnSingleCandidate.html) - used to condition the registration of the annotated component only if a bean of the specified class is already contained in the BeanFactory and only a single candidate can be determined;

[@ConditionalOnCloudPlatform](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnCloudPlatform.html) - used to condition the registration of the annotated component only if the specified cloud platform is active;

### CUSTOM CONDITION
We can define a custom logic to be used as criteria for registering a component. To do so we should create a class that implements the [Condition](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Condition.html) interface, overrides its [matches](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Condition.html#matches-org.springframework.context.annotation.ConditionContext-org.springframework.core.type.AnnotatedTypeMetadata-) method with our custom logic, and then specify our class as parameter for the @Conditional annotation.

### COMBINE CONDITIONS
We can combine @Conditional-based annotations along with custom conditions in order to implement complex OR or AND logical operation.

To apply OR operation, we have to create a custom condition extending the [AnyNestedCondition](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/AnyNestedCondition.html) class, then uses it as argument in the @Conditional annotation. For that purpose I created the [HmlOrPrdEnvironmentCondition](/spring-conditional/src/main/java/io/davidarchanjo/HmlOrPrdEnvironmentCondition.java) custom condition and applied it [here](/spring-conditional/src/main/java/io/davidarchanjo/Config.java#L44).

To apply AND operation, we can group custom conditions in the @Conditional and additionally set others @Conditional-based annotations to the component. I demonstrate this operation [here](/spring-conditional/src/main/java/io/davidarchanjo/Config.java#L51).

## External Application Properties
By default, Spring Boot will find and load `application.[properties|yml]` files from the following locations when your application boots up. **This list is ordered by precedence with values from lower items overriding earlier ones**:

![Screenshot 2024-06-04 at 14 44 02](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/040630bc-e2c2-49c2-8a78-50921f3bd4c1)



> 📌 Spring applications have in its classpath the `src/main/resource` folder location by default.

> 📌 If we have the `application.properties` and `application.yml` files in the same location and a given property is defined in both, the value from _application.properties_ will take precedence over the value at application.yml.

> 📌 Command line properties, JVM arguments and OS environment variables will always take precedence over (same) properties defined from application.properties or application.yml.

1. From command-line and OS environment:
   - OS environment variable, e.g. `export server.port=9090`;
   - JVM argument, e.g. `-Dserver.port=9090`;
   - command-line argument, e.g. `--server-port=9090`;

2. From the classpath:
   - The classpath root, e.g. `/resources` folder by default;
   - The classpath `/config` folder, i.e. `/resources/config`;

3. From the current directory:
   - The current directory;
   - The `/config` subdirectory in the current directory;
   - Immediate child directories of the `/config` subdirectory, according to system default folder ordering;

With that in mind, if a property is defined in `/resources/application.properties` and there is a definition for the same property in `/resources/config/application.properties` with a different value, the value from the latter location will take precedence over the former.


![Screenshot 2024-06-04 at 14 32 54](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/69da560a-db8d-4cda-9442-92a354d916cc)


@ConfigurationProperties(prefix="rewards.client")
@Component // make Configuration class spring managed bean 

![Screenshot 2024-06-04 at 14 34 19](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/bf8b0222-9317-4fad-87c2-6f4af28d03dc)


![Screenshot 2024-06-04 at 14 37 26](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/fa9cbe85-e5eb-4802-abed-6ec15e68492d)

</br>

## KEY ANNOTATIONS
[@SpringBootApplication](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html) - is a combination of @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes;

[@EnableAutoConfiguration](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/EnableAutoConfiguration.html) – used to indicates to ApplicationContext to add beans based on the dependencies on the classpath automatically;
![Screenshot 2024-06-05 at 14 46 41](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0cb0051d-1639-4d03-85c5-1703bba20a42)



[@ComponentScan](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/ComponentScan.html) – used to indicate to ApplicationContext to scan for other components, configurations and beans in the same package as the Application class and below;

[@SpringBootConfiguration](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringBootConfiguration.html) - used to indicate that a class provides Spring Boot application @Configuration. Can be used as an alternative to @Configuration annotation so that configuration can be found automatically;

</br></br>

# 6. ASPECT-ORIENTED PROGRAMMING <a id="6-aspect-oriented-programming-" href="#6"></a>
## SAMPLE PROJECTS
- [spring-aop](./spring-aop/)

## REFERENCES
- https://www.javatpoint.com/spring-aop-tutorial
- https://docs.spring.io/spring-framework/docs/3.0.x/reference/aop.html
- https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop
- https://www.journaldev.com/2583/spring-aop-example-tutorial-aspect-advice-pointcut-joinpoint-annotations
- https://howtodoinjava.com/spring-aop-tutorial/
- https://www.baeldung.com/spring-aop-pointcut-tutorial
- https://www.tutorialandexample.com/spring-aop-pointcut-expressions/
- https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/package-summary.html

## OVERVIEW
Aspect-Oriented Programming (AOP) complements Object-Oriented Programming (OOP) by providing another way of thinking about program structure. The key unit of modularity in OOP is the _class_ whereas in AOP the unit of modularity is the _aspect_.
![Screenshot 2024-05-14 at 09 17 33](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/fbd2811d-4612-424a-92b0-df3b562dd668)

![Screenshot 2024-05-14 at 09 19 07](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/92de63c5-dd45-4a54-ad9f-151b2fe12bbb)

![Screenshot 2024-05-14 at 09 22 36](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/27fdcc18-dc88-4e41-b783-e8ae85a5d23f)

ApsectJ - byte code injection 

SpringAOP - uses proxy

> 📌 Join Point - a point in the execution of a program such as a method call or exception throw

> 📌 Pointcut - an expression that select one or more Join Point

> 📌 Advice - code to be executed at each selected Join Point

> 📌 Aspect - a module that encapsulates pointcuts and advice

> 📌 Weaving - technique by which aspect are combined with main code

EXAMPLE:
![Screenshot 2024-05-14 at 09 37 09](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b26842e2-c379-4e1a-a698-f05cd77a6450)

> 📌 @Aspect
> 📌 @Before - advice (aspectJ adnotation not JUnit) (*) - one argument 
![Screenshot 2024-05-14 at 09 37 24](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/de1ae0ec-0544-47b9-a5bd-9bbdf2dd943c)

Enable AspectJ
![Screenshot 2024-05-14 at 09 39 11](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/5d4dab90-b951-4d46-b6e2-f281cda5c34d)


![Screenshot 2024-05-14 at 09 39 52](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/f210e7ec-371b-41fe-8455-d5cc1ed6155b)

![Screenshot 2024-05-14 at 09 42 48](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0a278d1e-e3ce-4c5f-b7be-f5519405bb1b)

![Screenshot 2024-05-14 at 09 49 30](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/791c9250-2908-4931-bc75-d491d97e1fd4)

![Screenshot 2024-05-14 at 10 43 09](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/55e6e41f-ec60-4dbb-86c3-3e7c8a21b7ef)

* - matches once
.. - matches zero or more

### CORE CONCEPTS
* **Cross-Cutting Concerns** - are common functions that span on multiple points of an application, such as logging, transaction management, data validation, etc;

* **Join Point** - is any point during the execution of a program, such as a method execution, an exception handling or a field access. In Spring AOP, a join point always represents a method execution;

* **Pointcut** - is an expression language from AOP that matches **Joint Point**. Spring uses the AspectJ pointcut expression language by default;

Common Pointcut Designator
execution(<method pattern>) - the method must match the pattern

execution(<pattern1>) || execution(<pattern2>) - chain together to create composite pointcuts (&&, ||, !)

Method pattern:

  [Modifiers] ReturnType [ClassType]

    MethodName(Atguments) [throws ExceptionType]

    ![Screenshot 2024-05-14 at 12 21 11](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/361bb89f-e4c0-4bfb-b571-d50ba2808efd)


![Screenshot 2024-05-14 at 12 23 01](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/98f28a1c-e519-48b6-a369-e6c1cad4ed44)

![Screenshot 2024-05-14 at 12 28 09](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/f14884a1-0390-4bc1-8143-9f335159993c)

![Screenshot 2024-05-14 at 12 34 08](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/070e6b5a-f450-4684-850d-d7a1b39fe5b7)

* **Advice** - is an action(s) taken by an **Aspect** at a particular **Join Point**;

  Before Advice
  ![Screenshot 2024-05-14 at 12 37 17](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/f8b3064f-3b32-4ef9-a442-ab264dfd00dc)

  AfterReturning Advice
  ![Screenshot 2024-05-14 at 12 39 21](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/cc22d12f-0b40-4e6b-b5fb-54a526fe9039)

  AfterThrowing Advice
  ![Screenshot 2024-05-14 at 12 41 10](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7e47458f-349b-4744-95f3-abd70462fc9d)

  After Advice
  ![Screenshot 2024-05-14 at 12 43 31](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/025ef04c-a3cf-4d46-8726-2fcbaa26ca66)

  Around Advice
  ![Screenshot 2024-05-14 at 12 45 13](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/ae8a20a5-5f0d-4391-a309-86fb5e032d98)


* **Aspect** - is a class that contains Advices, Join Points etc;

* **Introduction** - is a means to declare additional methods and fields for a type, allowing to introduce new interface to any advised object;

* **Target Object** - is the object being advised by one or more **Aspects**, i.e. the object on which advices are applied. It is known as proxied objects in Spring;

* **Interceptor** - is an Aspect that contains only one advice;

* **AOP Proxy** - is an object created by the AOP framework in order to implement the aspect contracts. In Spring, an AOP proxy will be a _proxied object_;

* **Weaving** - is the process of linking aspects with other application types or objects to create an advised object. Weaving can be done at compile time, load time or runtime. Spring AOP performs weaving at runtime;

## KEY INTERFACE
[JoinPoint](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/aopalliance/intercept/Joinpoint.html) - provides reflective access to both the state available at a join point and static information about it.

[ProceedingJoinPoint](https://www.javadoc.io/doc/org.aspectj/aspectjrt/latest/org/aspectj/lang/ProceedingJoinPoint.html) - extends from JointPoint and exposes the `proceed(..)` method in order to support @Around advice.

## KEY ANNOTATIONS
[@Aspect](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/Aspect.html) - used to mark a @Component class as an aspect declaration;

[@Pointcut](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/Pointcut.html) - used in methods to declare pointcut, which can be availed by advice annotations on refering to that pointcut;

[@Before](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/Before.html) - used to mark a method to be executed before the matching joint point;

[@After](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/After.html) - used to mark a method to be executed after the matching join point finishes, whether normally or by throwing an exception;

[@AfterReturning](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/AfterReturning.html) - used to mark a method to be executed after (only if) the matching joint point completes normally without throwing exception;

[@AfterThrowing](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/AfterThrowing.html) - used to mark a method to be executed after (only if) the matching join point exits due to an exception;

[@Around](https://www.eclipse.org/aspectj/doc/next/aspectj5rt-api/org/aspectj/lang/annotation/Around.html) - used to mark a method to be executed before and after a Joint Point.
</br></br>


![Screenshot 2024-05-14 at 12 49 03](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/50620db3-aa66-4faa-86cb-3d045d22c8f0)


# 7. DATA MANAGEMENT: JDBC, TRANSACTIONS <a id="7-data-management-jdbc-transactions-" href="#7"></a>
## SAMPLE PROJECTS
- [spring-datasource](./spring-datasource/)
- [spring-jdbctemplate](./spring-jdbctemplate/)
- [spring-transaction](./spring-transaction/)

## REFERENCES
- https://www.javainuse.com/spring/boot-transaction
- https://www.baeldung.com/spring-transactional-propagation-isolation
- https://www.marcobehler.com/guides/spring-transaction-management-transactional-in-depth
- https://www.byteslounge.com/tutorials/spring-transaction-propagation-tutorial
- https://www.byteslounge.com/tutorials/spring-transaction-isolation-tutorial

## TRANSACTIONS

![Screenshot 2024-05-22 at 11 18 51](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/632ccf06-1311-484a-a692-cbeedf50d609)

![Screenshot 2024-05-22 at 12 09 06](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/2dedf976-6412-4a93-84e9-95d8ac4f2a50)

![Screenshot 2024-05-22 at 12 10 54](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d9bbcf3b-5419-48fe-81d8-aa09b7925881)

> 📌 PlatformTransactionManager interface
Implementations:

> DataSourceTransactionManager

> JmsTransactionManager

> JpaTransactionManager

> JtaTransactionManager

> WebLogicJtaTransactionManager

> WebSphereUwTransactionManager


<p>
  <b>Transaction</b> is a single logical unit of work which could be composed by one or many actions that potentially modify the content of a database, i.e. a sequence of actions that are considered as a single logical unit by the application. For an application, if any action running into a transactional context fails then all other actions gets rolled back. In Spring, database transaction is by default <code>auto-commit</code>, i.e. every SQL statement runs in its own transaction and will commit after execution. <i>With @Transactional in place, by default Spring will only rolls back on <b>unchecked exceptions</b> (RuntimeException and its subclasses)</i>. To make a transaction rolls back on checked exception we have to specify it on the @Transaction's <code>rollbakFor</code> parameter.
</p>

<p>
  <b>Transaction Propagation</b> is a mechanism used to indicate if a given action will or will not participate in a transactional context as well as how it will behave when called from a context which already has or not a transaction in place.
</p>

> 📌 The default transaction propagation type is `REQUIRED`

> 📌 Read-only transaction is **a transaction which does not modify any data**. If we use the @Transactional's `readOnly` attribute set to `true` on a method which is performing create or update operation then we will not have any created or updated record into the database but rather an exception

> 📌 If we have many @Transaction methods in the same class defined with different propagation types and if they are called sequentially, in practice only the propagation configuration of the first method in the flow will be considered. That is because Spring creates a proxy upon detecting the @Transactional annotation when we are calling any internal method, it will bypass the proxy

> 📌 If we manually handle exceptions (including unchecked exceptions) via try-catch from a transactional context and an exception pops up, the rollback mechanism won't work and the current transaction will execute and commit normally

> 📌 To make transaction suspension works across nested method calls, the methods must belong to different object instances

> 📌 The @Transactional annotation at the class level will be applied to all of its public method. However, if a method is annotated with @Transactional its settings will overwrite the transactional settings defined at the class level

### TYPES OF TRANSACTION PROPAGATION

  | Propagation   | Behaviour |
  |:--------------| :-------- |
  | [REQUIRED](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#REQUIRED)      | Always executes in a transaction. If there is an active transaction it is used otherwise a new one is created |
  | [REQUIRES_NEW](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#REQUIRES_NEW)  | Always executes in a new transaction. If there is an active transaction it gets suspended before stars a new one |
  | [NESTED](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#NESTED)        | Participates in the existing transaction by creating _subtransaction_ which sets _savepoints_ between nested method invocations so that these subtransactions can roll back independently of the outer transaction upon failure |
  | [SUPPORTS](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#SUPPORTS)      | If a physical transaction exists then it makes use otherwise the method will continue its execution in a non-transactional context |
  | [NOT_SUPPORTED](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#NOT_SUPPORTED) | Always executes outside of a transactional context. If there is a transaction in place it gets suspended until the end of the method execution |
  | [NEVER](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#NEVER)         | Must execute outside of a transactional context. If there is an active transaction an [IllegalTransactionStateException](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/IllegalTransactionStateException.html) is thrown |
  | [MANDATORY](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html#MANDATORY)     | Must execute inside a transactional context. If no active transaction is found an [IllegalTransactionStateException](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/IllegalTransactionStateException.html) is thrown |

> 📌 If we try to use `NESTED` propagation with Hibernate JPA we will get a [NestedTransactionNotSupportedException](https://www.javadoc.io/doc/org.springframework/spring-tx/latest/org/springframework/transaction/NestedTransactionNotSupportedException.html) exception with the following message: `JpaDialect does not support savepoints - check your JPA provider capabilities`. That happens because of the Hibernate JPA implementation which does not support nested transcations. To solve, we can use [JdbcTemplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html) or a JPA provider that supports nested transactions, or use [JOOQ](https://www.jooq.org/).

<p>
  <b>Transaction Isolation</b> is a mechanism used to indicate how changes made to data by one transaction affect other concurrent transactions as well as how and when changed data becomes available to other concurrent transactions, i.e. how changes applied on data by concurrent transactions are visible to each other.
</p>

### TYPES OF TRANSACTION ISOLATION

  | Isolation        | Behaviour |
  | :--------------- | :-------- |
  | [DEFAULT](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Isolation.html#DEFAULT) | Indicates that for any transaction the default isolation level of the underlying RDBMS will be used |
  | [READ_COMMITTED](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Isolation.html#READ_COMMITTED) | Indicates that a transaction can only read data that is committed by concurrent transactions |
  | [READ_UNCOMMITTED](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Isolation.html#READ_UNCOMMITTED) | Indicates that a transaction **may** read data that is still uncommitted by concurrent transactions |
  | [REPEATABLE_READ](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Isolation.html#REPEATABLE_READ)  | Indicates that if a transaction reads one record from the database multiple times the result of all reading must always be the same |
  | [SERIALIZABLE](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Isolation.html#SERIALIZABLE)     | Indicates that transactions must be executed with locking at all levels (read, range and write locking) so that they behave as if they were executed in a serialized way, i.e. concurrent execution of a group of transactions should have the same result as if they are executed sequentially |

> 📌 In Spring with JPA if we try to use an isolation level that is different from the DEFAULT isolation type which the transaction manager implementation does not support, we will get an [InvalidIsolationLevelException](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/InvalidIsolationLevelException.html) exception with the following message: `Standard JPA does not support custom isolation levels - use a special JpaDialect for your JPA implementation`. One way to solve this problem is implement a custom JPA dialect.

## KEY INTERFACES
[ResultSet](https://docs.oracle.com/en/java/javase/11/docs/api/java.sql/java/sql/ResultSet.html) - is used to access data produced by the execution of database queries. It provides getter methods (getBoolean, getLong, and so on) for retrieving column values (by name or column's index) from the current row.

[RowMapper](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html) - is used by JdbcTemplate for mapping rows of a ResultSet to Java object _on a per-row basis_.

## KEY ANNOTATIONS
[@Transactional](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Transactional.html) - used to indicate declaratively control over transaction boundaries on managed beans, usually for @Service classes which contain business logic;

[@EnableTransactionManagement](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/EnableTransactionManagement.html) - used on @Configuration classes to enable the Spring's annotation-driven declarative transaction management capabilities. This annotation is **optional** in Spring Boot application as long as one of spring-data-* modules is configured on the project;
</br></br>


# 8. SPRING DATA JPA <a id="8-spring-data-jpa-" href="#8"></a>
## SAMPLE PROJECTS
- [spring-data-jpa](./spring-data-jpa/)

## REFERENCES
- https://spring.io/guides/gs/accessing-data-jpa/
- https://knpcode.com/spring/spring-data-tutorial/
- https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa
- https://www.baeldung.com/spring-data-jpa-query

## OVERVIEW
Spring Boot configures Hibernate as the default JPA provider, and auto-configures a DataSource bean if there's in-memory database dependency of type H2, HSQLDB or Derby present on the classpath. Spring Boot applications may be configured with mutiple databases of different types.

Spring Boot allows to configure DataSource in two ways: programmatically via a @Configuration class or from properties configuration file.

## KEY INTERFACES
[CrudRepository](http://static.springsource.org/spring-data/data-commons/docs/current/api/org/springframework/data/repository/CrudRepository.html) - provides CRUD operations on a repository

[PagingAndSortingRepository](http://static.springsource.org/spring-data/data-commons/docs/current/api/org/springframework/data/repository/PagingAndSortingRepository.html) - extends from CrudRepository and provides methods for pagination and sorting records

[JpaRepository](http://static.springsource.org/spring-data/data-jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html) - extends from PagingAndSortingRepository and additionally provides JPA related methods such as flushing the persistence context and delete records in a batch


## TESTING

https://docs.spring.io/spring-framework/reference/testing/testcontext-framework.html

By default, transactions in JUnit tests are flagged for rollback when they start. However, if the method is annotated with @Commit or @Rollback(false), they start flagged for commit instead.

By default @DataJpaTest autoconfigures an in-memory database like H2 to be used on testing, as long as one of that type is found in the classpath. To avoid stars an embedded database and use a real one like Postgres we must annotate the test class with `@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)`.

Spring has rich testing support based on **TestContect** framework. It defines an ApplicationContect for your tests.

@ContectConfiguration defines the spring configuration to use. It is included in spring-test.jar.

JUnit 5 uses @ExtendWith

JUnit4 uses @RunWIth (runners) - no multiple runners at the same time

Spring has SpringExtension


![Screenshot 2024-05-15 at 08 19 46](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0f6a7a08-f25c-4921-b75c-3126a816a7a7)

![Screenshot 2024-05-14 at 14 07 32](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b0a4a24b-23cc-46e9-9ec9-b65f4838f587)

![Screenshot 2024-05-14 at 14 08 16](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/1787b251-5416-4f74-8161-f2b11ccfc714)

![Screenshot 2024-05-15 at 08 29 48](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/f7fdca91-3e30-41c8-8fe2-a7f22764b566)


Integration tests:

![Screenshot 2024-05-14 at 14 12 02](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/da40efd8-da9e-4a80-ac46-6967ce09210c)

1. If test changes state of components you can use @DiritesContext addnotation to tell spring to destroy cached context amd create new context.

```
@Test
@DirtyContext
public void test() {
  transferService.setMaxTransfer(0);
}
```

2. 
   @SpringJUnitCOnfig(SystemTestConfig.class) // @ExtednWith(SpringExtension.class) and @ContextConfiguration(SystemTextConfig.class)
   @TestPropertiesSource(properties={"username=foo", "password=bar"}, locations="classpath:/transfer-test.properties")
   public class TransferServiceTest {
      
   }
  

> Configuration Tests using Spring Profiles and working with Database

![Screenshot 2024-05-15 at 08 54 57](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d03655dc-ea7e-4c23-81a4-a0268f1c5ed4)



## KEY ANNOTATIONS
[@Entity](https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Entity.html) - used to specify that the annotated class maps a database entity. If we forget to mark a domain class that will map a database entity with @Entity annotation, we will get an IllegalArgumentException since Spring will not be able to invocate the init method in a not managed type;

[@Table](https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Table.html) - used to specify the table's details, like name, schema etc, that will map the entity in the database. It's not mandatory to use @Table on mapping an entity class, and in its absence, the table name will be taken from the class name;

[@Id](https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Id.html) - used to mark a property in a entity class as the primary key. If no @Column annotation is specified, the primary key column name is assumed to be the name of the property;

[@GeneratedValue](https://javaee.github.io/javaee-spec/javadocs/javax/persistence/GeneratedValue.html) - used to specify the primary key generation strategy which by default is autoincrement;

[@Column](https://javaee.github.io/javaee-spec/javadocs/javax/persistence/Column.html) - used to specify database column details like name, constraint etc to which a property will be mapped. If no @Column annotation is specified, then the field name will be used for mapping;

[@Query](https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/Query.html) - used to declare custom queries on 
repository methods to execute both JPQL or native SQL queries;

[@Modifying](https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/Modifying.html) - used to indicate that a @Query annotated repository method executes a modifying JPQL or native SQL such as a INSERT, UPDATE, DELETE or DDL statement;

[@EntityScan](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/domain/EntityScan.html) - used on @Configuration classes to indicate to Spring where is located entity classes when they are not placed under the main application package or its sub-packages;

[@EnableJpaRepositories](https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/config/EnableJpaRepositories.html) - used on @Configuration classes to indicate to Spring where is located JPA repository classes when they are not placed in the same package of the main application class or under its sub-packages;
</br></br>


# 9. SPRING MVC <a id="9-spring-mvc-" href="#9"></a>


![Screenshot 2024-06-25 at 09 16 43](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0dfbdd1e-2b16-4e35-a347-83c77a723ea1)

@ResponseBody defines a REST respnse. It turns off the View handling subsystem.

![Screenshot 2024-06-25 at 09 26 11](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/eda7ba95-082b-4a8e-8bec-2257012c23b4)

If @RestController is being used, @ResponseBody can be omitted.
@RestController incorporates @Controllse and @responseBody


![Screenshot 2024-06-25 at 09 32 43](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/2583fd2f-c649-4275-9a19-8377995c8c1b)

![Screenshot 2024-06-25 at 09 35 01](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/cb59b518-8718-4d61-8bda-a2a2734ea9e8)

- @RequestParam - account?userId=1234

![Screenshot 2024-06-25 at 09 40 20](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/4029da84-8825-46fd-a2bc-d42c0c9b7a4a)
  
- @PathVariable - account/1234

![Screenshot 2024-06-25 at 09 41 07](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7222d200-29d3-40dc-b924-5cc91091e85e)

![Screenshot 2024-06-25 at 09 42 40](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/1ff0cbdf-f5fc-459a-9c03-094e3fcba523)

![Screenshot 2024-06-25 at 09 45 26](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/edfe7ba2-afde-429e-9532-503e80b3eecf)


- Message Converters

![Screenshot 2024-06-25 at 09 48 55](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/a18efd5f-2198-4c33-a79a-f37367c1787b)

![Screenshot 2024-06-25 at 09 57 42](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/acfd42fd-dd6e-4a67-8755-9223d3a67c85)



## SAMPLE PROJECTS
- [spring-crud](./spring-crud/)
- [spring-mvc](./spring-mvc/)
- [spring-web](./spring-web/)

## REFERENCES
- https://www.marcobehler.com/guides/spring-mvc
- https://www.baeldung.com/spring-mvc-tutorial
- https://spring.io/guides/gs/serving-web-content
- https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
- https://howtodoinjava.com/spring-boot2/resttemplate/spring-restful-client-resttemplate-example

## KEY INTERFACES
[Model](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/ui/Model.html) - used to pass values required for rendering views;

[ModelMap](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/ui/ModelMap.html) - used to pass values to render a view, with the advantage to pass a collection of values like a Map.

[ModelAndView](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/ModelAndView.html) - used to pass all the information, i.e. model and view, required to process page rendering;

## KEY ANNOTATIONS
[@ModelAttribute](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ModelAttribute.html) - used to bind method parameter or method return value to a named model attribute, exposed in a web view. 

[@GetMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html) - used to map HTTP GET requests onto specific handler method. It is a shortcut for <code>@RequestMapping(method = RequestMethod.GET)</code>;

[@PostMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PostMapping.html) - used to map HTTP POST requests onto specific handler method. It is a shortcut for <code>@RequestMapping(method = RequestMethod.POST)</code>;

[@PutMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PutMapping.html) - used to map HTTP PUT requests onto specific handler method. It is a shortcut for <code>@RequestMapping(method = RequestMethod.PUT)</code>;

[@DeleteMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/DeleteMapping.html) - used to map HTTP DELETE requests onto specific handler method. It is a shortcut for <code>@RequestMapping(method = RequestMethod.DELETE)</code>;

[@PatchMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PatchMapping.html) - used to map HTTP PATCH requests onto specific handler method. It is a shortcut for <code>@RequestMapping(method = RequestMethod.PATCH)</code>;

[@RequestMapping](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html) - used to map web requests onto methods in request-handling classes with flexible method signatures. @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, and @PatchMapping are different variants of @RequestMapping for handling the specific HTTP operation by these annotations. By default @RequestMapping maps all HTTP operations;

[@PathVariable](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PathVariable.html) - used to bind a named URI path parameter into a method argument;

[@RequestParam](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html) - used to bind a URI query parameter to a method argument;

[@RequestHeader](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestHeader.html) - used to bind a request header to a method parameter;

[@RequestPart](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestPart.html) - used to associate a part of a multipart request with a method argument;

[@CookieValue](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/CookieValue.html) - used to indicate that a method parameter is bound to an HTTP cookie;

[@RequestBody](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestBody.html) - used to bind the payload body from the request onto a method argument;

[@ResponseBody](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseBody.html) - used to indicate that the result of a request handler method is the response itself.
If a class is annotated with @ResponseBody, all of its request handler methods will be functioning like that;

[@ResponseStatus](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseStatus.html) - used to specify the HTTP response status of a request handler method;

[@Controller](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html) - is a @Component stereotype annotation used to mark a class as a source of request method handlers;

[@RestController](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html) - combines the @Controller and @ResponseBody annotations, making all request handler methods in the annotated class assumes @ResponseBody by default;

> 📌 We can assign URI template variables or query parameters directly to objects without having to specify the @PathVariable and @RequetParam annotations, respectively; as long as the given object has matching getters/setters

> 📌 @RequestMapping's `headers` and `params` attributes are used to narrow requests that contain specific headers or query parameters, respectively

> 📌 @RequestMapping methods mapped to "GET" are also implicitly mapped to "HEAD", i.e. there is no need to have "HEAD" explicitly declared. An HTTP HEAD request is processed as if it were an HTTP GET except instead of writing the body only the number of bytes are counted and the "Content-Length" header set.

> 📌 @RequestMapping methods have built-in support for HTTP OPTIONS. By default an HTTP OPTIONS request is handled by setting the "Allow" response header to the HTTP methods explicitly declared on all @RequestMapping methods with matching URL patterns. When no HTTP methods are explicitly declared the "Allow" header is set to "GET,HEAD,POST,PUT,PATCH,DELETE,OPTIONS"

> 📌 If @RequestMapping is used along with any of its variant annotations in a handler method definition, its configuration will take precedence over the descendant annotation, i.e. only the @RequestMapping settings (e.g. [method](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html#method--), [path](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html#path--), [query parameters](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html#params--), [headers](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html#headers--)) will be taken into account.

</br></br>


# 10. SPRING SECURITY <a id="10-spring-security-" href="#10"></a>
## REFERENCES
- https://www.toptal.com/spring/spring-security-tutorial
- https://spring.io/guides/topicals/spring-security-architecture
- https://www.marcobehler.com/guides/spring-security
- https://www.baeldung.com/spring-security-expressions
- https://www.section.io/engineering-education/springboot-antmatchers
- https://levelup.gitconnected.com/learn-how-to-build-a-token-based-authentication-server-using-spring-boot-and-spring-security-14a82d186f88
- https://medium.com/wolox/securing-applications-with-jwt-spring-boot-da24d3d98f83
- https://medium.com/geekculture/spring-security-authentication-process-authentication-flow-behind-the-scenes-d56da63f04fa


![Screenshot 2024-07-11 at 10 19 09](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/8c034fdf-6d8f-4822-8630-5cff6e3fcea2)
/admin/* only matches /admin/xxx
/admin/** matches /admin

![Screenshot 2024-07-11 at 10 25 18](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0b750fbf-5c21-46cc-96e3-662510396f9b)


## OVERVIEW
<p>Spring Security by default actives both HTTP security filters and the Security Filter Chain and configures/enforces session-based basic authentication for all URLs.</p> 
<p>The Spring Security framework provides two options to set up authorization schema configuration: URL-based and Annotation-based.

* **AuthenticationManager** - works like a coordinator where authentication providers are registered.

* **AuthenticationProvider** - processes specific types of authentication.

* **UserDetailsService** - core interface that loads user-specific data in the Spring Security flow.

* **antMatcher()** - method used to configure URL access restrictions by using [ant patterns](https://ant.apache.org/manual/dirtasks.html#patterns) so that they are only invoked if the given pattern matches.

* **mvcMatcher()** - serves for the same purpose as antMatcher but is designed to apply precisely to what the Spring MVC @RequestMapping and related annotations understand, e.g. <code>"mvcMatcher(/hello)"</code> will also match <code>/hello</code> and <code>/hello/</code>, while with antMatcher() only the former will match.

## CORE CONCEPTS
* **Authentication** - refers to the process of verifying the identity of a user, based on provided credentials. A common example is entering a username and a password when you log in to a website. You can think of it as an answer to the question: _Who are you?_.

* **Authorization** - refers to the process of determining if a user has proper permission to perform a particular action or access particular data, assuming that the user is successfully authenticated. You can think of it as an answer to the question: _Can a user do/access this?_.

* **Principle** - refers to the currently authenticated user.

* **Granted Authority** - refers to the permission of the authenticated user.

* **Role** - refers to a group of permissions which the authenticated user have.

## NOTES
- Double wildcard pattern (`**`) will match **the current path (directory) and below**. For instance, the following rule will match `api/public`, `api/public/users`, `api/public/users/1` and so forth:
  ```java
  .mvcMatchers("/api/public/**")
  ```

- Single wildcard pattern (`*`) will match **the path under the specified directory and below**. For instance, the following rule will match `api/public/users`, `api/public/users/1` and so forth:
  ```java
  .mvcMatchers("/api/public/*")
  ```

- URL pattern definitions with role access association should be defined from most to less specific. For instance, in the following definition the pattern `/api/public/get` should be put ideally before `/api/public/**`:
  ```java
  .mvcMatchers("/api/public/**").hasRole(Roles.USER_ADMIN)
  .mvcMatchers("/api/public/get").hasRole(Roles.AUTHOR_ADMIN)
  ```
### PATTERN DEFINITION SCENARIOS
- Scenario #1<br>
  **Logged as**: AUTHOR_ADMIN<br>
  **Pattern:**
  ```java
  .antMatchers("/api/public/get").hasRole(Roles.AUTHOR_ADMIN)
  .antMatchers("/api/public/**").hasRole(Roles.USER_ADMIN)
  ```
  | Path              | Status |
  | :---------------- | :----: |
  | `/api/public`     | 403 |
  | `/api/public/get` | 200 | 

- Scenario #2<br>
  **Logged as**: AUTHOR_ADMIN<br>
  **Pattern:**
  ```java
  .antMatchers("/api/public/**").hasRole(Roles.USER_ADMIN)
  .antMatchers("/api/public/get").hasRole(Roles.AUTHOR_ADMIN)
  ```
  | Path              | Status |
  | :---------------- | :----: |
  | `/api/public`     | 403 |
  | `/api/public/get` | 403 |

- Scenario #3<br>
  **Logged as**: AUTHOR_ADMIN<br>
  **Pattern:**
  ```java
  .antMatchers("/api/public/*").hasRole(Roles.USER_ADMIN)
  .antMatchers("/api/public/get").hasRole(Roles.AUTHOR_ADMIN)
  ```
  | Path              | Status |
  | :---------------- | :----: |
  | `/api/public`     | 200 |
  | `/api/public/get` | 403 |

- Scenario #4<br>
  **Logged as**: AUTHOR_ADMIN<br>
  **Pattern:**
  ```java
  .antMatchers("/api/public/get").hasRole(Roles.AUTHOR_ADMIN)
  .antMatchers("/api/public/*").hasRole(Roles.USER_ADMIN)
  ```
  | Path              | Status |
  | :---------------- | :----: |
  | `/api/public`     | 200 |
  | `/api/public/get` | 200 |

<br>

## KEY ANNOTATIONS
[@EnableWebSecurity](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/config/annotation/web/configuration/EnableWebSecurity.html) - marks a @Configuration class as a source of web access security configuration. Usually such class extends the [WebSecurityConfigurerAdapter](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter.html) class and overrides its methods for a more granular configuration;

[@EnableGlobalMethodSecurity](https://docs.spring.io/spring-security/site/docs/5.6.0-M1/api/org/springframework/security/config/annotation/method/configuration/EnableGlobalMethodSecurity.html) / [@EnableMethodSecurity](https://docs.spring.io/spring-security/site/docs/5.6.0-M1/api/org/springframework/security/config/annotation/method/configuration/EnableMethodSecurity.html) - both are used to configure security on method level through annotations. They have the following attributes:
<ol>
<li><code>securedEnabled</code></li>
  <span>If set to true enables @Secured annotation. Default is false</span>
<li><code>jsr250Enabled</code></li>
  <span>If set to true enables @RolesAllowed annotation. Default is false</span>
<li><code>prePostEnabled</code></li>
  <span>If set to true enables @PreAuthorize, @PostAuthorize, @PreFilter, @PostFilter annotations. Default is false</span>
</ol>

[@PreAuthorize](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/access/prepost/PreAuthorize.html) - supports SpEL and is used to provide expression-based access control before executing the method;

[@PostAuthorize](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/access/prepost/PostAuthorize.html) - supports SpEL and is used to provide expression-based access control after executing the method and provides the ability to access/alter the method's result;

[@PreFilter](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/access/prepost/PreFilter.html) - supports SpEL and is used to filter the collection or arrays before executing the method based on custom security rules we define;

[@PostFilter](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/access/prepost/PostFilter.html) - supports SpEL and is used to filter the returned collection or arrays after executing the method based on custom security rules we define (provides the ability to access the method result);

[@Secured](https://docs.spring.io/spring-security/site/docs/3.2.8.RELEASE/apidocs/org/springframework/security/access/annotation/Secured.html) - does not support SpEL and is used to specify a list of roles which the logged user must have in order to access the annotated method;

[@RolesAllowed](https://javaee.github.io/javaee-spec/javadocs/javax/annotation/security/RolesAllowed.html) - does not support SpEL and is the [JSR-250](https://jcp.org/en/jsr/detail?id=250)’s equivalent annotation of the @Secured annotation;

[@WithMockUser](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/test/context/support/WithMockUser.html) - can be added to a test method to emulate running with a mocked user;

[@WithUserDetails](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/test/context/support/WithUserDetails.html) - can be added to a test to emulate a UserDetails instance which is returned from the UserDetailsService according to the given username;

[@WithAnonymousUser](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/test/context/support/WithAnonymousUser.html) - can be added to a test method to emulate running with an anonymous user. This is useful when a user wants to run a majority of tests as a specific user and override a few methods to be anonymous;

[@WithSecurityContext](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/test/context/support/WithSecurityContext.html) - determines what SecurityContext to use, and all three annotations described above are based on it. If we have a specific use case, we can create our own annotation that uses @WithSecurityContext to create any SecurityContext we want;
</br></br>


> Spring Securitt Filter Chain - 1

![Screenshot 2024-07-05 at 09 43 26](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d12537bf-bf27-447a-9aa7-22eb35cb5d77)

![Screenshot 2024-07-05 at 09 44 01](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d24be79d-b3db-4589-80fa-3c9acebb3e66)

![Screenshot 2024-07-05 at 09 44 47](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/17aece8e-2dd9-4786-941d-c86953ecfb5e)

> Spring Security Configuration

![Screenshot 2024-07-05 at 09 48 47](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/105877f5-715b-4d5d-b1ac-efed51e1778b)

![Screenshot 2024-07-05 at 09 50 23](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/dd6cd0bc-b7f6-4608-9e56-0818448261b0)

![Screenshot 2024-07-05 at 09 51 16](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/e69096de-d4fd-436e-982f-5fedf50f7562)

![Screenshot 2024-07-05 at 09 58 12](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/6ace7468-f946-4a79-aea5-82f91bca6f73)


> AuthenticationProvider & UserDetailsService
![Screenshot 2024-07-05 at 10 06 38](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/c58c8fbd-eb6d-403b-a007-84b24dac2ace)

![Screenshot 2024-07-05 at 10 07 04](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d18f126f-dcce-4cca-b256-8a5cd0666eb8)

![Screenshot 2024-07-05 at 10 08 21](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/c964d8ad-1596-4e52-8b32-f2535a937899)

![Screenshot 2024-07-05 at 10 09 45](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b31c544a-c36c-48cb-9a2a-5df0a5a08039)


![Screenshot 2024-07-05 at 10 10 13](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b708ae47-7c1a-4369-928f-36b9810917a6)


![Screenshot 2024-07-05 at 10 11 34](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/96d2f445-13da-4e56-95f9-ddc2d6ee50b5)



# 11. SPRING BOOT ACTUATOR <a id="11-spring-boot-actuator-" href="#11"></a>

## SAMPLE PROJECTS
- [spring-actuator](./spring-actuator/)
### REQUIRIMENT TO USE THE SAMPLE PROJECTS
- PostgreSQL
> 📌 To spin up a PostgreSQL instance by Docker, you can use the following command: <br> 
`docker run --name postgres-14.1 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 --rm -it postgres:14.1-alpine`

## REFERENCES
- https://www.baeldung.com/spring-actuators
- https://www.baeldung.com/spring-boot-health-indicators
- https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#
- https://lightrun.com/best-practices/getting-started-with-spring-actuator
- https://www.javadevjournal.com/spring-boot/spring-actuator-custom-endpoint
- https://dimitr.im/mastering-spring-boot-actuator

## OVERVIEW
Spring Boot Actuator provides resources so we can monitor and manage our application's health and availability. It is mainly used to expose operational information about the running application, such as health, metrics, info, dump, environment, loggers etc.

## BUILT-IN ENDPOINTS
By default, Spring Boot Actuator comes with all built-in endpoints disabled, except `/health`. A given endpoint is considered _available_ when it is both _enabled_ and _exposed_. Spring Boot Actuator's endpoints are exposed over REST endpoints and JMX.

Table of built-in endpoints provided out of the box:
| ENDPOINT            | DESCRIPTION |
| :------------------ | :---------- |
| `/auditevents`      | Returns audit event information for the current application |
| `/beans`            | Returns a complete list of all Spring beans in the current application |
| `/caches`           | Returns available caches |
| `/conditions`       | Returns a report of all conditions around autoconfiguration |
| `/configprops`      | Returns a grouped list of all @ConfigurationProperties |
| `/env`              | Returns the current environment properties from Spring’s ConfigurableEnvironment |
| `/health`           | Returns application health information |
| `/httptrace`        | Returns HTTP trace informations (last 100 HTTP request-response exchanges by default) |
| `/info`             | Returns arbitrary application information |
| `/integrationgraph` | Returns the Spring integration graph. Requires a spring-integration-core dependency |
| `/loggers`          | Returns the configuration of all loggers in the application. Can be used to modify at run time a logger level |
| `/metrics`          | Returns metrics information for the current app |
| `/mappings`         | Returns a grouped list of all your application's APIs |
| `/scheduledtasks`   | Returns the tasks scheduled in your application |
| `/sessions`         | Returns retrieval and deletion of user sessions from a Spring Session supported session store. Requires a Servlet-based web application using Spring Session |
| `/shutdown`         | Disables the application. It is not enabled by default (To enable `management.endpoint.shutdown.enabled=true`)|
| `/startup`          | Returns the startup step data collected by ApplicationStartup |
| `/threaddump`       | Performs a thread dump |


## INFO ENDPOINT
To expose custom information on `/actuator/info` we should set them as property entries starting with `info.*` at `application.yml` or `application.properties`. Also, it's required to set `management.info.env.enabled` to `true` because the Spring Actuator's `InfoContributor` is disabled by default.
> 📌 The `/info` endpoint comes disable by default. To enable it we have to set the property `management.endpoints.web.exposure.include` including it as entry.

### GIT & BUILD INFORMATION
To get git and build details returned on `/actuator/info`, we have to add the following to the plugin section:
```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>    
    <executions>
        <execution>
            <goals>
                <goal>build-info</goal>
            </goals>
        </execution>
    </executions>
</plugin>
<plugin>
    <groupId>pl.project13.maven</groupId>
    <artifactId>git-commit-id-plugin</artifactId>
</plugin>
```

## HEALTH ENDPOINT
### HEALTH INDICATOR
Health indicators can used to report the healthiness and availability of inner components as well as third-party services required for the application. Spring Boot Actuator comes with predefined health indicators which provide specific status. Such built-in indicators are: [DiskSpaceHealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/system/DiskSpaceHealthIndicator.html), [PingHealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/health/PingHealthIndicator.html), [LivenessStateHealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/availability/LivenessStateHealthIndicator.html) and [ReadinessStateHealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/availability/ReadinessStateHealthIndicator.html). Some health indicators are registered and added automatically according to the existence of specific dependencies on the classpath or when other conditions are satisfied. For instance, [DataSourceHealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/jdbc/DataSourceHealthIndicator.html will be available if any relational database driver dependency is found; [RedisHealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/redis/RedisHealthIndicator.html) will be available if the Redis dependency module is found on the classpath.

Table of Health Indicators provided out of the box:
| HEALTH INDICATOR                 | ENDPOINT |
| :------------------------------- | :------- |
| CassandraHealthIndicator         | `/actuator/health/cassandra` |
| CouchbaseHealthIndicator         | `/actuator/health/couchbase` |
| DataSourceHealthIndicator        | `/actuator/health/db` |
| DiskSpaceHealthIndicator         | `/actuator/health/diskSpace` |
| ElasticsearchRestHealthIndicator | `/actuator/health/elasticsearch` |
| HazelcastHealthIndicator         | `/actuator/health/hazelcast` |
| InfluxDbHealthIndicator          | `/actuator/health/influx` |
| JmsHealthIndicator               | `/actuator/health/jms` |
| LdapHealthIndicator              | `/actuator/health/ldap` |
| LivenessStateHealthIndicator     | `/actuator/health/liveliness` |
| MailHealthIndicator              | `/actuator/health/mail` |
| MongoHealthIndicator             | `/actuator/health/mongo` |
| Neo4jHealthIndicator             | `/actuator/health/neo4j` |
| PingHealthIndicator              | `/actuator/health/ping` |
| RabbitHealthIndicator            | `/actuator/health/rabbit` |
| ReadinessStateHealthIndicator    | `/actuator/health/readiness` |
| RedisHealthIndicator             | `/actuator/health/readiness` |
| SolrHealthIndicator              | `/actuator/health/solr` |


The Liveness and Readiness HTTP probe statuses are returned by default on `/actuator/health` for applications running on Kubernetes. To enable them to be exposed otherwise we have to set the property `management.health.probes.enabled` to `true`.

By default `/actuator/health` does not return detailed informations about the available indicators. To get them exposed, we have to set both properties `management.endpoint.health.show-components` and `management.endpoint.health.show-details` to `always`.

By default there are four types of health status: `UP`, `DOWN`, `OUT_OF_SERVICE` and `UNKNOWN`, and for each there is a corresponding associated HTTP code.
| STATUS         | HTTP_CODE  | MEANING |
| :------------- | :--------: | :------ |
| UP             | 200        | The component or subsystem is functioning as expected |
| DOWN           | 503        | The component or subsystem has suffered an unexpected failure |
| OUT_OF_SERVICE | 503        | The component or subsystem has been taken out of service and should not be used |
| UNKNOWN        | 200        | The component or subsystem is in an unknown state |

The application's **overall status** is an aggregation of all health indicators statuses, i.e. from all built-in (db, diskSpace, ping, livenessState, readiness etc) and custom health indicators. If one of them is in failure or unknown state, _the root status will be reported as DOWN_.

### CUSTOM HEALTH INDICATORS
To register a custom health indicator we have to create a @Component class that implements the [HealthIndicator](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/health/HealthIndicator.html) interface and overrides the `health()` method.

To generate a composite health check indicator in order to combine many indicators we have to create a @Component class that implements the [CompositeHealthContributor](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/health/CompositeHealthContributor.html) interface; mark each of the contributing health indicators with the [HealthContributor](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/health/HealthContributor.html) interface; and override the `iterator()` method in the CompositeHealthContributor implementation component class with the list of health contributors (component class that implements HealthContributor)

## METRICS
The Spring Actuator exposes the `/actuator/metrics` endpoint which returns performance and operational measurements. To collect and gather metrics Spring Actuator relies on the [Micrometer](https://micrometer.io/) framework, which acts as a facade – an intermediate layer – between the application and some of the more popular monitoring tools, like Prometheus, Elastic, DataDog, Dynatrace etc.

### METRIC TYPES
#### COUNTERS
A [Counter](https://javadoc.io/doc/io.micrometer/micrometer-core/latest/io/micrometer/core/instrument/Counter.html) represents a value that will always get incremented. It is applicable to measure a number of events or actions that is supposed to only increases, and never decreases.

#### GAUGES
A [Gauge](https://javadoc.io/doc/io.micrometer/micrometer-core/latest/io/micrometer/core/instrument/Gauge.html) represents a value that may go up or down, and that have fixed upper bounds.

#### TIMERS
A [Timer](https://javadoc.io/doc/io.micrometer/micrometer-core/latest/io/micrometer/core/instrument/Timer.html) is used to track how long certain method, action or request takes to execute.


## LOGGER ENDPOINT
Spring Actuator provides the `/actuator/loggers` endpoint which returns all the loggers, and their configured log levels, existing in the application. To check details for an individual logger we access the endpoint http://localhost:8081/actuator/loggers/{logger.name}, where `{logger.name}` should be the name of the desired logger. For instance, http://localhost:8081/actuator/loggers/io.davidarchanjo would output the following:
```json
{
  "configuredLevel": "null",
  "effectiveLevel": "INFO"
}
```

### CHANGING LOGGING LEVEL
Spring Actuator also provides a way to change the current log level at run time. To change we issue a POST request specificing the logger with the desired new log level. For instance, to set the log level to `TRACE` of the package `io.davidarchanjo` the request goes as below:
```shell
$ curl -X POST \
  localhost:8081/actuator/loggers/io.davidarchanjo \
  -H 'content-type: application/json' \
  -d '{"configuredLevel":"TRACE"}'
```


## KEY ANNOTATIONS
[@Endpoint](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/endpoint/annotation/Endpoint.html) - used to indicate a type as being an actuator endpoint that provides information about the running application;

[@RestControllerEndpoint](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/endpoint/web/annotation/RestControllerEndpoint.html) - used to indicate a type as being a REST endpoint that is only exposed over Spring MVC or Spring WebFlux;

[@Selector](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/endpoint/annotation/Selector.html) - works like @PathVariable annotation by binding a named URI actuator endpoint path parameter into an argument;

[@ReadOperation](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/endpoint/annotation/ReadOperation.html) – used to indicate a method on an @Endpoint component class as read operation (HTTP GET accessible);

[@WriteOperation](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/endpoint/annotation/WriteOperation.html) – used to indicate a method on an @Endpoint component class as write operation (HTTP POST accessible);

[@DeleteOperation](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/actuate/endpoint/annotation/DeleteOperation.html) – used to indicate a method on an @Endpoint component class as delete operation (HTTP DELETE accessible);
</br></br>


# 12. SPRING BOOT TESTING <a id="12-spring-boot-testing-" href="#12"></a>
## SAMPLE PROJECTS
- [spring-testing](./spring-testing/)
## REFERENCES
- https://spring.io/guides/gs/testing-web/
- https://howtodoinjava.com/spring-boot2/testing/springboot-test-configuration/
- https://howtodoinjava.com/spring-boot2/testing/junit5-with-spring-boot2/
- https://newbedev.com/unit-test-or-integration-test-in-spring-boot
- https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html
- https://reflectoring.io/spring-boot-test/
- https://rieckpil.de/spring-boot-unit-and-integration-testing-overview/
- https://rieckpil.de/spring-boot-test-slices-overview-and-usage/
- https://rieckpil.de/guide-to-springboottest-for-spring-boot-integration-tests/
- https://rieckpil.de/difference-between-mock-and-mockbean-spring-boot-applications/
- https://rieckpil.de/fix-no-qualifying-spring-bean-error-for-spring-boot-tests/

## KEY ANNOTATIONS
[@ExtendWith](https://junit.org/junit5/docs/5.0.3/api/org/junit/jupiter/api/extension/ExtendWith.html) - JUnit annotation that is used to register extensions for the annotated test class or test method. [Prior to Spring 2.1 release](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.1-Release-Notes#junit-5), `@ExtendWith(SpringExtension.class)` was necessary to be specified at the test class-level in order to enable Spring support, but as of then is no longer needed because it is included as a meta annotation in the Spring Boot test annotations like @DataJpaTest, @WebMvcTest, and @SpringBootTest.

[@SpringBootTest](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/SpringBootTest.html) - used to bootstrap a complete application context for testing. @SpringBootTest by default starts searching in the current package of the annotated test class and then searches upwards through the package structure, looking for a class annotated with @SpringBootConfiguration from which it reads the configuration to create an application context. This class is usually the main application class since the @SpringBootApplication annotation includes the @SpringBootConfiguration annotation. It then creates an application context very similar to the one that would be started in a production environment.

[@ContextConfiguration](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/context/ContextConfiguration.html) - used to load <ins>component classes</ins><a href="#note1" id="note1ref"><sup>1</sup></a> in order to configure an ApplicationContext for integration test.

[@WebMvcTest](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/autoconfigure/web/servlet/WebMvcTest.html) - used to set up an application context with just enough components and configurations required to test the **Web MVC Controller Layer**. It disables full auto-configuration and instead apply only configuration relevant to MVC tests.

[@DataJpaTest](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/autoconfigure/orm/jpa/DataJpaTest.html) - used to set up an application context specificaly to test the **Persistence Layer**, by configuring entities, repositories. @DataJpaTest by default autoconfigures an in-memory/embedded database like H2.

[@Commit](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/annotation/Commit.html) - *test annotation* used to indicate that changes performed on database from a test method should be committed before it ends. When used at class-level, all test methods will commit changes to the database.

[@Rollback](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/annotation/Rollback.html) - *test annotation* used to indicate that changes performed on database from a test method should be roll backed before it ends. When used at class-level, all test methods will behave in that way.

[@TestConfiguration](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/TestConfiguration.html) - used to define additional beans or override existing beans in the Spring application context in order to add specialized configuration for testing. Configuration classes annotated with @TestConfiguration are excluded from component scanning. Configuration classes with bean definition annotated with @TestConfiguration can be imported by @Import or declared as static inner classes. It is required to set the property <code>spring.main.allow-bean-definition-overriding=true</code> in order to enable bean overriding feature during testing.

[@MockBean](https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/mock/mockito/MockBean.html) - part of the Spring Test Framework and used to create mocks for beans whenever running tests targeted to the _Spring Test context_ (i.e. testing with @SpringBootTest, @WebMvcTest, @DataJpaTest and so on).

[@Mock](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html) - part of the [Mockito Framework](https://site.mockito.org) and used to create a mock for a class or interface. It is a shorhand for the <code>Mockito.mock()</code>.

[@InjectMocks](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/InjectMocks.html) - part of the [Mockito Framework](https://site.mockito.org) and used to create a mock for the marked field and injects all dependencies annotated with @Mock into it.

## NOTES
### @SpringBootTest vs @ContextConfiguration
- Even though both can be used to specify how to load an application context in integration test, @ContextConfiguration doesn’t take full advantage of Spring Boot features, like logging or additional property loading.

### @MockBean vs @Mock
- For any test that doesn’t need any dependencies from the Spring Boot container (application context), @Mock should be used as it is fast and favours the isolation of the tested component;
- If a test relies on the Spring Boot container (application context) and it's also needed to add or mock one of the container beans, @MockBean should be used;
- As a rule of thumb, @Mock should be used when testing services components where business logic are implemented, and @MockBean should be used when doing sliced context testing like on the controller (@WebMvcTest) or repository (@DataJpaTest) layer, or when running backed Spring context tests (@SpringBootTest).
</br></br>


# 13. BUILD & TEST <a id="13-build-test-" href="#13"></a>
### BUILD ALL PROJECTS
```shell
$ ./mvnw package
```

### BUILD ALL PROJECTS SKIPPING TEST
```shell
$ ./mvnw package -DskipTests
```

### BUILD INDIVIDUAL PROJECT
```shell
$ ./mvnw package -pl spring-crud
```

### BUILD INDIVIDUAL PROJECT SKIPPING TEST
```shell
$ ./mvnw package -DskipTests -pl spring-crud
```

### RUN INDIVIDUAL PROJECT
- Option 1:
```shell
$ ./mvnw spring-boot:run -pl spring-crud
```
- Option 2:
```shell
$ java -jar spring-crud/target/spring-crud-0.0.1.jar
```

### RUN ALL PROJECTS TEST
```shell
$ ./mvnw test
```

### RUN INDIVIDUAL PROJECT TEST
```shell
$ ./mvnw test -pl spring-crud
```

### RUN SINGLE TEST CLASS FROM INDIVIDUAL PROJECT
```shell
$ ./mvnw test -pl spring-crud -Dtest=io.davidarchanjo.controller.ToDoControllerTest
```

### RUN SINGLE TEST METHOD FROM A TEST CLASS OF AN INDIVIDUAL PROJECT
```shell
$ ./mvnw test -pl spring-crud -Dtest=io.davidarchanjo.controller.ToDoControllerTest#shouldCreateNewToDo_WithSuccess
```
</br></br>


<a id="note1" href="#note1ref"><sup>1</sup></a> <ins>component classes</ins> - is any class annotated with @Configuration or @Component (including any of its stereotype like @Service, @Repository etc) as well as any JSR-330 compliant class that is annotated with javax.inject annotations.



- Stereotype annotations (org.springframework.stereotype):

1. @Component:

a. @Service (Service classes)

b. @Repository (Data access classes)

c. @Controller (Web classes, Spring MVS)

d. @RestController (Rest WebService, json, xml)


![Screenshot 2024-05-13 at 14 48 10](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/a26c7e95-993f-4643-be05-698e179055be)

13. Spring Container

a. Bean Lifecycle  Initialization -> Usage -> Destruction
- Initialization - when a context is created, the initialiation phaze completed
 ```
    ApplicationContext context = SpringApplication.run(AppConfig.class);
 ```
> 📌 STEP A: Load & Process Bean Definitions

![Screenshot 2024-05-14 at 08 23 37](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/592f99f3-e2cb-4bf2-b8b1-48a319dc9217)
![Screenshot 2024-05-14 at 08 28 41](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/16db11e2-2939-4416-a9af-9717cb9a99cf)

ApplicationContect is a BeanFactory 

- BeanFactoryPostProcessor
![Screenshot 2024-05-14 at 08 33 34](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/c308163c-20b7-4226-b0b5-8e9f39573c7a)

![Screenshot 2024-05-14 at 08 34 35](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/c07212d2-937e-443d-bd2b-561ffe28dcba)

![Screenshot 2024-05-14 at 08 36 56](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/cd72e14b-020f-488e-b227-366cd87475a9)

![Screenshot 2024-05-14 at 08 37 10](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/9368314f-14d0-45a7-b4b7-6bbab86816fd)

> 📌 STEP B: Perform Bean Creation

![Screenshot 2024-05-14 at 08 12 46](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b07bdd77-dbc6-4606-805c-b68de7c6aa15)

![Screenshot 2024-05-14 at 08 44 16](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/e2915592-050a-4a68-9323-63e0e7c25d43)

![Screenshot 2024-05-14 at 08 46 02](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/83431d96-7ae5-48fc-86f3-63c7a25a4299)

![Screenshot 2024-05-14 at 08 46 39](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/4f6ec81d-746b-4c68-bc8d-caf89c51fc10)


> 📌 STEP C: The Use Phase of Created Beans

When you invoke a bean obtained from the context

ApplicationContext context = // get it from somewhere
TransferService service = context.getBean("transferService", TransferService.class);
// use it
service.transfer();

Spring can decide to wrap a component in a proxy (transaction, security, exception handling). It is done by a BeanPostProcessor. 

![Screenshot 2024-05-14 at 08 54 57](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0e1225d7-7f7c-4293-8fff-249b1e70ccd8)

![Screenshot 2024-05-14 at 08 58 28](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/61c6633b-79fb-4690-b77d-779fabdee6e7)



**JDBC**

> 📌 JdbcTemplate (template design pattern)
> JdbcTemplate template = new JdbcTemplate(dataSource);

![Screenshot 2024-05-21 at 09 14 04](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/18740895-ae86-47ee-ace9-dd0be507b2c3)

![Screenshot 2024-05-21 at 09 15 54](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/a0ee8e2d-ab20-4120-8def-f71c8b847891)

![Screenshot 2024-05-21 at 09 16 07](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/58542c6f-2559-49f8-a285-ea0567fa305b)

![Screenshot 2024-05-21 at 09 27 24](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/60b0b076-0a56-4a4d-bcd1-9b0c68dd877a)

![Screenshot 2024-05-21 at 09 55 24](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7c498c55-1fc9-4291-a174-772c6f1a5744)




Spring Boot - SPring DATA JPA

org.springframework.boot.spring-boot-starter-data-jpa
- spring-boot-starter.jar
- spring-boot-starter-jdbc.jar
- spring-boot-starter-aop.jar
- spring-data-jpa.jar
- hibernate-core
- javax.transaction-api

If JPA is on calsspath, SPring Bootw automatically 
- auto-configures a DataSource
- auto-configures an EntityManagerFactoryBean
- auto-configures a JpaTransactionManager
<img width="869" alt="Screenshot 2024-06-17 at 11 11 29" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/9b53a7d5-f3fd-4032-ad8e-63d91e1a7eaf">

<img width="1218" alt="Screenshot 2024-06-17 at 11 14 56" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/1f9db96b-52c0-44f7-a5a2-41098492b002">

<img width="860" alt="Screenshot 2024-06-17 at 11 18 00" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/7937185e-3cf9-408f-b348-d3e1d1055905">


<img width="867" alt="Screenshot 2024-06-17 at 11 21 55" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/332478d0-2389-4904-84c4-5f8e920b597e">
T - type od data

K - type of primary key


<img width="1225" alt="Screenshot 2024-06-17 at 11 23 10" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/f0d45034-ed07-4201-b515-cafe745ee17f">

<img width="1217" alt="Screenshot 2024-06-17 at 11 24 27" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/15484b76-f883-4090-93a5-f40fe3bb8c7e">

<img width="1224" alt="Screenshot 2024-06-17 at 11 25 20" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/feb394c3-c249-42b1-8282-174bc7ad47a7">

<img width="1214" alt="Screenshot 2024-06-17 at 11 25 55" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/227481ab-fe7a-4753-badc-0cf437bd2a14">


<img width="1208" alt="Screenshot 2024-06-17 at 11 28 47" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/3a6cc9ed-1634-4921-98b6-0a0f97a65682">

<img width="1219" alt="Screenshot 2024-06-17 at 12 08 37" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/76fae9b0-80f6-4a7e-afb2-588077ceb430">

<img width="1199" alt="Screenshot 2024-06-19 at 08 55 35" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/da7538de-6509-4643-b773-75c99923db0e">

<img width="871" alt="Screenshot 2024-06-19 at 08 56 25" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d117178a-1f0d-4164-8644-0792ff614855">

<img width="1211" alt="Screenshot 2024-06-19 at 08 57 57" src="https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/62b46741-4a1b-4a31-965f-1e1787f76431">


    @Entity - Marks class as a JPA persistent class.
    
    @Table - Specifies the exact table name to use on the DB (would be "Account" if unspecified).
    
    @Id - Indicates the field to use as the primary key on the database.
    
    @Column - Identifies column-level customization, such as the exact name of the column on the table.
    
    @OneToMany - Identifies the field on the 'one' side of a one to many relationship.
    
    @JoinColumn - Identifies the column on the 'many' table containing the column to be used when joining. Usually a foreign key.




** Spring Boot Testing Framework **
-------------------------------


![Screenshot 2024-07-03 at 08 51 59](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/b5c2ef77-2ebd-490c-bab4-406a8a5784ae)
![Screenshot 2024-07-03 at 08 55 45](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/fd4c92f7-a498-47f4-a550-c4b7e9db9c14)

- @SpringBootTest
- @WebMvcTest - bootstrap web layer
- @WebFluxTest
- @DataJpaTest
- @DataJdbcTest
- @JdbcTest
- @DataMongoTest
- @DataRedisTest
- @MockBean


# spring-boot-starter-test

- JUnit: JUnit 5 is default for Spring Boot 2.2
- Spring Test & Spring Boot Test: Testing annotations
- AssertJ: Afluent assertion library
- Hamcrest: a library of matcher
- Mockito: A java mocking framework
- JSONNassert: An assertion library for JSON
- JsonPath: XPath for JSON

# Integration Testing with @SpringBootTest
![Screenshot 2024-07-03 at 09 01 57](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/5dc97255-c639-461d-ada8-a4760ae08ac1)

![Screenshot 2024-07-03 at 09 04 39](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/3c98f76b-f906-414a-afae-0b104241cbca)

![Screenshot 2024-07-03 at 09 47 06](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/5d5b1c2d-6107-4c1b-b6ae-479397f049ed)

![Screenshot 2024-07-03 at 09 50 50](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/fdc065b4-6da8-4117-8fed-26ca78b4fdca)

![Screenshot 2024-07-03 at 09 52 02](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/29e56e5d-5f72-4157-9e48-4dd04a5b1ebb)

![Screenshot 2024-07-03 at 09 52 54](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/03cd7d1f-352a-4741-8dfd-af23dc678175)

![Screenshot 2024-07-03 at 09 55 38](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/2111c037-38e6-451e-a08b-b77e6ed2fc73)

![Screenshot 2024-07-03 at 09 56 16](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/481d88b6-49d1-4891-a7da-4df53d07f235)

![Screenshot 2024-07-03 at 09 56 43](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/d9d00499-96f3-42b0-8b60-cdf09d7fea86)

![Screenshot 2024-07-03 at 09 57 17](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/efb19f06-a493-4192-b711-0578ebf68b5c)

![Screenshot 2024-07-03 at 09 58 12](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/79ff9edf-6d7f-4e64-a4cd-1531b83b10af)

- @AutoConfigureMockMvc 
- @Autowired
  MockMvc mockMvc

  It does not start embedded Server container.  



# "Slice" Testing

![Screenshot 2024-07-03 at 10 25 40](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/e7340b46-eadc-4a85-9f8b-f1f0db48494d)
- @WebMvcTest
- @MockBean - from Spring Boot Framework, use it when Spring context is needed
- @Mock - from Mock Framework, use it when Spring context is not needed


![Screenshot 2024-07-03 at 10 31 39](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/6b8a23f4-546b-4454-a46e-e196156431b5)

![Screenshot 2024-07-03 at 10 36 04](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/4369cc1f-f9b8-4d44-b740-142eb2ddf231)

![Screenshot 2024-07-03 at 10 39 39](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/1a6c27b8-a8cb-4cb4-92a6-8301f3f8df12)


# Repository Slice Testing with @DataJpaTest
--------

![Screenshot 2024-07-03 at 10 42 50](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/0adc01ab-7937-4b45-acbb-a4958216de2c)


----

SpringBootTest bootstrap the whole context, embedded server is being started. 
```
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
```
```
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
```


![Screenshot 2024-07-03 at 11 35 27](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/ee3541eb-6fb7-4c20-934e-804d2aee54ee)

![Screenshot 2024-07-03 at 11 35 39](https://github.com/codesampleStore/spring-certified-developer-study-guide/assets/65254124/9ce43db1-4045-4490-9372-00f61dff4f66)



