package com.jobsite.oragejobsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobsite.oragejobsite.dao.ApplyDao;
import com.jobsite.oragejobsite.dao.ConatctDao;
import com.jobsite.oragejobsite.entity.ApplyJob;
import com.jobsite.oragejobsite.entity.Contact;
import com.jobsite.oragejobsite.entity.PostJob;

@RestController
public class ApplyController {
	@Autowired
	private ApplyDao apd;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertapplyjob")
	public ApplyJob insertapplyjob(@RequestBody ApplyJob applyjob)
	{
			return apd.save(applyjob);
		
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/fetchapplyform")
	public List<ApplyJob> fetchapplyform(){
		return apd.findAll();
	}
}
