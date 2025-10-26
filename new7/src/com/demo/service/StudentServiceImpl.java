package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.exception.LowAttendenceException;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao sdao=new StudentDaoImpl();
    private Scanner sc=new Scanner(System.in);
    private final String File_name="studentdata.txt";
    
    private String Calculategrade(Student student) throws LowAttendenceException{
    	if(student.getAttendence_percentage()<60) {
    		throw new LowAttendenceException("less grade");
    		
    		
    	}
    	double score=student.getScore();
    	if(score<=90)return "A";
    	else if(score<=80)return "B";
    	else if(score<=70)return "c";
		return "fail";
    	
    }
    private void createInitialData() {
      
        sdao.save(new Student(101, "Abc", "CS", 92.5, 95.0));
        sdao.save(new Student(102, "cde", "EE", 55.0, 88.0));  
        sdao.save(new Student(103, "Cat", "ME", 78.0, 75.0));
        sdao.save(new Student(104, "Def", "CE", 85.0, 82.0));
        sdao.save(new Student(105, "Efg", "CS", 45.0, 99.0));   
        sdao.save(new Student(106, "Fgh", "EE", 90.0, 91.0));
        sdao.save(new Student(107, "Ghk", "ME", 60.0, 65.0)); 
        sdao.save(new Student(108, "Hij", "CE", 65.0, 78.0));
        sdao.save(new Student(109, "Iii", "CS", 80.0, 89.0));
        sdao.save(new Student(110, "Jik", "EE", 59.9, 72.0)); 
    }
	@Override
	public void readFile(String fname) {
		sdao.readdata(fname);
			
		
		if(sdao.findAll().isEmpty()) {
			createInitialData();
	        processgrade();
		}
		
		
	}

	@Override
	public boolean addnewStudent() {
		
	
		    System.out.print("Enter Roll No: ");
		    int rollno = sc.nextInt();
		    
		    System.out.print("Enter Name: ");
		    String sname = sc.nextLine();
		    System.out.print("Enter Course: ");
		    String course = sc.nextLine();
		    System.out.print("Enter Attendance %: ");
		    double attendance = sc.nextDouble();
		    System.out.print("Enter Score: ");
		    double score = sc.nextDouble();

		    Student newStudent = new Student(rollno, sname, course, attendance, score);

		    try {
		        newStudent.setGrade(Calculategrade(newStudent));
		    } catch (LowAttendenceException e) {
		        newStudent.setGrade("N/A");
		    }

		    return sdao.save(newStudent);
		}

	

	@Override
	public boolean removeStudent(int rollno) {
		
		return sdao.deletebyrollno(rollno);
	}

	@Override
	public Student findStudent(int rollno) {
		
		return sdao.findbyrollno(rollno);
	}

	@Override
	public List<Student> displayAllStudent() {
		
		return sdao.findAll();
	}

	@Override
	public List<Student> getSortedByAttendence() {
	
		return null;
	}
	@Override
	public void processgrade() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeapp() {
		// TODO Auto-generated method stub
		
	}



	
}
