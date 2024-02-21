package com.backend.AlAdil.Association.dto;

import lombok.Data;

@Data
public class CaseDto {
	private String caseName, caseId, address, maritalStatus;
	private int phone;
	private Long id;
	private String name, relation, academicYear, school, qualification, job, reasonForNotWorking;
	public CaseDto(String caseName, String caseId, String address, String maritalStatus, int phone, Long id,
			String name, String relation, String academicYear, String school, String qualification, String job,
			String reasonForNotWorking) {
		super();
		this.caseName = caseName;
		this.caseId = caseId;
		this.address = address;
		this.maritalStatus = maritalStatus;
		this.phone = phone;
		this.id = id;
		this.name = name;
		this.relation = relation;
		this.academicYear = academicYear;
		this.school = school;
		this.qualification = qualification;
		this.job = job;
		this.reasonForNotWorking = reasonForNotWorking;
	}
	public String getCaseName() {
		return caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
