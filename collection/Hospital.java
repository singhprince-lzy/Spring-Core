package com.prince.spring.collection;

import java.util.List;

public class Hospital {
	private int id;
	private List<String>departments;

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", departments=" + departments + "]";
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
