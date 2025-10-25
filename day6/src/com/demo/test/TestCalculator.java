package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Calculator;
import com.demo.exception.WrongOperatorException;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int choice;
		do {
		 
		System.out.println("calculation");
		System.out.println("perform operation");
		System.out.println("exit");
		System.out.println("enter choice:");
		 choice=Sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 System.out.println("Enter First Number:");
			 int number1=Sc.nextInt();
			 
			 System.out.println("enter Second NUmber");
			 int number2=Sc.nextInt();
			 
			 System.out.println("enter operation:");
			 String op=Sc.next();
			 
			 try {
				 int result=Calculator.calculate(number1, number2, op);
				 System.out.println("result"+result);
			 }catch(WrongOperatorException e) {
				 System.out.println("error"+e.getMessage());
				 
			 }catch(ArithmeticException e) {
				 System.out.println("math error"+e.getMessage());
				 
			 }
			 break;
			 
		 case 2:
			 System.out.println("exit");
			 break;
			 
			 default:
				 System.out.println("invalid ");
		 }
	
		

	}while(choice!=-1);
		Sc.close();
	}

}
