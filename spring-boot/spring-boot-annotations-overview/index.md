## Spring Boot Stereotype Annotation: 

- Component
- Controller
- Repository
- Service

## Spring Web MVC annotation (web.bind.annotation)

- GetMapping
- PostMapping
- PutMapping 
- DeleteMapping
- PatchMapping
- PathVariable
- RequestAttribute
- RequestBody
- ResponseBody
- RestController
- ResponseStatus
- CrossOrigin 
- CookieValue
- ExceptionHandler 

## Spring Boot Annotation

- EnableAutoConfiguration
- ComponentScan
- SpringBootApplication

## Spring Framework Factory type annotation

- Autowired (Inject in Jakarta type)
- Required 
- Bean
- Value



**Explanations:**

***Stereotype Annotation***

- Component: @Component is a general-purpose stereotype annotation that is used to annotate classes that you want to register as beans in the Spring container. When you annotate a class with @Component, it becomes a candidate for Spring's component scanning process, and Spring will automatically create a bean for it and manage its lifecycle.

- Service: The @Service annotation is used to annotate a service class, which typically contains the business logic of the application. It serves as a specialization of @Component, allowing Spring to automatically detect it during component scanning. It is also part of the business layer of the application.

- Controller: The @Controller annotation is used to mark a class as a Spring MVC controller, which is responsible for processing incoming web requests, handling user input, and returning appropriate views or data as responses. It is different from @RestController annotation that is used to build restful json/xml apis.

- Repository: The @Repository annotation is used to mark a class as a repository that interacts with the database or any other data source. It helps Spring identify the class as a Data Access Object (DAO)


***Web MVC Annotations***

- RequestMapping: The @RequestMapping annotation in Spring is a versatile annotation used to map HTTP requests to handler methods in controller classes. It can handle various HTTP methods (GET, POST, PUT, DELETE, etc.) and provides more granular control over request handling. When used to handle HTTP GET requests specifically, it is equivalent to @GetMapping. It can be used both method and class level.


- GetMapping: @GetMapping is used to map HTTP GET requests onto specific handler methods in controller classes. It is a convenient way to create RESTful endpoints that handle data retrieval. @GetMapping is a simplest form of RequestMapping(RequestMethod.GET).

- PostMapping: @PostMapping annotation is used to handle HTTP post requests and create resources in certain endpoints. It is commonly used in RESTful web services to define endpoints that handle data creation, form submissions, and other operations where data is sent to the server in the request body.

- PutMapping: Shortcut approach of @RequestMapping(url, RequestMethod.PUT) and used to update existing resources of the application. Also note, it is usually used in the method level for updating existing resources.

- DeleteMapping: In order to delete existing resources from the application we can use @DeleteMapping annotation in Spring Boot. It is a shorthand approach of RequestMapping(url, RequestMethod.DELETE) and more delegant approach. Also note that, it is usually used in the method level of the controller class to delete a certain resource based on Id.

- PatchMapping: The @PatchMapping annotation in Spring is used to handle HTTP PATCH requests. It is a specialized version of the @RequestMapping annotation that provides a convenient way to define endpoints for partial updates to resources. This annotation is commonly used in RESTful web services to update part of a resource rather than replacing it entirely, which is the primary use case for PUT requests.

- PathVariable: @PathVariable is used to bind a method parameter to a URI template variable. It is typically used in conjunction with path variable placeholders in the URL pattern defined by annotations like @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, and @RequestMapping. In the URL pattern, path variables are indicated by curly braces {`{}`}. For example, {`/users/{id}`} has a path variable {`{id}`}

- RequestBody: The @RequestBody annotation in Spring is used to bind the body of an HTTP request to a method parameter in a controller. This is particularly useful in RESTful web services when you need to handle data sent in the body of a POST, PUT, or PATCH request, typically in formats like JSON or XML. @RequestBody is essential for building RESTful APIs and handling incoming data in Spring applications. At the same time, it can be used with the ResponseEntity to provide more control over HTTP responses.

- CrossOrigin: @CrossOrigin is used to specify which domains are allowed to access resources on your server. This is crucial for web applications that need to interact with APIs hosted on different domains. It helps to enable **Cross-Origin** Resource Sharing (CORS) for specific controller methods or entire controllers. CORS is a mechanism that allows resources on a web server to be requested from a different domain than the one that served the original web page.

- ExceptionHandler: The @ExceptionHandler annotation in Spring is used to handle exceptions that occur during the execution of controller methods. It provides a way to centralize error handling and return custom error responses for different types of exceptions.

- SpringBootApplication: The @SpringBootApplication annotation is a key component in Spring Boot applications. It serves as a convenience annotation that combines several important annotations to simplify the setup of a Spring Boot application. Such as,

    - @SpringBootConfiguration: This is a specialization of @Configuration that marks the class as a source of bean definitions. It tells Spring that the class contains configuration for the application.

    - @EnableAutoConfiguration: This annotation tells Spring Boot to automatically configure your application based on the dependencies present on the classpath. It enables Spring Boot’s auto-configuration feature, which attempts to automatically configure your application based on various factors, such as available libraries.

    - @ComponentScan: This annotation tells Spring to scan for components, configurations, and services in the package where the application class is located and its sub-packages. This is how Spring Boot finds your components, services, and other beans.


- Required: In Spring and Spring Boot, required is a parameter used in various contexts to indicate whether a particular dependency or configuration is mandatory or optional.

- Autowired: The @Autowired annotation in Spring is used for automatic dependency injection. It allows Spring to resolve and inject collaborating beans into your bean at runtime. This is part of Spring’s Inversion of Control (IoC) mechanism, which helps in creating loosely coupled and more maintainable code.

- Bean: A bean is an object that is managed by the Spring IoC (Inversion of Control) container. Beans are fundamental building blocks of a Spring application and are created, configured, and managed by the Spring framework. Here, the @Component annotation and its specialized forms (@Service, @Repository, and @Controller) are used to define beans in a Spring application. So, the @Bean annotation in Spring is used to define a bean explicitly within a Spring configuration class.

- Value: The @Value annotation in Spring is used to inject values into fields, methods, or constructor parameters from various sources such as properties files, environment variables, or system properties. It helps in externalizing configuration and managing application settings.