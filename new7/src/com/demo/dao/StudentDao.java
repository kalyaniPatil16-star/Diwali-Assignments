package com.demo.dao;

import java.util.List;

import com.demo.bean.Student;

public interface StudentDao {
	void readdata (String fname);
	Object writedata(String fname);
	boolean save(Student s);
	boolean deletebyrollno(int rollno);
	Student findbyrollno(int rollno);
	List<Student> findAll();
	

}
