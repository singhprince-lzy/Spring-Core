package com.prince.spring.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Instructor")
@Scope("singleton")
public class Instructor {
	
	@Value("1")
	private int id=1001;
	
	@Value("Raju Singh")
	private String name;
	
	@Value("#{skills}")
	private List<String> skills;
	
	@Autowired
	private Profile profile;
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", skills=" + skills + ", profile=" + profile + "]";
	}
	
	
	
	
	
	
}
