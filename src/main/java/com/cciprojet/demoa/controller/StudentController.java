package com.cciprojet.demoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cciprojet.demoa.DAO.StudentDAO;
import com.cciprojet.demoa.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@GetMapping(value ="/getallstudents")
	public List<Student> students() {
		return studentDAO.findAll();
	}
	
	@GetMapping(value ="/getstudent/{id}")
	public Student studentByiId (@PathVariable int id) {
		return studentDAO.findOne(id);
	}
	
	@PostMapping(value = "/addstudent")
	public Student addStudent(@RequestBody Student student) {	
	return studentDAO.save(student);
	}
	
	@PutMapping(value = "/updatestudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentDAO.save(student);
	}
	
	@PutMapping(value = "/updatestudent/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int id) {
		return studentDAO.save(student);
	}
	
	@DeleteMapping(value = "/deleteAllStudents")
	public void deleteAllStudent() {
		studentDAO.deleteAll();	
	}
	
	@DeleteMapping(value = "/deleteStudent/{id}")
	public void deleteByStudentId(@PathVariable int id) {
		studentDAO.deleteByStudentId(id);	
	}
	


	
	/*
@DeleteMapping(value = "/deleteStudent/{id}")
public void deleteByStudentId(@PathVariable int id) {
studentDAO.delete(id);	
} 
	 */
	
	
}
