package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Student;

public interface Studentrepository extends JpaRepository<Student,Integer>
{

}
