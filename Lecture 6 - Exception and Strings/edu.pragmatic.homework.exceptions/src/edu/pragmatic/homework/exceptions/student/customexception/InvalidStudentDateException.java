package edu.pragmatic.homework.exceptions.student.customexception;

public class InvalidStudentDateException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidStudentDateException(String msg) {
		super(msg);
	}

}
