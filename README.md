# Eazy-School 🎓

[![GitHub Repo stars](https://img.shields.io/github/stars/MU-Abdul-wahhab/eazy-school.svg?style=social)](https://github.com/MU-Abdul-wahhab/eazy-school)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Overview

Eazy-School is a lightweight school management system built with **Spring Boot** and **Thymeleaf**, designed to streamline the core operations of a school: managing students, courses and internal messaging.  
It emphasizes modular structure, clean UI and maintainable backend logic with role-based access control.

## 🧩 Key Features

- **Role-based access control** (Admin, Teacher, Student)  
- **Student management** – add/edit/remove student profiles  
- **Course management** – create courses, assign students, set metadata  
- **Internal messaging** – send messages between roles/users  
- **Modular design** – easy to extend with new modules (e.g., staff, timetable)  
- **Web UI** built with Thymeleaf + Bootstrap  
- **Backend REST and MVC support** via Spring Boot  

## 🏗️ Architecture & Tech Stack

| Layer | Technology |
|-------|------------|
| Backend | Spring Boot (Java) |
| Frontend | Thymeleaf + HTML/CSS + JavaScript |
| Database | MySQL / H2 / Any JPA-capable |
| Build Tool | Maven |
| Security | Spring Security |
| ORM | Spring Data JPA / Hibernate |

## 🚀 Getting Started

### Prerequisites
- Java JDK 11 (or higher)  
- Maven  
- A relational database (MySQL, PostgreSQL, H2, etc)  
- Git  

### Installation & Running

```bash
# Clone the repo
git clone https://github.com/MU-Abdul-wahhab/eazy-school.git
cd eazy-school

# Configure database settings
# edit src/main/resources/application.properties
# set spring.datasource.url, username, password

# Build and run
mvn clean install
mvn spring-boot:run
```

Once started, open your browser at `http://localhost:8080` to access the system.

## 🧪 Sample Usage

1. **Log in as Admin** (or create an admin user via database)
2. **Navigate to "Students"** to add a new student record
3. **Navigate to "Courses"** to create a new course and enroll students
4. **Use the "Messaging" module** to send a message from one role to another

## 🚧 Common Issues & Troubleshooting

| Issue | Solution |
|-------|----------|
| Cannot connect to database | Check `spring.datasource.*` properties in `application.properties` |
| Port already in use | Change `server.port` in `application.properties` |
| Thymeleaf views not rendering properly | Ensure templates are in `src/main/resources/templates` and named properly |
| Role-based access not enforced | Verify `@PreAuthorize` or security configuration for mapping roles |

## 🎯 Key Learnings

- How to structure a modular Spring Boot application (separate packages/modules)
- Implementing role-based security using Spring Security and method-level annotations
- Building server-side rendered UI with Thymeleaf and integrating it with Spring controllers
- Using JPA/Hibernate for entity mapping (Student, Course, User, Role, Message)
- Best practices for clean code: service layer, repository layer, controller layer separation

## 💬 Final Thoughts

Eazy-School is meant as a foundational platform for school management systems. It's designed to be simple yet extensible: you can plug in new modules (e.g., Timetable, Attendance, Examinations, Staff) without rewriting core functionality.

Whether for a small school setup or as a learning-project scaffold for Spring Boot + Thymeleaf, this project gives you a solid starting point.

**"Streamlining education management, one module at a time!"** 🎓
