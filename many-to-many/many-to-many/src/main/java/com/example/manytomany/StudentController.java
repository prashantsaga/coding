package com.example.manytomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
   private StudentService studentService;
	
	@PostMapping
	public ResponseEntity<Student> save(@RequestBody Student student)
	{
		return ResponseEntity.ok(studentService.save(student));
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Student>> list()
	{
		return ResponseEntity.ok(studentService.list());
	}

}
