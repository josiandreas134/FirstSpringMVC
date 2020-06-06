package com.josiandreas13.student;

import javax.validation.constraints.Max;  
import javax.validation.constraints.Min;  

import java.util.ArrayList;
import java.util.Date;

public class Student {

	private String studentName;
	private String studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
    @Min(value=18, message="must be equal or greater than 18")  
    @Max(value=45, message="must be equal or less than 45")  
	private int age;
	private int id;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String StudentName) {
		this.studentName = StudentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String StudentHobby) {
		this.studentHobby = StudentHobby;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
}

