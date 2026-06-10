# Spring Boot Student Management System

A CRUD application built using Spring Boot, Spring Data JPA, and MySQL for managing student records.

## Features

- Create Student
- View Student Details
- Update Student Information
- Delete Student
- MySQL Database Integration
- REST API Endpoints

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok

## Project Structure

src
├── controller
├── service
├── repository
├── entity

## Database Configuration

Update the database configuration in:

src/main/resources/application.properties

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

## Learning Outcomes

- Spring Boot Fundamentals
- Dependency Injection
- REST API Development
- JPA Repository Usage
- CRUD Operations
- Database Integration

## How to Run

1. Create MySQL database:

```sql
CREATE DATABASE studentdb;
```

2. Update database credentials in application.properties

3. Run:

```bash
mvn spring-boot:run
```

or start:

```text
StudentappApplication.java
```

from IntelliJ.

## Author

Vishal Singh
