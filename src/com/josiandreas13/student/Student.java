package com.josiandreas13.student;

public class Student {

	private String studentName;
	private String studentHobby;
	private Integer age;
	private Integer id;
	
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

	public Integer getAge() {
		return age;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}

