package com.backend.AlAdil.Association.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cases")
public class Case {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String caseName, caseId, address, maritalStatus;
	private int phone;
	
	@CollectionTable(name = "Relatives", joinColumns = @JoinColumn(name = "case_A_id"))
	@ElementCollection
	private List<Relatives> relatives = new ArrayList<Relatives>();
	
	@CollectionTable(name = "SourceOfIncome" , joinColumns = @JoinColumn(name = "case_B_id"))
	@ElementCollection
	private List<SourceOfIncome> income;
	
	@CollectionTable(name = "HealthStatus" , joinColumns = @JoinColumn(name = "case_C_id"))
	@ElementCollection
	private List<HealthStatus> healtstatus;
	
	@CollectionTable(name = "CriminalRecord" , joinColumns = @JoinColumn(name = "case_D_id"))
	@ElementCollection
	private List<CriminalRecord> criminalRecord;
	
	@Embedded
	private MarriageCase marriageCase;
	
	private Expenses expenses;
	private HomeResearch homeResearch;
	private Investment investment;
	private List<String> researchers;
	private String description;
	private CommitteeEvaluation committeeEvaluation;
	private String result;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	public Case() {
		super();
	}

	public Case(Long id, String caseName, String caseId, String address, String maritalStatus, int phone,
			List<Relatives> relatives, List<SourceOfIncome> income, List<HealthStatus> healtstatus,
			List<CriminalRecord> criminalRecord, MarriageCase marriageCase, Expenses expenses,
			HomeResearch homeResearch, Investment investment, List<String> researchers, String description,
			CommitteeEvaluation committeeEvaluation, String result, LocalDate date) {
		super();
		this.id = id;
		this.caseName = caseName;
		this.caseId = caseId;
		this.address = address;
		this.maritalStatus = maritalStatus;
		this.phone = phone;
		this.relatives = relatives;
		this.income = income;
		this.healtstatus = healtstatus;
		this.criminalRecord = criminalRecord;
		this.marriageCase = marriageCase;
		this.expenses = expenses;
		this.homeResearch = homeResearch;
		this.investment = investment;
		this.researchers = researchers;
		this.description = description;
		this.committeeEvaluation = committeeEvaluation;
		this.result = result;
		this.date = date;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public List<Relatives> getRelatives() {
		return relatives;
	}
	public void setRelatives(List<Relatives> relatives) {
		this.relatives = relatives;
	}
	public List<SourceOfIncome> getIncome() {
		return income;
	}
	public void setIncome(List<SourceOfIncome> income) {
		this.income = income;
	}
	public Expenses getExpenses() {
		return expenses;
	}
	public void setExpenses(Expenses expenses) {
		this.expenses = expenses;
	}
	public List<HealthStatus> getHealtstatus() {
		return healtstatus;
	}
	public void setHealtstatus(List<HealthStatus> healtstatus) {
		this.healtstatus = healtstatus;
	}
	public List<CriminalRecord> getCriminalRecord() {
		return criminalRecord;
	}
	public void setCriminalRecord(List<CriminalRecord> criminalRecord) {
		this.criminalRecord = criminalRecord;
	}

	public MarriageCase getMarriageCase() {
		return marriageCase;
	}

	public void setMarriageCase(MarriageCase marriageCase) {
		this.marriageCase = marriageCase;
	}

	public HomeResearch getHomeResearch() {
		return homeResearch;
	}

	public void setHomeResearch(HomeResearch homeResearch) {
		this.homeResearch = homeResearch;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Investment getInvestment() {
		return investment;
	}

	public void setInvestment(Investment investment) {
		this.investment = investment;
	}

	public List<String> getResearchers() {
		return researchers;
	}

	public void setResearchers(List<String> researchers) {
		this.researchers = researchers;
	}

	public CommitteeEvaluation getCommitteeEvaluation() {
		return committeeEvaluation;
	}

	public void setCommitteeEvaluation(CommitteeEvaluation committeeEvaluation) {
		this.committeeEvaluation = committeeEvaluation;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
