package com.project.unimanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_identity")
public class StudentIdentity {
    @Id
    @GeneratedValue
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhone;
    private String studentDOB;
    private String studentCourse;
    private String studentDepartment;
    private String studentBatch;
    private String studentSemester;
    private String studentSection;
    private String studentRegNo;

}
