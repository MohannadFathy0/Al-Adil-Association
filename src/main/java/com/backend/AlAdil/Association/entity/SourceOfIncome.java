package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class SourceOfIncome {
	
	private String source, sourceType, worker;
	private int income;
	
	public SourceOfIncome() {
		super();
	}
	public SourceOfIncome(String source, String sourceType, String worker, int income) {
		super();
		this.source = source;
		this.sourceType = sourceType;
		this.worker = worker;
		this.income = income;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getWorker() {
		return worker;
	}
	public void setWorker(String worker) {
		this.worker = worker;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
}
