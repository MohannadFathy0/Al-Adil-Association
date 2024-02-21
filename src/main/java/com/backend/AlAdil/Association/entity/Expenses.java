package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Expenses {
	private int treatment, transport, tuitionFees, Electricity, gasBills, rent;

	public Expenses(int treatment, int transport, int tuitionFees, int electricity, int gasBills, int rent) {
		super();
		this.treatment = treatment;
		this.transport = transport;
		this.tuitionFees = tuitionFees;
		Electricity = electricity;
		this.gasBills = gasBills;
		this.rent = rent;
	}

	public Expenses() {
		super();
	}

	public int getTreatment() {
		return treatment;
	}

	public void setTreatment(int treatment) {
		this.treatment = treatment;
	}

	public int getTransport() {
		return transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public int getTuitionFees() {
		return tuitionFees;
	}

	public void setTuitionFees(int tuitionFees) {
		this.tuitionFees = tuitionFees;
	}

	public int getElectricity() {
		return Electricity;
	}

	public void setElectricity(int electricity) {
		Electricity = electricity;
	}

	public int getGasBills() {
		return gasBills;
	}

	public void setGasBills(int gasBills) {
		this.gasBills = gasBills;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}
	
	

}
