package com.heavenlyhell.stuclass.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
	List<Student> findByClassroomId(String classroomId);
}