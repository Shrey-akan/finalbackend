package com.jobsite.oragejobsite.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobsite.oragejobsite.dao.EmployerDao;
import com.jobsite.oragejobsite.dao.UserDao;
import com.jobsite.oragejobsite.entity.Employer;
import com.jobsite.oragejobsite.entity.PostJob;
import com.jobsite.oragejobsite.entity.User;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployerController {
	@Autowired
	private EmployerDao ed;
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertemployer")
	public Employer insertemployer(@RequestBody Employer emp)
	{
		
			return ed.save(emp);
		
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/insertemployeremail")
	public Employer insertemployeremail(@RequestBody Map<String, String> requestBody) {
	    String empmailid = requestBody.get("empmailid");
	    
	    if (empmailid != null) {
	        Employer employer = new Employer();
	        employer.setEmpmailid(empmailid);

	        // Log the employer object before saving
	        System.out.println("Employer object to be saved: " + employer.toString());

	        return ed.save(employer);
	    } else {
	        // Handle the case when empmailid is missing or null
	        return null; // or return an error response
	    }
	}

	
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/logincheckemp")
	public Employer logincheckemp(@RequestBody Employer e12, HttpServletResponse response)
	{
		String checkemail = e12.getEmpmailid();
		String checkpass = e12.getEmppass();
		System.out.println(checkemail +"this "+ checkpass);
		
		Employer checkmail = checkMailUser(checkemail,checkpass);
		 if (checkmail!=null) {
	            // Create and set cookies here
//	            Cookie userCookie = new Cookie("username", checkemail);
//	            userCookie.setMaxAge(3600); // Cookie expires in 1 hour (adjust as needed)
//	            userCookie.setDomain("http://localhost");
//	            response.addCookie(userCookie);
			 
			 Cookie employerCookie = new Cookie("emp", checkmail.toString());
//			 userCookie.setMaxAge(3600);
//			 userCookie.setDomain(""); // Set the domain to match your frontend
			 response.addCookie(employerCookie);
			 
	            return checkmail;
	        }
	        return new Employer();
		
			
		
	}
	private Employer checkMailUser(String checkemail, String checkpass) {
		

		  
		  System.out.println("hello");
			// TODO Auto-generated method stub
			  List<Employer> allMails = ed.findAll();
			  for (Employer u1 : allMails) {
				  System.out.println(checkemail);
			        if (u1.getEmpmailid().equals(checkemail) && u1.getEmppass().equals(checkpass)) {
			           System.out.println("inside");
			        	return u1; // Email already exists
			        }
			    }
			return null;
		  
//		return new Employer();
	}
	
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/fetchemployer")
	public List<Employer> fetchemployer(){
		return ed.findAll();
	}
}
