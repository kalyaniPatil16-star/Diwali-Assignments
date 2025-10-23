package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceimpl implements EmployeeService {
	private EmployeeDao edao;
	
	public EmployeeServiceimpl(){
		super();
		edao=new EmployeeDaoImpl();
	}

	@Override
	public boolean addEmployee() {
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name of the Employee");
		String empName=sc.nextLine();
		
		System.out.println("Enter the Employee ID");
		int empID =sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Role ");
		String empRole=sc.nextLine();
		
		Employee e=new Employee(empName,empID,empRole);
		
		return edao .addnewEmployee(e);
	}

	@Override
	public boolean removeEmployee(int id) {
		// TODO Auto-generated method stub
		return edao.removebyid(id);
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.displayAll();
	}

	@Override
	public List<Employee> displaySortedById() {
		// TODO Auto-generated method stub
		return edao.displaySortedById();
	}

	@Override
	public List<Employee> findByName(String ename) {
		// TODO Auto-generated method stub
		return edao.findByName(ename);
	}

	
	

	@Override
	public boolean saveAllToFile() {
		// TODO Auto-generated method stub
		return edao.saveAllToFile();
	}
	

}
