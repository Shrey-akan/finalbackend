package com.jobsite.oragejobsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobsite.oragejobsite.dao.PostjobDao;
import com.jobsite.oragejobsite.dao.UserDao;
import com.jobsite.oragejobsite.entity.PostJob;
import com.jobsite.oragejobsite.entity.User;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PostjobController {
	@Autowired
	private PostjobDao pjd;
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/jobpostinsert")
	public PostJob jobpostinsert(@RequestBody PostJob pj)
	{
			return pjd.save(pj);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/fetchjobpost")
	public List<PostJob> fetchjobpost(){
		return pjd.findAll();
	}
	
	
}
