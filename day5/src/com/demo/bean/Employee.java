package com.demo.bean;

import java.io.Serializable;

public class Employee implements Serializable,Comparable<Employee> {
	
	public String empName;
	public int empid;
	public String emprole;

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, int empid, String emprole) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.emprole = emprole;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmprole() {
		return emprole;
	}
	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid + ", emprole=" + emprole + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.empid, o.empid);
	}

}
