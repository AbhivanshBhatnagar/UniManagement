package com.project.unimanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.unimanagement.entity.StudentIdentity;

@Repository
public interface StudentRepository extends JpaRepository<StudentIdentity, String> {
    // You can define custom query methods here if needed
}
