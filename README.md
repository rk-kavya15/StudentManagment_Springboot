# Student Management API with Spring Boot

## Description

The **Student Management API** is a Spring Boot application designed to manage student records using a PostgreSQL database. This RESTful API provides endpoints for various CRUD (Create, Read, Update, Delete) operations, allowing users to efficiently interact with student data.

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
   - **URL**: `/api/students`

2. **Get Student by ID**
   - **Method**: GET
   - **URL**: `/api/students/{id}`

3. **Create Student Data**
   - **Method**: POST
   - **URL**: `/api/students`
   - **Request Body**: 
     ```json
     {
       "name": "John Doe",
       "department": "Computer Science"
     }
     ```

4. **Update Student Name by ID**
   - **Method**: PUT
   - **URL**: `/api/students/{id}/name`
   - **Query Parameter**: `name` (New name to set)

5. **Update Student Department by ID**
   - **Method**: PUT
   - **URL**: `/api/students/{id}/department`
   - **Query Parameter**: `department` (New department to set)

6. **Get Students by Department**
   - **Method**: GET
   - **URL**: `/api/students/department/{department}`

7. **Delete Student**
   - **Method**: DELETE
   - **URL**: `/api/students/{id}`

## Setup and Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/student-management-api.git
