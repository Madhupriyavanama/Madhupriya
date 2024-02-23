package com.example.Studentinfo.repository;

import com.example.Studentinfo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student,Integer> {
}
