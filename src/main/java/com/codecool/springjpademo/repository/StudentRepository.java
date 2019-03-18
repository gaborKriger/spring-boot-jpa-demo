package com.codecool.springjpademo.repository;

import com.codecool.springjpademo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {



}
