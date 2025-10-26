
package com.demo.test;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;
import java.util.List;
import java.util.Scanner;

public class Studenttest {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StudentService sservice = new StudentServiceImpl();
	        sservice.readFile("studentdata1.txt");

	        int ch;
	        do {
	            System.out.println("\n1. Add Student  2. Display All  3. Find by Roll  4. Delete by Roll  5. Sort by Attendance  6. Recalculate Grades  7. Exit");
	            System.out.print("Choice: ");
	            ch = sc.hasNextInt() ? sc.nextInt() : -1;
	            sc.nextLine(); // consume newline

	            switch(ch) {
	                case 1 -> sservice.addnewStudent();
	                case 2 -> sservice.displayAllStudent().forEach(System.out::println);
	                case 3 -> {
	                    System.out.print("Roll No: ");
	                    Student s = sservice.findStudent(sc.nextInt());
	                    System.out.println(s != null ? s : "Student not found");
	                }
	                case 4 -> {
	                    System.out.print("Roll No: ");
	                    System.out.println(sservice.removeStudent(sc.nextInt()) ? "Deleted" : "Not found");
	                }
	                case 5 -> sservice.getSortedByAttendence().forEach(System.out::println);
	                case 6 -> sservice.processgrade();
	                case 7 -> sservice.closeapp();
	                default -> System.out.println("Invalid choice");
	            }
	        } while (ch != 7);

	        sc.close();
	    }
	}


}
