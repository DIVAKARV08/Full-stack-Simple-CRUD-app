package com.backend.backed.service;

import com.backend.backed.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public String addStudent(Student student);
    public List<Student> allStudent();
    public Optional<Student> student(String studentId);
    public Student UpdateStudent(String studentId, Student student);
    public void DeleteStudent(String studentId);
}
