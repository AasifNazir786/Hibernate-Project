# Hibernate-Project
# Student Management System

A simple Java application to manage student records using **Java** and **PostgreSQL**. This project demonstrates **CRUD operations** (Create, Read, Update, Delete) on a `Student` entity.

## Features

- Add new student records.
- View all students or a specific student by ID.
- Update existing student details.
- Delete a student from the database.

## Tech Stack

- **Java** (Core Java)
- **PostgreSQL** (Database)
- **Maven** (Build tool)

## Project Structure

```bash
src/main/java/com/example/student
├── model
│   └── Student.java        # Student entity
├── service
│   └── StudentService.java  # CRUD operations for Student
├── util
│   └── HibernateUtil.java   # Hibernate session management
└── main
    └── App.java            # Main entry point of the application
```

## CRUD Operations Overview

- **Create**: Add a new student to the database.
- **Read**: View a student by ID or view all students.
- **Update**: Modify student details.
- **Delete**: Remove a student from the database.

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/AasifNazir786/Hibernate-Project.git
   ```

2. **Set Up PostgreSQL:**
    - Install PostgreSQL and create a database named `database-name`.
    - Update your `hibernate.cfg.xml` with the correct database credentials.

3. **Build and Run the Project:**
    - Ensure you have Maven installed.
    - In the project root directory, run:
      ```bash
      mvn clean install
      mvn exec:java -Dexec.mainClass="com.example.Main"
      ```

## Skills Demonstrated

- Core Java (OOP, Exception Handling)
- PostgreSQL CRUD operations
- Transaction management
- Build automation with Maven

## Contact

For any questions or feedback:

- **Email:** aasif.n.s@gmail.com
- **GitHub:** [My GitHub](https://github.com/AasifNazir786)