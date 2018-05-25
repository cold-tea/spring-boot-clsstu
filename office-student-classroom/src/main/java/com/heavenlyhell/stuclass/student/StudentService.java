package com.heavenlyhell.stuclass.student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getById(String studentId) {
		return studentRepository.findOne(studentId);
	}
	
	public List<Student> getByClassroom(String classroomId) {
		List<Student> students = new ArrayList<>();
		studentRepository.findByClassroomId(classroomId).forEach(students::add);
		return students;
	}
	
	public List<Student> deleteStudent(String id) {
		studentRepository.delete(id);
		return getAll();
	}
	
	public List<Student> addStudent(Student student) {
		try {
			studentRepository.save(student);
		} catch (DataIntegrityViolationException ex) {
			logger.error("Data Violation Exception");
		} catch (ConstraintViolationException ex) {
			logger.error("Constaint Violation Exception");
		}
		return getAll();
	}
	
	public List<Student> updateStudent(Student student) {
		try {
			studentRepository.save(student);
		} catch (DataIntegrityViolationException ex) {
			logger.error("Data Violation Exception");
		} catch (ConstraintViolationException ex) {
			logger.error("Constaint Violation Exception");
		}
		return getAll();
	}
}
