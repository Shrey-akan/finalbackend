package com.jobsite.oragejobsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobsite.oragejobsite.entity.Notification;
import com.jobsite.oragejobsite.entity.ResumeBuilder;


@Repository
public interface ResumeDao extends JpaRepository<ResumeBuilder, Integer>{

}
