package edu.pragmatic.inheriratance.homework.user.impl;


public class UserImpl extends AbstractUser {
	
	public UserImpl(String name) {
		super(name);
	}

	@Override
	public boolean isAdmin() {
		return false;
	}

}
