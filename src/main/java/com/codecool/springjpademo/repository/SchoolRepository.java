package com.codecool.springjpademo.repository;

import com.codecool.springjpademo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
