package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	
	long id;
	private int nextId=0;
	String firstName;
	String lastName;
	List<Instructor> instructors = new ArrayList<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Instructor(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Instructor instructor = new Instructor(id, firstName,lastName);
		instructors.add(instructor);
		id = nextId++;
	}
	
	
	
}
