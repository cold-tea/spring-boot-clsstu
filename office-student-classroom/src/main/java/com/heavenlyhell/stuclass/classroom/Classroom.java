package com.heavenlyhell.stuclass.classroom;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Classroom {

	private String id;
	private String description;

	public Classroom() {}

	public Classroom(String id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
