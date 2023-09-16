package com.jobsite.oragejobsite.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jobsite.oragejobsite.dao.UserDao;
import com.jobsite.oragejobsite.entity.PostJob;
import com.jobsite.oragejobsite.entity.User;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserDao ud;
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertusermail")
	public User insertusermail(@RequestBody User c1)
	{
			return ud.save(c1);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/logincheck")
	public User logincheck(@RequestBody User c12, HttpServletResponse response)
	{
		String checkemail = c12.getUserName();
		String checkpass = c12.getUserPassword();
		System.out.println(checkpass+"hello3");
		User checkmail = checkMailUser(checkemail,checkpass);
		 if (checkmail!=null) {
	            // Create and set cookies here
//	            Cookie userCookie = new Cookie("username", checkemail);
//	            userCookie.setMaxAge(3600); // Cookie expires in 1 hour (adjust as needed)
//	            userCookie.setDomain("http://localhost");
//	            response.addCookie(userCookie);
			 
			 Cookie userCookie = new Cookie("user", checkemail);
//			 userCookie.setMaxAge(3600);
//			 userCookie.setDomain(""); // Set the domain to match your frontend
			 response.addCookie(userCookie);

	            return checkmail;
	        }
	        return null;

	}
	private User checkMailUser(String checkemail,String checkpass) {
		System.out.println("hello");
		// TODO Auto-generated method stub
		  List<User> allMails = ud.findAll();
		  for (User u1 : allMails) {
			  System.out.println(checkemail);
		        if (u1.getUserName().equals(checkemail) && u1.getUserPassword().equals(checkpass)) {
		           System.out.println("inside");
		        	return u1; // Email already exists
		        }
		    }
		return null;
	}
	
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/fetchuser")
	public List<User> fetchuser(){
		return ud.findAll();
	}
	

	
}
