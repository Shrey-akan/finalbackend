package com.jobsite.oragejobsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobsite.oragejobsite.dao.ConatctDao;
import com.jobsite.oragejobsite.entity.Contact;
import com.jobsite.oragejobsite.entity.Employer;
import com.jobsite.oragejobsite.entity.PostJob;

@RestController
public class ContactController {
	@Autowired
	private ConatctDao cd;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertcontact")
	public Contact insertcontact(@RequestBody Contact contact)
	{
			return cd.save(contact);
		
	}
	
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/fetchcontact")
	public List<Contact> fetchcontact(){
		return cd.findAll();
	}
}
