package com.demo.bean;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID=2L;
    private int rollno;
   private String sname;
	private String course;
	private double attendence_percentage;
	private double score;
	private String grade;
	
	
	public Student(int rollno, String sname, String course, double attendence_percentage, double score) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.attendence_percentage = attendence_percentage;
		this.score = score;
	}


	public Student() {
		super();
		
	}
	
	public Student(int rollno) {
		this.rollno=rollno;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public double getAttendence_percentage() {
		return attendence_percentage;
	}


	public void setAttendence_percentage(double attendence_percentage) {
		this.attendence_percentage = attendence_percentage;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", course=" + course + ", attendence_percentage="
				+ attendence_percentage + ", score=" + score + ", grade=" + grade + "]";
	}


	
	
	
	
}
	
	
	
	