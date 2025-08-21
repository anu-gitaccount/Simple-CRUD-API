
# Simple CRUD API

A beginner-friendly **Spring Boot** project demonstrating a simple CRUD (Create, Read, Update, Delete) API.  
This project can be used as a starter template for learning REST APIs with Spring Boot.

---

## 🚀 Features
- Create new records
- Read records (all or by ID)
- Update existing records
- Delete records
- Built with Spring Boot (REST API style)

---

## 🛠️ Tech Stack
- **Java 17** (or your version)
- **Spring Boot** (Web, Spring Data JPA)
- **H2 Database** (in-memory, default) or any SQL DB
- **Maven** (for build and dependency management)

---

## 📂 Project Structure
src/main/java/com/example/demo
├── controller # REST Controllers
├── model # Entity classes
├── repository # Spring Data JPA Repositories
└── service # Business logic

---


---

## ▶️ Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/<your-username>/simple-crud-api.git
cd simple-crud-api

---

### RUN 
./mvnw spring-boot:run

---

## Acess  the API (Terminal for Linux or Git Bash for Windows)
Linux : curl -X GET http://localhost:8080
Windows : curl -s http://localhost:8080

## CURD Version 
Linux : curl -X GET http://localhost:8080/api/v1/software-engineer
Windows : curl -s http://localhost:8080/api/v1/soft_eng



## To Add Element in API
    POST API URL

    POST http://localhost:8080/api/v1/soft_eng
    Content-Type: application/json

    and then a json object
    {
        "name" : "Flins",
        "position" : "HR"
    }

