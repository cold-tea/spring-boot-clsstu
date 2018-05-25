package com.heavenlyhell.stuclass.classroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/classrooms")
public class ClassroomController {
	
	@Autowired
	private ClassroomService classroomService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Classroom>  getAllClassrooms() {
		return classroomService.getAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Classroom  getClassroom(@PathVariable String id) {
		return classroomService.getClassroom(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public List<Classroom>  addClassroom(@RequestBody Classroom classroom) {
		return classroomService.addClassroom(classroom);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public List<Classroom>  updateClassroom(@PathVariable String id, @RequestBody Classroom classroom) {
		return classroomService.updateClassroom(classroom);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public List<Classroom>  deleteClassroom(@PathVariable String id) {
		return classroomService.deleteClassroom(id);
	}
}
