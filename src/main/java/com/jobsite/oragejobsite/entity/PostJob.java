package com.jobsite.oragejobsite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PostJob {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int jobid;
private String jobtitle;
private String companyforthisjob;
private Long numberofopening;
private String locationjob;
private String jobtype;
private String schedulejob;
private Long payjob;
private Long payjobsup;
private String descriptiondata;
public PostJob() {
	super();
	// TODO Auto-generated constructor stub
}
public PostJob(int jobid, String jobtitle, String companyforthisjob, Long numberofopening, String locationjob,
		String jobtype, String schedulejob, Long payjob, Long payjobsup, String descriptiondata) {
	super();
	this.jobid = jobid;
	this.jobtitle = jobtitle;
	this.companyforthisjob = companyforthisjob;
	this.numberofopening = numberofopening;
	this.locationjob = locationjob;
	this.jobtype = jobtype;
	this.schedulejob = schedulejob;
	this.payjob = payjob;
	this.payjobsup = payjobsup;
	this.descriptiondata = descriptiondata;
}
public int getJobid() {
	return jobid;
}
public void setJobid(int jobid) {
	this.jobid = jobid;
}
public String getJobtitle() {
	return jobtitle;
}
public void setJobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}
public String getCompanyforthisjob() {
	return companyforthisjob;
}
public void setCompanyforthisjob(String companyforthisjob) {
	this.companyforthisjob = companyforthisjob;
}
public Long getNumberofopening() {
	return numberofopening;
}
public void setNumberofopening(Long numberofopening) {
	this.numberofopening = numberofopening;
}
public String getLocationjob() {
	return locationjob;
}
public void setLocationjob(String locationjob) {
	this.locationjob = locationjob;
}
public String getJobtype() {
	return jobtype;
}
public void setJobtype(String jobtype) {
	this.jobtype = jobtype;
}
public String getSchedulejob() {
	return schedulejob;
}
public void setSchedulejob(String schedulejob) {
	this.schedulejob = schedulejob;
}
public Long getPayjob() {
	return payjob;
}
public void setPayjob(Long payjob) {
	this.payjob = payjob;
}
public Long getPayjobsup() {
	return payjobsup;
}
public void setPayjobsup(Long payjobsup) {
	this.payjobsup = payjobsup;
}
public String getDescriptiondata() {
	return descriptiondata;
}
public void setDescriptiondata(String descriptiondata) {
	this.descriptiondata = descriptiondata;
}



}
