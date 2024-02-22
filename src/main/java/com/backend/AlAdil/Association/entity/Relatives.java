package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Embeddable
public class Relatives {
	private String name, relation, academicYear, school, qualification, job, reasonForNotWorking;
	
	public Relatives() {
		super();
	}
	public Relatives(String name, String relation, String academicYear, String school, String qualification,
			String job, String reasonForNotWorking) {
		super();
		this.name = name;
		this.relation = relation;
		this.academicYear = academicYear;
		this.school = school;
		this.qualification = qualification;
		this.job = job;
		this.reasonForNotWorking = reasonForNotWorking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getReasonForNotWorking() {
		return reasonForNotWorking;
	}
	public void setReasonForNotWorking(String reasonForNotWorking) {
		this.reasonForNotWorking = reasonForNotWorking;
	}
	
	
}
