package com.heavenlyhell.stuclass.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public List<Student> addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public List<Student> updateStudent(@PathVariable String id, @RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable String id) {
		return studentService.getById(id);
	}
	
	@RequestMapping(value = "/classrooms/{id}", method = RequestMethod.GET)
	public List<Student> getStudentByClassroom(@PathVariable String id) {
		return studentService.getByClassroom(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public List<Student> deleteStudent(@PathVariable String id) {
		return studentService.deleteStudent(id);
	}
}
