package com.demo.bean;

import com.demo.exception.WrongOperatorException;

public class Calculator {
	public static int calculate(int num1,int num2,String Operation) throws WrongOperatorException{
		switch(Operation) {
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			if(num2==0) {
				throw new ArithmeticException("divide by zero is not allowed:");
			}
			return num1/num2;
			
		case "%":
			return num1%num2;
			
			
			default:
				throw new WrongOperatorException("Invalid operation:"+Operation);
		
		}
		
			
		
	}

}
