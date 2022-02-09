package com.ait;

public class Student
{
	private int sid;
	private String sname;
	private String lname;
	
	private int percent;
	private Course course;
	private Trainer trainer;
	
	
	
	public Student(String sname, String lname) {
		super();
		this.sname = sname;
		this.lname = lname;
	}
	
	public Student(int sid, String sname) {
		super();
		System.out.println("in 5");
		this.sid = sid;
		this.sname = sname;
		
	}

	public Student( String sname,int sid) {
		super();
		System.out.println("in 5");
		this.sid = sid;
		this.sname = sname;
		
	}
	public Student(Course course, Trainer trainer,int sid, String sname, int percent) {
		super();
		System.out.println("in 2");
		this.course = course;
		this.trainer = trainer;
	}

	
	
	
	public Student() {
		super();
		System.out.println("in default constructor of student");
		// TODO Auto-generated constructor stub
	}
	
	
	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		System.out.println("in setter of course");
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("in sid setter");
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
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", lname=" + lname + ", percent=" + percent + ", course="
				+ course + ", trainer=" + trainer + "]";
	}
	

}
