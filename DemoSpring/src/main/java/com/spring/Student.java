package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
private int sid;
private String sname;
private int percent;
private Course course;
private Trainer trainer;

public Student() {
	super();
	System.out.println("In default constructor of student");
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sname, int percent, Course course, Trainer trainer) {
	super();
	System.out.println("In parameterized constructor of student");
	this.sid = sid;
	this.sname = sname;
	this.percent = percent;
	this.course = course;
	this.trainer = trainer;
}

public Student(int sid, String sname, int percent) {
	super();
	System.out.println("In parameterized constructor of student");
	this.sid = sid;
	this.sname = sname;
	this.percent = percent;
}
public Student(Course course, Trainer trainer) {
	super();
	this.course = course;
	this.trainer = trainer;
}

@Autowired
public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}
public Trainer getTrainer() {
	return trainer;
}
public Course getCourse() {
	return course;
}
@Autowired
public void setCourse(Course course) {
	System.out.println("In course setter method");
	this.course = course;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + ", course=" + course + ", trainer="
			+ trainer + "]";
}
public int getSid() {
	System.out.println("In sid setter method");
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getPercent() {
	return percent;
}
public void setPercent(int percent) {
	this.percent = percent;
}

}
