package com.justice.studentmanagementsystem.repository;

import com.justice.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Justice  
 * @Date 16/5/2024
 */


public interface StudentRepository extends JpaRepository<Student, Long> {
}
