package edu.pragmatic.inheriratance.homework.model.user;

import java.util.Date;

/**
 * This interface represents a forum user
 */
public interface User {
	
	/**
	 * @return determines if the user provided is an admin
	 */
	boolean isAdmin();
	
	/**
	 * @return returns this user's name
	 */
	String getName();
	
	boolean isLoggedIn();
	
	void login();
	
	void logout();
	
	Date getCreationDate();
	
}
