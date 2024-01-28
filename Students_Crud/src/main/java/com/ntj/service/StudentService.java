package com.ntj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntj.entity.Student;
import com.ntj.repository.StudentRepository;

@Service
public class StudentService {
 
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student )
	{
		return studentRepository.save(student);
	}
	
	public List<Student> saveStudents(List<Student> students )
	{
		return studentRepository.saveAll(students);
	}
	
	public List <Student> getStudent()
	{
		return studentRepository.findAll();
	}
	
	public Student getStudentById(int id)
	{
		return studentRepository.findById(id).orElse(null);
	}
	
	public Student getStudentByName(String name)
	{
		return studentRepository.findByName(name);
	}
	
	public String deleteById(int id)
	{
		studentRepository.deleteById(id);
		 return "Student removed successfully ...!"+id;
	}
	
	public Student updateStudent(Student student)
	{
		  Student stu=studentRepository.findById(student.getId()).orElse(null);
		  stu.setName(student.getName());
		  stu.setStream(student.getStream());
		  stu.setBatch(student.getBatch());
		  return studentRepository.save(stu);
	   
	}

}
