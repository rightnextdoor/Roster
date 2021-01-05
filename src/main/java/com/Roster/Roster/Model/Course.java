package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;



public class Course {
	
	
	private long id;
	private int nextId=0;
	private String title;
	private String cat_id;
	private String section;
	List<Course> courses = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Course(long id, String title, String cat_id, String section) {
		super();
		this.id = id;
		this.title = title;
		this.cat_id = cat_id;
		this.section = section;
		Course course = new Course(id,title, cat_id, section);
		courses.add(course);
		id = nextId++;
	}
	
}
