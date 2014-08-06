package edu.pragmatic.inheriratance.homework.user.impl;

import edu.pragmatic.inheriratance.homework.model.user.AdminUser;

public class AdminUserImpl extends AbstractUser implements AdminUser {

	public AdminUserImpl(String name) {
		super(name);
	}

	@Override
	public boolean isAdmin() {
		return true;
	}

	@Override
	public boolean canDeleteUsers() {
		return true;
	}

	@Override
	public boolean canAddUsers() {
		return true;
	}

}
