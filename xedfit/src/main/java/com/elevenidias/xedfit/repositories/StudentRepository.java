package com.elevenidias.xedfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elevenidias.xedfit.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
