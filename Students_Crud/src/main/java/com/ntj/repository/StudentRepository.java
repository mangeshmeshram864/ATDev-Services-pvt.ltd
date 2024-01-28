package com.ntj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntj.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>
{
	Student findByName(String name);
}
