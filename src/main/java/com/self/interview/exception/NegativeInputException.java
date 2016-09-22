package com.self.interview.exception;

public class NegativeInputException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NegativeInputException() {	
		super();
	}
	
	public NegativeInputException(String message, Exception e) {
		super(message, e);
		
	}
	
	public NegativeInputException(String message) {
		super(message);
	}

}
