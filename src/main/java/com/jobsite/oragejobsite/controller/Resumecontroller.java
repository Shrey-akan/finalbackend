package com.jobsite.oragejobsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobsite.oragejobsite.dao.ResumeDao;
import com.jobsite.oragejobsite.entity.PostJob;
import com.jobsite.oragejobsite.entity.ResumeBuilder;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Resumecontroller {
	
	@Autowired
	private ResumeDao rm;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/resumeinsert")
	public ResumeBuilder resumeinsert(@RequestBody ResumeBuilder rmm)
	{
			return rm.save(rmm);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/fetchresumedetails")
	public List<ResumeBuilder> fetchresumedetails(){
		return rm.findAll();
	}
	
	
	
	
	
}
