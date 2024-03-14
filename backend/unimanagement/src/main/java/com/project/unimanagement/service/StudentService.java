package com.project.unimanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.unimanagement.entity.StudentIdentity;
import com.project.unimanagement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentIdentity> getAllStudents() {
        return studentRepository.findAll();
    }

    public StudentIdentity getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    public StudentIdentity createStudent(StudentIdentity studentIdentity) {
        return studentRepository.save(studentIdentity);
    }

    public StudentIdentity updateStudent(String id, StudentIdentity studentIdentity) {
        if (studentRepository.existsById(id)) {
            studentIdentity.setStudentId(Integer.parseInt(id));
            return studentRepository.save(studentIdentity);
        }
        return null; // Or throw an exception if needed
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
