package com.jobsite.oragejobsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsite.oragejobsite.entity.ApplyJob;
import com.jobsite.oragejobsite.entity.Contact;

@Repository
public interface ApplyDao extends JpaRepository<ApplyJob, Integer>{

}
