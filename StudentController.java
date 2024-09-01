package com.example.proj1.controller;

import com.example.proj1.entity.Student;
import com.example.proj1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.*;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    //get all students list
    // localhost:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students;
        students = repo.findAll();
        return students;
    }

    //get student by id
    // localhost:8080/students/12
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student stud;
        stud = repo.findById(id).get();
        return stud;
    }

    //create student data
    // localhost:8080/students/add
    @PostMapping("/students/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void createStudent(@RequestBody Student stud){
        repo.save(stud);
    }

    //to update student name by ID
    // localhost:8080/students/1/name?name=raju
    @PutMapping("/students/{id}/name")
    public Student updateStudentName(@PathVariable int id, @RequestParam String name) {
        Optional<Student> studentOptional = repo.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setName(name);
            return repo.save(student);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    //to update student department by ID
    //localhost:8080/students/1/department?department=EE
    @PutMapping("/students/{id}/department")
    public Student updateStudentDepartment(@PathVariable int id, @RequestParam String department) {
        Optional<Student> studentOptional = repo.findById(id);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setDepartment(department);
            return repo.save(student);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }

    //to get all students by department
    //localhost:8080/students/department/CSE
    @GetMapping("/students/department/{department}")
    public List<Student> getStudentsByDepartment(@PathVariable String department) {
        return repo.findByDepartment(department);
    }

    // to delete student by id
    // localhost:8080/students/delete/12
    @DeleteMapping("/students/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        Student stud= repo.findById(id).get();
        repo.delete(stud);
    }

}
