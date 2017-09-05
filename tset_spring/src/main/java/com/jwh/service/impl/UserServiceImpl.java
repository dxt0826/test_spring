package com.jwh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jwh.dao.UserDAO;
import com.jwh.service.UserService;
//springÈÝÆ÷
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	

	public UserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


	public void insert() {
		
		userDAO.add();
		
	}

}
