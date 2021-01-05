package com.Roster.Roster.Controllers;

import java.util.ArrayList;
import java.util.List;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Roster.Roster.Exception.NoSuchResourceFoundException;
import com.Roster.Roster.Model.Course;
import com.Roster.Roster.Model.Instructor;
import com.Roster.Roster.Model.Roster;
import com.Roster.Roster.Model.Student;

@RestController
public class RosterController {
	
	List<Roster> rosters = new ArrayList<>();
	
	@PostMapping(value = "/Roster")
	@ResponseStatus(HttpStatus.CREATED)
	public Roster addRoster(@RequestBody Roster roster) {
	
		rosters.add(roster);
		return roster;
	}
	
	@GetMapping(value = "/Roster")
	@ResponseStatus(HttpStatus.OK)
	public List<Roster> getRoster(){
		return rosters;
	}
	
	@GetMapping(value = "/Roster/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Roster getPostById(@PathVariable int id) throws NoSuchResourceFoundException {
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		return rosters.get(id);
	}
	
	//////student//////
	@PostMapping(value = "/Roster/{id}/Student")
	@ResponseStatus(HttpStatus.CREATED)
	public Student addStudent(@PathVariable int id, Student student) throws NoSuchResourceFoundException{
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		
		return rosters.get(id).addStudent(student);
	}
	
	@GetMapping(value = "/Roster/{id}/Student")
	@ResponseStatus(HttpStatus.OK)
	public List<Student> getStudent(@PathVariable int id)throws NoSuchResourceFoundException{
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		return rosters.get(id).getStudents();
	}
	
	/////Course///////////
	@PostMapping(value = "/Roster/{id}/Course")
	@ResponseStatus(HttpStatus.CREATED)
	public Course addCourse(@PathVariable int id, Course course) throws NoSuchResourceFoundException{
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		
		return rosters.get(id).addCourse(course);
	}
	
	@GetMapping(value = "/Roster/{id}/Course")
	@ResponseStatus(HttpStatus.OK)
	public List<Course> getCourse(@PathVariable int id)throws NoSuchResourceFoundException{
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		return rosters.get(id).getCourse();
	}
	
	
/////Instructor///////////
	@PostMapping(value = "/Roster/{id}/Instructor")
	@ResponseStatus(HttpStatus.CREATED)
	public Instructor addInstructor(@PathVariable int id, Instructor instructor) throws NoSuchResourceFoundException{
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		
		return rosters.get(id).addInstructor(instructor);
	}
	
	@GetMapping(value = "/Roster/{id}/Instructor")
	@ResponseStatus(HttpStatus.OK)
	public List<Instructor> getInstructor(@PathVariable int id)throws NoSuchResourceFoundException{
		if(id > rosters.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		return rosters.get(id).getInstructor();
	}
	

}
