package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class HealthStatus {

	private String patientName, healthStatus;
	private int insurance, stateSupport, selfPaid;
	public HealthStatus() {
		super();
	}
	public HealthStatus(String patientName, String healthStatus, int insurance, int stateSupport, int selfPaid) {
		super();
		this.patientName = patientName;
		this.healthStatus = healthStatus;
		this.insurance = insurance;
		this.stateSupport = stateSupport;
		this.selfPaid = selfPaid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public int getStateSupport() {
		return stateSupport;
	}
	public void setStateSupport(int stateSupport) {
		this.stateSupport = stateSupport;
	}
	public int getSelfPaid() {
		return selfPaid;
	}
	public void setSelfPaid(int selfPaid) {
		this.selfPaid = selfPaid;
	}
}
