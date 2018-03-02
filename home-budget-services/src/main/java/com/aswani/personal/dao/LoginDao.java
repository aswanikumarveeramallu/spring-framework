package com.aswani.personal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.aswani.personal.dto.Login;

@Component
public class LoginDao {
	@Autowired
	private JdbcTemplate template;

	public boolean isValidUser(final Login login) {
	    String rowExist = template.queryForObject("select  user_name from login where user_name='"+login.getUsername()+"' and password='"+login.getPassword()+"'",String.class);
		return !"".equals(rowExist);
	}

}
