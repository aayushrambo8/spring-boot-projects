# SpringBootCrudProject

A RESTful CRUD API built with **Spring Boot** for managing Student records, with soft delete support.

## 🚀 Tech Stack

- Java 23
- Spring Boot 4.1.0
- Spring Data JPA
- MySQL
- Maven
- Bruno (API collection)

## 📦 Features

- **Create** a new student record (ID auto-generated via `@GeneratedValue`)
- **Read** a single student or all students (soft-deleted records excluded)
- **Update** an existing student record
- **Hard Delete** a student by ID or delete all records
- **Soft Delete** a student by ID (marks `deleted = true`, hides from queries)
- Bruno API collection included for quick endpoint testing

## 🔗 API Endpoints

| Method   | Endpoint                  | Description                         |
|----------|---------------------------|-------------------------------------|
| `GET`    | `/students/get?id={id}`   | Retrieve a student by ID            |
| `GET`    | `/students/getAll`        | Retrieve all non-deleted students   |
| `POST`   | `/students/add`           | Add a new student                   |
| `PUT`    | `/students/update?id={id}`| Update an existing student          |
| `DELETE` | `/students/delete?id={id}`| Hard delete a student by ID         |
| `DELETE` | `/students/deleteAll`     | Hard delete all student records     |
| `PATCH`  | `/students/soft-delete?id={id}` | Soft delete a student by ID   |

## ▶️ Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080` by default.

## 📁 Project Structure

```
src/main/java/live/aayush/
├── controller/    # REST controllers
├── service/       # Business logic layer
├── entity/        # Entity classes
└── repository/    # JPA repositories

Bruno/             # Bruno API collection for all endpoints
```
