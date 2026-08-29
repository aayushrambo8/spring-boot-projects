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
| **[Bean Lifecycle](./Bean%20Lifecycle)** | A core Spring Framework project exploring bean configuration and lifecycles in the IoC container. | Java 23, Spring Framework 7.0.7, Maven |
| **[Spring Core](./Spring%20Core)** | A core Spring Boot project showcasing IoC Container, Dependency Injection, and Component Scanning. | Java 23, Spring Boot 4.1.0, Maven |
| **[Application Properties](./Application%20Properties)** | A Spring Boot project demonstrating typed external configuration properties binding using `@ConfigurationProperties`. | Java 21, Spring Boot 4.1.0, Maven |
| **[SpringBootCrudProject](./SpringBootCrudProject)** | A RESTful CRUD API for managing Student records with full CRUD and soft delete support, backed by MySQL via Spring Data JPA. Includes a Bruno API collection for endpoint testing. | Java 23, Spring Boot 4.1.0, Spring Data JPA, MySQL, Maven, Bruno |
| **[SpringCrudDTO](./SpringCrudDTO)** | A RESTful CRUD API demonstrating the use of Data Transfer Objects (DTOs) for managing Student records. | Java 21, Spring Boot 4.1.1, Spring Data JPA, MySQL, Maven |

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

### 📂 [Bean Lifecycle](./Bean%20Lifecycle)
A core Spring application showcasing bean configuration, scanning, and instantiation behavior.
- **Key Features**:
  - Core Spring Context bootstrap using `AnnotationConfigApplicationContext`.
  - Component scanning configured via `@ComponentScan` on `AppConfig`.
  - Running on Java 23 and Spring Framework 7.0.7.

### 📂 [Spring Core](./Spring%20Core)
A core Spring Boot application featuring baseline services and auto-configuration setup.
- **Key Features**:
  - Bootstrap using Spring Boot's `@SpringBootApplication` context.
  - Configured for component scanning and simple service injection (`OrderService` and `PaymentService`).
  - Running on Java 23 and Spring Boot 4.1.0.

### 📂 [Application Properties](./Application%20Properties)
A Spring Boot application demonstrating external configuration properties binding using `@ConfigurationProperties` and dependency injection.
- **Key Features**:
  - Configuration properties class (`PaymentProperties`) bound to the prefix `payment-properties` using `@ConfigurationProperties`.
  - Spring-managed component (`PaymentGateway`) wrapping and exposing the configuration properties.
  - Setup using `@SpringBootApplication` and running on Java 21 and Spring Boot 4.1.0.

### 📂 [SpringBootCrudProject](./SpringBootCrudProject)
A full-featured RESTful CRUD API built with Spring Boot and Spring Data JPA for managing Student records persisted in a MySQL database, with soft delete support and a Bruno API collection for testing.
- **Key Features**:
  - Layered architecture: `controller`, `service`, `entity`, and `repository` packages.
  - `StudentRepository` extends `JpaRepository` with custom derived queries to exclude soft-deleted records.
  - `StudentService` encapsulates all business logic, interfacing between controller and repository.
  - Full CRUD operations exposed via `StudentController` using `@RequestParam` for ID-based lookups.
  - `@GeneratedValue(strategy = GenerationType.IDENTITY)` for auto-incremented student IDs.
  - Soft delete: marks a record as `deleted = true` and hides it from all read/update operations without removing from the database.
  - Hard delete: permanently removes a record or clears the entire table.
  - Bruno API collection (`Bruno/`) included for quick, out-of-the-box endpoint testing.
  - Running on Java 23, Spring Boot 4.1.0, and MySQL.
- **API Endpoints** (base: `http://localhost:8080/api/student`):

  | Method     | Endpoint                      | Description                              |
  | :--------- | :---------------------------- | :--------------------------------------- |
  | `POST`     | `/create`                     | Create a new student record              |
  | `GET`      | `/get?id={id}`                | Retrieve a non-deleted student by ID     |
  | `GET`      | `/getAll`                     | Retrieve all non-deleted students        |
  | `PUT`      | `/update?id={id}`             | Update an existing student by ID         |
  | `PATCH`    | `/soft-delete?id={id}`        | Soft delete a student (sets deleted=true)|
  | `DELETE`   | `/delete?id={id}`             | Hard delete a student by ID             |
  | `DELETE`   | `/deleteAll`                  | Hard delete all student records          |

- **Prerequisites**:
  - MySQL running locally on port `3306`.
  - A database named `Student_CRUD_db` must exist:
    ```sql
    CREATE DATABASE Student_CRUD_db;
    ```
  - Default credentials: `username=root`, `password=root` (configurable in `application.properties`).

- **Testing with Bruno**:
  1. Install [Bruno](https://www.usebruno.com/) (free, open-source API client).
  2. Open Bruno → **Open Collection** → select the `SpringBootCrudProject/Bruno/` folder.
  3. Select the **Local** environment (sets `baseUrl` to `http://localhost:8080`).
  4. Run any request — all endpoints are pre-configured with sample payloads.

### 📂 [SpringCrudDTO](./SpringCrudDTO)
A Spring Boot application demonstrating the use of Data Transfer Objects (DTOs) to decouple database entities from the REST API layer.
- **Key Features**:
  - Implements `StudentRequestDTO` and `StudentResponseDTO` to encapsulate API request and response data.
  - `StudentService` handles the mapping between the `Student` entity and DTOs.
  - `Student` entity includes auditing fields (`createdAt`, `updatedAt`).
  - Exposes REST endpoints via `StudentController` returning cleanly formatted DTOs.
  - Configured with MySQL database connection.
  - Running on Java 21 and Spring Boot 4.1.1.


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
