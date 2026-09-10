# Spring Boot Projects

A curated collection of Spring Framework and Spring Boot sample applications, demonstrations, and full-fledged RESTful services. This repository is organized by domain to illustrate core IoC container concepts, configuration management, and database persistence architectures.

---

## 📑 Table of Contents

- [Overview & Categories](#overview--categories)
- [Projects Directory](#projects-directory)
  - [1. Core Spring & IoC Concepts](#1-core-spring--ioc-concepts)
  - [2. Configuration & Profiles](#2-configuration--profiles)
  - [3. RESTful APIs & Data Persistence](#3-restful-apis--data-persistence)
- [Detailed Project Breakdown](#detailed-project-breakdown)
  - [Core Spring & IoC](#core-spring--ioc)
  - [Configuration & Profiles](#configuration--profiles)
  - [REST APIs & Data Persistence](#rest-apis--data-persistence)
- [Getting Started & Running Projects](#getting-started--running-projects)

---

## 🔍 Overview & Categories

The projects in this repository are categorized into three focus areas:

1. **Core Spring & IoC**: Demonstrations of Spring IoC container fundamentals, dependency injection (constructor vs. field), bean scopes (singleton/prototype), eager vs. lazy initialization, and circular dependency handling.
2. **Configuration & Profiles**: Applications demonstrating external configuration management, type-safe `@ConfigurationProperties` binding, and environment setups.
3. **RESTful APIs & Data Persistence**: Complete REST APIs built with Spring Boot, Spring Data JPA, Hibernate, MySQL, soft-delete mechanisms, DTO pattern implementations, and Bruno API test suites.

---

## 🗂 Projects Directory

### 1. Core Spring & IoC Concepts

| Project | Description | Tech Stack |
| :--- | :--- | :--- |
| **[Spring Boot Demo](./Spring%20Boot%20Demo)** | Pure Spring IoC Container demonstration using `AnnotationConfigApplicationContext` and component scanning. | Java 23, Spring Framework 7.0.7, Maven |
| **[Spring Core](./Spring%20Core)** | Core Spring Boot application showcasing `@SpringBootApplication`, IoC Container, and service injection. | Java 23, Spring Boot 4.1.0, Maven |
| **[Bean Initialization](./Bean%20Initialization)** | Demonstrates bean instantiation sequencing, scanning, and eager vs. lazy (`@Lazy`) initialization. | Java 23, Spring Framework 7.0.7, Maven |
| **[Bean Scopes](./Bean%20Scopes)** | Explores Singleton and Prototype bean scopes (`@Scope`) and their lifecycle behaviors in Spring context. | Java 23, Spring Framework 7.0.7, Maven |
| **[Bean Lifecycle](./Bean%20Lifecycle)** | Demonstrates Spring context bootstrap, component scanning (`@ComponentScan`), and bean management. | Java 23, Spring Framework 7.0.7, Maven |
| **[Circular Dependancy](./Circular%20Dependancy)** | Demonstrates circular dependency scenarios and resolution using field injection vs. constructor injection. | Java 23, Spring Framework 7.0.7, Maven |

### 2. Configuration & Profiles

| Project | Description | Tech Stack |
| :--- | :--- | :--- |
| **[Application Properties](./Application%20Properties)** | External configuration properties binding with `@ConfigurationProperties` and service injection. | Java 21, Spring Boot 4.1.0, Maven |
| **[ProfileDemo](./ProfileDemo)** | Spring Boot WebMVC starter project setup and web application configuration baseline. | Java 21, Spring Boot 4.1.1, Maven |

### 3. RESTful APIs & Data Persistence

| Project | Description | Tech Stack |
| :--- | :--- | :--- |
| **[SpringBootCrudProject](./SpringBootCrudProject)** | Full-featured RESTful CRUD API with Spring Data JPA, MySQL persistence, soft/hard delete, and Bruno test collection. | Java 23, Spring Boot 4.1.0, Spring Data JPA, MySQL, Maven, Bruno |
| **[SpringCrudDTO](./SpringCrudDTO)** | Decoupled RESTful CRUD API using Request/Response DTO pattern, audit timestamps, soft delete, and MySQL. | Java 21, Spring Boot 4.1.1, Spring Data JPA, MySQL, Maven, Bruno |

---

## 📖 Detailed Project Breakdown

### Core Spring & IoC

#### 📂 [Spring Boot Demo](./Spring%20Boot%20Demo)
A pure Spring framework project illustrating container initialization and annotation-driven component configuration.
- **Key Concepts**:
  - `AnnotationConfigApplicationContext` initialization via `AppConfig`.
  - Component scanning with `@ComponentScan`.
  - Service dependency injection between components (`OrderService` and `PaymentService`).
  - Running on Java 23 and Spring Framework 7.0.7.

#### 📂 [Spring Core](./Spring%20Core)
A baseline Spring Boot application demonstrating standard autoconfiguration bootstrap and component scanning.
- **Key Concepts**:
  - Application entry point using `@SpringBootApplication`.
  - Autoconfigured component scanning and service wiring.
  - Running on Java 23 and Spring Boot 4.1.0.

#### 📂 [Bean Initialization](./Bean%20Initialization)
Investigates bean instantiation order, constructor execution sequences, and on-demand initialization.
- **Key Concepts**:
  - Lazy bean initialization using `@Lazy` on `PaymentService`.
  - Contrasts container-managed lifecycle with manual instantiation inside eager bean constructors.
  - Verification of instantiation order via constructor console logging.
  - Running on Java 23 and Spring Framework 7.0.7.

#### 📂 [Bean Scopes](./Bean%20Scopes)
Demonstrates the distinction between Singleton (default) and Prototype bean lifecycle and memory behavior.
- **Key Concepts**:
  - Scope definition via `@Scope("prototype")` on `OrderService`.
  - Dependency injection into independent consumer components (`A` and `B`).
  - Proving new instance allocation per bean request in `Main`.
  - Running on Java 23 and Spring Framework 7.0.7.

#### 📂 [Bean Lifecycle](./Bean%20Lifecycle)
Demonstrates core Spring context startup, configuration classes, and bean scanning lifecycle.
- **Key Concepts**:
  - Context bootstrapping using `AnnotationConfigApplicationContext`.
  - Annotation scanning configuration with `@ComponentScan` on `@Configuration` classes.
  - Running on Java 23 and Spring Framework 7.0.7.

#### 📂 [Circular Dependency](./Circular%20Dependancy)
Analyzes circular references between beans and explores resolution approaches.
- **Key Concepts**:
  - Circular reference scenarios between `OrderService` and `PaymentService`.
  - Field-based dependency injection behavior during container startup.
  - Running on Java 23 and Spring Framework 7.0.7.

---

### Configuration & Profiles

#### 📂 [Application Properties](./Application%20Properties)
Demonstrates strong typing for application settings by mapping configuration keys to Java objects.
- **Key Concepts**:
  - Type-safe external property binding using `@ConfigurationProperties(prefix = "payment-properties")`.
  - Service abstraction (`PaymentGateway`) consuming configuration properties.
  - Running on Java 21 and Spring Boot 4.1.0.

#### 📂 [ProfileDemo](./ProfileDemo)
Starter application demonstrating web MVC dependencies and profile-oriented setup.
- **Key Concepts**:
  - Standard Spring Boot WebMVC starter dependency setup.
  - Clean modular foundation for profile-based configuration.
  - Running on Java 21 and Spring Boot 4.1.1.

---

### REST APIs & Data Persistence

#### 📂 [SpringBootCrudProject](./SpringBootCrudProject)
A complete, layered RESTful service for Student records management backed by MySQL and Spring Data JPA.
- **Key Features**:
  - Layered architecture: `controller`, `service`, `entity`, and `repository`.
  - Auto-incremented primary keys using `@GeneratedValue(strategy = GenerationType.IDENTITY)`.
  - **Soft Delete**: Sets `deleted = true` to hide records from standard queries while retaining data.
  - **Hard Delete**: Supports permanent individual deletion and bulk table clearance.
  - Pre-configured **Bruno** API test collection (`Bruno/`).
  - Running on Java 23, Spring Boot 4.1.0, and MySQL.

- **API Endpoints** (Base URL: `http://localhost:8080/api/student`):

  | Method | Endpoint | Description |
  | :--- | :--- | :--- |
  | `POST` | `/create` | Create a new student record |
  | `GET` | `/get?id={id}` | Retrieve an active (non-deleted) student by ID |
  | `GET` | `/getAll` | Retrieve all active students |
  | `PUT` | `/update?id={id}` | Update an existing student record |
  | `PATCH` | `/soft-delete?id={id}` | Soft delete a student (marks `deleted = true`) |
  | `DELETE` | `/delete?id={id}` | Hard delete a student by ID |
  | `DELETE` | `/deleteAll` | Hard delete all student records |

- **Database Prerequisites**:
  ```sql
  CREATE DATABASE Student_CRUD_db;
  ```
  Configure credentials in `application.properties` (`root`/`root` by default).

#### 📂 [SpringCrudDTO](./SpringCrudDTO)
A production-grade RESTful API demonstrating the Data Transfer Object (DTO) pattern to decouple domain entities from client payloads.
- **Key Features**:
  - Request/Response DTO encapsulation (`CreateStudentRequestDTO` and `CreateStudentResponseDTO`).
  - Automatic timestamp auditing (`createdAt`, `updatedAt`) managed in the service layer.
  - Soft and hard deletion support with custom JPA query methods.
  - Integrated Bruno API test collection (`src/Bruno Endpoints`).
  - Running on Java 21, Spring Boot 4.1.1, and MySQL.

- **API Endpoints** (Base URL: `http://localhost:8080/api/student`):

  | Method | Endpoint | Description |
  | :--- | :--- | :--- |
  | `POST` | `/create` | Create a student record with DTO mapping |
  | `GET` | `/get?id={id}` | Fetch active student mapped to `CreateStudentResponseDTO` |
  | `GET` | `/getAll` | Fetch all active students as DTO list |
  | `PUT` | `/update?id={id}` | Update active student details via DTO |
  | `PATCH` | `/soft-delete?id={id}` | Soft delete student record |
  | `DELETE` | `/delete?id={id}` | Permanently delete student record |
  | `DELETE` | `/deleteAll` | Permanently delete all student records |

---

## 🚀 Getting Started & Running Projects

### Prerequisites
- **JDK**: Java 21 or Java 23 (as specified per project)
- **Build Tool**: Apache Maven (or use the included `mvnw` / `mvnw.cmd` wrapper)
- **Database**: MySQL 8.0+ (required for `SpringBootCrudProject` and `SpringCrudDTO`)
- **API Client**: [Bruno](https://www.usebruno.com/) (recommended for endpoint testing)

### Execution Steps
1. **Clone the repository**:
   ```bash
   git clone https://github.com/aayushrambo8/spring-boot-projects.git
   cd spring-boot-projects
   ```

2. **Navigate to the target project directory**:
   ```bash
   cd "SpringBootCrudProject"
   # or for maven subproject with spaces:
   # cd "Spring Boot Demo"
   ```

3. **Run using Maven**:
   ```bash
   mvn spring-boot:run
   # or with wrapper:
   ./mvnw spring-boot:run
   ```
