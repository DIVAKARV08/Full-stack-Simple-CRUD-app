package com.backend.backed.controller;

import com.backend.backed.model.Student;
import com.backend.backed.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/allStudent")
    public List<Student> allStudent(){
        return studentService.allStudent();
    }
    @GetMapping("/student")
    public Optional<Student> student(@RequestParam("id") String studentId){
        return studentService.student(studentId);
    }
    @PutMapping("/UpdateStudent")
    public Student UpdateStudent(@RequestParam("id") String studentId, @RequestBody Student student){
        return studentService.UpdateStudent(studentId,student);
    }
    @DeleteMapping("/DeleteStudent")
    public void DeleteStudent(@RequestParam("id") String studentId){
        studentService.DeleteStudent(studentId);
    }
}
