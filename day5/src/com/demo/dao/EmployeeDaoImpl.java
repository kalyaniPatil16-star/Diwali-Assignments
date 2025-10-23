package com.demo.dao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


import com.demo.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elst;
	static {
		elst=new ArrayList<>();
		elst.add(new Employee("kalyani",101,"dev"));
		elst.add(new Employee("xyz",102,"dev"));
		elst.add(new Employee("abc",103,"sales"));
	}
	public boolean addnewEmployee(Employee e) {
		
		elst.add(e);
		return true;
	}
	@Override
	public boolean removebyid(int id) {
		for(int i=0;i<elst.size();i++) {
			if(elst.get(i).getEmpid()==id) {
				elst.remove(i);
			}
		}
		return false;
	}
	@Override
	public List<Employee> displayAll() {
		
		return elst;
	}
	@Override
	public List<Employee> displaySortedById() {
		List<Employee>SortedList=new ArrayList<>(elst);
		Collections.sort(SortedList);
		
		
		return SortedList;
	}
	@Override
	public List<Employee> findByName(String empname) {
		List<Employee> result = new ArrayList<>();
        for (Employee e : elst) {
            if (e.getEmpName().equals(empname)) {
                result.add(e);
            }
        }
        return result.isEmpty() ? null : result;
	}
	@Override
	
		public boolean saveAllToFile() {
			// TODO Auto-generated method stub
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
	            oos.writeObject(elst);
	            return true;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        }
		


	
	
	}
	
	
}
