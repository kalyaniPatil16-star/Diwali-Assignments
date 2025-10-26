package com.demo.exception;

public class LowAttendenceException extends Exception {
	public static final long serialVersionUID=1L;
	
	public LowAttendenceException (String message) {
		super(message);
	}

}
