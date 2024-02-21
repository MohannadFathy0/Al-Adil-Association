package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class CriminalRecord {
	private String name, criminalCase;

	public CriminalRecord() {
		super();
	}

	public CriminalRecord(String name, String criminalCase) {
		super();
		this.name = name;
		this.criminalCase = criminalCase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCriminalCase() {
		return criminalCase;
	}

	public void setCriminalCase(String criminalCase) {
		this.criminalCase = criminalCase;
	}
	
}
