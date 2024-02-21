package com.backend.AlAdil.Association.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class MarriageCase {
	private String brideName;
	@Column(name = "cost", insertable = false, updatable = false)
	private int cost;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate marriageContractDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate marriageDate;
	private String wasPurchased, requirements;
	
	public MarriageCase() {
		super();
	}
	public MarriageCase(String brideName, int cost, LocalDate marriageContractDate, LocalDate marriageDate,
			String wasPurchased, String requirements) {
		super();
		this.brideName = brideName;
		this.cost = cost;
		this.marriageContractDate = marriageContractDate;
		this.marriageDate = marriageDate;
		this.wasPurchased = wasPurchased;
		this.requirements = requirements;
	}
	public String getBrideName() {
		return brideName;
	}
	public void setBrideName(String brideName) {
		this.brideName = brideName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public LocalDate getMarriageContractDate() {
		return marriageContractDate;
	}
	public void setMarriageContractDate(LocalDate marriageContractDate) {
		this.marriageContractDate = marriageContractDate;
	}
	public LocalDate getMarriageDate() {
		return marriageDate;
	}
	public void setMarriageDate(LocalDate marriageDate) {
		this.marriageDate = marriageDate;
	}
	public String getWasPurchased() {
		return wasPurchased;
	}
	public void setWasPurchased(String wasPurchased) {
		this.wasPurchased = wasPurchased;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
}
