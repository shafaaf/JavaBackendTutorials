package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println("addNewStudent: student is: " + student);
        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.email);
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }
}
