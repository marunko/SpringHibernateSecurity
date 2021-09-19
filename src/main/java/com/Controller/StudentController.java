package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Student;
import com.Service.StudentServiceImpl;

@RestController
@RequestMapping(value="/students/")
public class StudentController {
	@Autowired
	StudentServiceImpl studentService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAll(){
		List<Student> list = studentService.getStudents();
		return (list == null) ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
			new ResponseEntity<>(list, HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Student> getById(@PathVariable int id){
		Student student = studentService.getStudent(id);
		return (student == null) ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
			new ResponseEntity<>(student, HttpStatus.OK);
	}
}
