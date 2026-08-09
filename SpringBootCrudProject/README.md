# SpringBootCrudProject

A RESTful CRUD API built with **Spring Boot** for managing Student records.

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven

## 📦 Features

- **Create** a new student record
- **Read** a single student or all students
- **Update** an existing student record
- **Delete** a student by ID
- **Delete All** student records at once

## 🔗 API Endpoints

| Method | Endpoint               | Description                  |
|--------|------------------------|------------------------------|
| GET    | `/students`            | Retrieve all students        |
| GET    | `/students/{id}`       | Retrieve a student by ID     |
| POST   | `/students/add`        | Add a new student            |
| PUT    | `/students/update/{id}`| Update an existing student   |
| DELETE | `/students/delete/{id}`| Delete a student by ID       |
| DELETE | `/students/deleteAll`  | Delete all student records   |

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
├── model/         # Entity classes
└── repository/    # JPA repositories
```
