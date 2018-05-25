package com.heavenlyhell.stuclass.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String id;
	private String name;
	private String email;
	private String address;
	private String classroomId;
	
	public Student() {}
	
	public Student(String id, String name, String email, String address, String classroomId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.classroomId = classroomId;
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(String classroomId) {
		this.classroomId = classroomId;
	}
	
	
}
