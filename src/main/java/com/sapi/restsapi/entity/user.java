package com.sapi.restsapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "fname")
	private String name;
	private String lname;
	private Integer age;
	private String gender;
	private Integer studying;
	private String department;
	private String section;
	private String grade;
	private Integer floor;
	
	


	public user() {
		super();
		
	}



	public user(long id, String name, String lname, Integer age, String gender, Integer studying, String department,
			String section, String grade, Integer floor) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.studying = studying;
		this.department = department;
		this.section = section;
		this.grade = grade;
		this.floor = floor;
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFname() {
		return name;
	}


	public void setFname(String name) {
		this.name = name;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getStudying() {
		return studying;
	}


	public void setStudying(Integer studying) {
		this.studying = studying;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Integer getFloor() {
		return floor;
	}


	public void setFloor(Integer floor) {
		this.floor = floor;
	}


	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", lname=" + lname + ", age=" + age + ", gender=" + gender
				+ ", studying=" + studying + ", department=" + department + ", section=" + section + ", grade=" + grade
				+ ", floor=" + floor + "]";
	}
	
	
	
	

}
