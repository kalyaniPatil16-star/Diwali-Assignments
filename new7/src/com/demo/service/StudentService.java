package com.demo.service;

import java.util.List;

import com.demo.bean.Student;

public interface StudentService {
	
	void readFile(String fname);
	boolean addnewStudent();
	boolean removeStudent(int rollno);
	Student findStudent(int rollno);
	List<Student>displayAllStudent();
	List<Student>getSortedByAttendence();
	void processgrade();
	void closeapp();

}
