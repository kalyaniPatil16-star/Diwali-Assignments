package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeService {
	boolean addEmployee();
	boolean removeEmployee (int id);
	
	List<Employee> displayAll();
	
	List<Employee> displaySortedById();
	
	List<Employee>findByName(String ename);
	
	boolean saveAllToFile();

}
