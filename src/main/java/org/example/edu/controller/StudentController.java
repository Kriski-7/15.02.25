package org.example.edu.controller;

import lombok.RequiredArgsConstructor;
import org.example.edu.model.Student;
import org.example.edu.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository repository;


    @GetMapping("/student")
    public List<Student> getStudentList() {
        return repository.findAll();
    }

    @PostMapping("/student")
    public long saveStudent(@RequestParam String name, @RequestParam String email, @RequestParam int age) {

        Student saveStudent = new Student( name, email, age);

        return repository.save(saveStudent).getId();

    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id) {
    return repository.getById(id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable long id){
        repository.deleteById(id);
    }
}
