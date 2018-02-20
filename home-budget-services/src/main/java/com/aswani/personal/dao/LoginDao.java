package com.aswani.personal.dao;

import org.springframework.stereotype.Component;

import com.aswani.personal.dto.Login;

@Component
public class LoginDao {
	
	public boolean isValidUser(final Login login){
		return false;
	}

}
