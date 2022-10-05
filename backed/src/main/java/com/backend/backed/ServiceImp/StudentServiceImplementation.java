package com.backend.backed.ServiceImp;

import com.backend.backed.model.Student;
import com.backend.backed.repository.StudentRepository;
import com.backend.backed.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation  implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {
         String studentId=studentRepository.save(student).getId();
         return studentId;
    }

    @Override
    public List<Student> allStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> student(String studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Student UpdateStudent(String studentId, Student student) {
        student.setId(studentId);
        return studentRepository.save(student);
    }

    @Override
    public void DeleteStudent(String studentId) {
        studentRepository.deleteById(studentId);
    }
}
