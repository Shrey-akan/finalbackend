package com.jobsite.oragejobsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsite.oragejobsite.entity.Employer;
import com.jobsite.oragejobsite.entity.PostJob;

@Repository
public interface PostjobDao extends JpaRepository<PostJob, Integer>{

}
