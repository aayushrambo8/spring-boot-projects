# Spring Boot Projects

A curated collection of Spring Boot applications, services, and demo projects.

---

## Projects Directory

Below is the list of projects currently in this repository, along with their description and technologies used.

| Project Name | Description | Tech Stack |
| :--- | :--- | :--- |
| **[Demo](./Demo)** | A starter Spring Boot Web application featuring a simple REST controller, now with database connectivity dependencies. | Java 23, Spring Boot 4.1.0, MySQL, Hibernate Core, Maven |
| **[Spring Boot Demo](./Spring%20Boot%20Demo)** | A core Spring Framework project demonstrating IoC Container and Dependency Injection using annotation configuration. | Java 23, Spring Framework 7.0.7, Maven |
| **[Circular Dependancy](./Circular%20Dependancy)** | A core Spring Framework project demonstrating circular dependency behaviors and resolution. | Java 23, Spring Framework 7.0.7, Maven |
| **[Bean Scopes](./Bean%20Scopes)** | A core Spring Framework project demonstrating bean scopes (Singleton and Prototype) and their lifecycles. | Java 23, Spring Framework 7.0.7, Maven |
| **[Bean Initialization](./Bean%20Initialization)** | A core Spring Framework project demonstrating eager vs. lazy bean initialization and scanning behavior. | Java 23, Spring Framework 7.0.7, Maven |
| **[Application Properties](./Application%20Properties)** | A Spring Boot project demonstrating typed external configuration properties binding using `@ConfigurationProperties`. | Java 21, Spring Boot 4.1.0, Maven |
| **[Bean Lifecycle](./Bean%20Lifecycle)** | A core Spring Framework project exploring bean configuration and lifecycles in the IoC container. | Java 23, Spring Framework 7.0.7, Maven |

---

## Project Overview

### 📂 [Demo](./Demo)
A baseline Spring Boot application containing a `HelloController` endpoint to verify configuration.
- **Key Features**:
  - Simple REST controller testing setup.
  - REST Endpoints:
    - `GET /hello`: Returns an HTML greeting (`<h1>Hello World!</h1>`).
  - Maven wrapper configured.
  - Individual project `.gitignore`.
  - Upgraded to Java 23.
  - Added MySQL Connector/J and Hibernate ORM dependency configurations.

### 📂 [Spring Boot Demo](./Spring%20Boot%20Demo)
A core Spring application showcasing bean configuration, dependency injection, and component scanning.
- **Key Features**:
  - Pure Spring IoC Container demonstration using `AnnotationConfigApplicationContext`.
  - Component scanning configured via `@ComponentScan` on `@Configuration` class (`AppConfig`).
  - Simple service injection (`OrderService` and `PaymentService`).
  - Running on Java 23 and Spring Framework 7.0.7.

### 📂 [Circular Dependancy](./Circular%20Dependancy)
A core Spring application demonstrating circular dependency behaviors and how the Spring container handles field-based vs. constructor-based dependency injection.
- **Key Features**:
  - Simple IoC container setup with `@Configuration` class (`AppConfig`).
  - Demonstrate components (`OrderService` and `PaymentService`) referencing each other.
  - Showcases field injection behavior for circular dependencies.
  - Running on Java 23 and Spring Framework 7.0.7.

### 📂 [Bean Scopes](./Bean%20Scopes)
A core Spring application showcasing Spring bean scopes (Singleton, Prototype, etc.) and lifecycle callbacks.
- **Key Features**:
  - Core Spring Context setup using `AnnotationConfigApplicationContext` and `@ComponentScan`.
  - Constructor injection demonstration with components `A` and `B` dependency on `OrderService`.
  - Demonstration of prototype bean scope by configuring `OrderService` with `@Scope("prototype")` and requesting multiple instances in `Main`.
  - Console logging during bean creation to observe bean lifecycle and scope behaviors.
  - Configured for Java 23 and Spring Framework 7.0.7.

### 📂 [Bean Initialization](./Bean%20Initialization)
A core Spring application demonstrating Spring bean instantiation sequence, component scanning, and lazy bean initialization behavior.
- **Key Features**:
  - Core Spring Context setup using `AnnotationConfigApplicationContext` and `@ComponentScan`.
  - Demonstrates lazy bean instantiation by configuring `PaymentService` with the `@Lazy` annotation.
  - Demonstrates how manual creation of a component (`new PaymentService()`) inside the constructor of an eager bean (`OrderService`) affects initialization logs.
  - Console logging inside constructors to verify the exact initialization sequence.
  - Running on Java 23 and Spring Framework 7.0.7.
- **Expected Console Output**:
  ```text
  PaymentService created
  OrderService created
  ```

### 📂 [Application Properties](./Application%20Properties)
A Spring Boot application demonstrating external configuration properties binding using `@ConfigurationProperties` and dependency injection.
- **Key Features**:
  - Configuration properties class (`PaymentProperties`) bound to the prefix `payment-properties` using `@ConfigurationProperties`.
  - Spring-managed component (`PaymentGateway`) wrapping and exposing the configuration properties.
  - Setup using `@SpringBootApplication` and running on Java 21 and Spring Boot 4.1.0.

### 📂 [Bean Lifecycle](./Bean%20Lifecycle)
A core Spring application showcasing bean configuration, scanning, and instantiation behavior.
- **Key Features**:
  - Core Spring Context bootstrap using `AnnotationConfigApplicationContext`.
  - Component scanning configured via `@ComponentScan` on `AppConfig`.
  - Running on Java 23 and Spring Framework 7.0.7.


---

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/aayushrambo8/spring-boot-projects.git
   ```
2. Navigate to the specific project directory you want to run:
   ```bash
   cd Demo
   ```
3. Run the application using the Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
