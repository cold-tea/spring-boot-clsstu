package com.heavenlyhell.stuclass.classroom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {

	@Autowired
	private ClassroomRepository classroomRepository;
	
	public List<Classroom> getAll() {
		List<Classroom> classrooms = new ArrayList<>();
		classroomRepository.findAll().forEach(classrooms::add);
		return classrooms;
	}
	
	public Classroom getClassroom(String id) {
		return classroomRepository.findOne(id);
	}
	
	public List<Classroom> addClassroom(Classroom classroom) {
		classroomRepository.save(classroom);
		return getAll();
	}
	
	public List<Classroom> updateClassroom(Classroom classroom) {
		classroomRepository.save(classroom);
		return getAll();
	}
	
	public List<Classroom> deleteClassroom(String id) {
		classroomRepository.delete(id);
		return getAll();
	}
}
