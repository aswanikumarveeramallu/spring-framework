package com.aswani.personal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aswani.personal.dao.LoginDao;
import com.aswani.personal.dto.Login;

@RestController
public class LoginController {
	@Autowired
	private LoginDao loginDao;

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public boolean authenticate(@RequestBody Login login) {
		System.out.println("-------->");
		return loginDao.isValidUser(login);
	}
}
