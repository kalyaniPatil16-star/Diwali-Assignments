package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDao {
	boolean addnewEmployee(Employee e);
	
	boolean removebyid(int id);
	
	List<Employee> displayAll();
	
	List<Employee>displaySortedById();
	
	List<Employee>findByName(String empname);

	boolean saveAllToFile();
}
