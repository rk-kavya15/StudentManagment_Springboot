# Student Management API with Spring Boot

## Description

The **Student Management API** is a Spring Boot application designed to manage student records using a PostgreSQL database. This RESTful API provides endpoints for various CRUD (Create, Read, Update, Delete) operations, allowing users to efficiently interact with student data.
The project leverages the following dependencies:
- **Spring Boot DevTools**: For automatic restarts and live reload.
- **Spring Web**: For building web applications and RESTful services.
- **Spring Data JPA**: For simplifying data access and CRUD operations.
- **PostgreSQL Driver**: For connecting to PostgreSQL database.

## Features

- **Retrieve All Students**: Get a complete list of all student records.
- **Get Student by ID**: Fetch detailed information of a specific student using their unique ID.
- **Create Student Data**: Add new student records with essential details.
- **Update Student Name by ID**: Modify a student's name based on their ID.
- **Update Student Department by ID**: Change a student's department using their ID.
- **Get Students by Department**: Retrieve a list of students belonging to a particular department.
- **Delete Student**: Remove a student's record from the database by their ID.

## Technologies Used

- **Spring Boot**: Framework for building the RESTful API.
- **PostgreSQL**: Relational database management system for storing student records.
- **Spring Data JPA**: For database interactions and CRUD operations.

## Endpoints

1. **Get All Students**
   - **Method**: GET
   - **URL**: `/students`
   - **Description**: Retrieves a list of all students.

   **Example Request**:
   ```http
   GET http://localhost:8080/students

2. **Get Student by ID**
   - **Method**: GET
   - **URL**: `/students/{id}`
   - **Description**: Retrieves a student by their unique ID.

   **Example Request**:
   ```http
   GET http://localhost:8080/students/12
3. **Create Student Data**
   - **Method**: POST
   - **URL**: `/students/add`
   - **Description**: Creates a new student record.

   **Example Request**:
   ```http
   POST http://localhost:8080/students/add
4. **Update Student Name by ID**
   - **Method**: PUT
   - **URL**: `/students/{id}/name`
   - **Description**: Updates the name of a student based on their ID.

   **Example Request**:
   ```http
   PUT http://localhost:8080/students/1/name?name=raju
5. **Update Student Department by ID**
   - **Method**: PUT
   - **URL**: `/students/{id}/department`
   - **Description**: Updates the department of a student based on their ID.

   **Example Request**:
   ```http
   PUT http://localhost:8080/students/1/department?department=EE
6. **Get Students by Department**
   - **Method**: GET
   - **URL**: `/students/department/{department}`
   - **Description**: Retrieves a list of students by their department.

   **Example Request**:
   ```http
   GET http://localhost:8080/students/department/CSE
7. **Delete Student**
   - **Method**: DELETE
   - **URL**: `/students/delete/{id}`
   - **Description**: Deletes a student record based on their ID.

   **Example Request**:
   ```http
   DELETE http://localhost:8080/students/delete/12

