package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;



public class Roster {
	
	
	List<Roster> rosters = new ArrayList<Roster>();
	
	private long id;
	private int nextId=0;
	
	private long student_id;
	private long course_id;
	private long instructor_id;
	
	List<Student> students = new ArrayList<>();
	List<Course> courses = new ArrayList<>();
	List<Instructor> instructors = new ArrayList<>();
	
	public Roster(){	
		id = nextId++;
	}
	public List<Roster> getRosters() {
		return rosters;
	}
	public void setRosters(List<Roster> rosters) {
		this.rosters = rosters;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}
	public long getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(long instructor_id) {
		this.instructor_id = instructor_id;
	}
	public Roster(long student_id, long course_id, long instructor_id) {
		
		this.student_id = student_id;
		this.course_id = course_id;
		this.instructor_id = instructor_id;
		Roster roster = new Roster(student_id, course_id, instructor_id);
		rosters.add(roster);
	}
	
	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}
	
	public List<Student> getStudents(){
		
		return students;
	}
	
	public Course addCourse(Course course) {
		courses.add(course);
		return course;
	}
	
	public List<Course> getCourse(){
		return courses;
	}
	
	public Instructor addInstructor(Instructor instructor) {
		instructors.add(instructor);
		return instructor;
	}
	
	public List<Instructor> getInstructor(){
		return instructors;
	}

}
