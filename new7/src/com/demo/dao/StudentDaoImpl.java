package com.demo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Student;

public class StudentDaoImpl implements StudentDao{
	
	private static List<Student> StudentList;
	static {
		StudentList=new ArrayList<>();
	}
	

	@Override
	public void readdata(String fname) {
		File f=new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname))){
				StudentList=(List<Student>)ois.readObject();
				System.out.println("data found:"+StudentList.size());
				
			}catch(IOException|ClassNotFoundException e) {
				System.err.println("not found"+e.getMessage());
			}
		}
		
		
	}

	@Override
	public void writedata(String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname))){
			oos.writeObject(StudentList);
			System.out.println("data write"+fname);
			
		}catch(IOException e) {
			System.err.println("not found"+e.getMessage());
		}
		
	}

	@Override
	public boolean save(Student s) {
	
		return StudentList.add(s);
	}

	@Override
	public boolean deletebyrollno(int rollno) {
	
		return StudentList .remove(new Student(rollno));
	}

	@Override
	public Student findbyrollno(int rollno) {
		int pos=StudentList.indexOf(new Student(rollno));
		
		
		return pos!=-1 ? StudentList.get(pos):null;
	}

	@Override
	public List<Student> findAll() {

		return StudentList;
	}

}
