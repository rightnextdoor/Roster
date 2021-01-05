package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	
	private long id;
	private int nextId=0;
	private String firstName;
	private String lastName;
	List<Student> students = new ArrayList<>();
	Student student; 
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Student(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		student = new Student(id,firstName,lastName);
		students.add(student);
		id = nextId++;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
}
