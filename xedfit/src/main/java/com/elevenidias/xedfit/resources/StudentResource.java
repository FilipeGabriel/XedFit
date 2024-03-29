package com.elevenidias.xedfit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elevenidias.xedfit.entities.Student;
import com.elevenidias.xedfit.services.StudentService;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll(){
		List<Student> students = studentService.findAll();
		return ResponseEntity.ok().body(students);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Student> findById(@PathVariable Long id){
		Student student = studentService.findById(id);
		return ResponseEntity.ok().body(student);
	}
	
}
