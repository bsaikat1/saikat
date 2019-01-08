package org.saikat.newlife.service;

import java.util.HashMap;

import org.saikat.newlife.dto.User;

public class LoginService {
	HashMap users=new HashMap();
	public LoginService()
	{
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Dao");
		users.put("jguru", "Java Guru");
		users.put("saikat", "Hey saikat!!");
	}
	public boolean authenticate(String userId ,String password){
		if(password==null || password.trim()==""){
			return false;
		}
		return true;
	}
	public User getUserDetails(String userId){
		User user=new User();
		user.setUserName( (String) users.get(userId));
		user.setUserId(userId);
		
		return user;
	}

}
