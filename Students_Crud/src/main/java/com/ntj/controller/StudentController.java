package com.ntj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntj.entity.Student;

import com.ntj.service.StudentService;

@RestController
public class StudentController {

	
	    @Autowired
		private StudentService service;
	    
	    @PostMapping("/addStudent")
	    public Student addStudent(@RequestBody Student student)
	    {
	    	return service.saveStudent(student);
	    	
	    }
	    @PostMapping("/addStudents")
	    public List<Student> addStudent(@RequestBody List<Student> students)
	    {
	    	return service.saveStudents(students);
	    	
	    }
	    @GetMapping("/Student")
	    public List<Student> findAllProduct()
	    {
			return service.getStudent();
	    	
	    }
		
	    @GetMapping("/Student/{Name}")
	    public Student findStudentByName(@PathVariable String Name)
	    {
	    	return service.getStudentByName(Name);
	    }
	    
	    @GetMapping("/Studentid/{id}")
	    public Student findStudetById(@PathVariable int id)
	    {
	    	return service.getStudentById(id);
	    }
	    
	    @PutMapping("/UpdateStudent")
	    public Student updateStudent(@RequestBody Student student)
	    {
	    	return service.updateStudent(student);
	    }
	    
	    @DeleteMapping("/DeleteProduct/{id}")
	    public String  deleteProduct(@PathVariable int id)
	    {
	    	return service.deleteById(id);
	    }
	    
	
	
}
