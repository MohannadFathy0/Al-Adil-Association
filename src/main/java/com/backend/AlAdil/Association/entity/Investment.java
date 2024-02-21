package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Investment {
	private String investmentType, investmentAdministrator;
	private int cost, profit;
	public Investment() {
		super();
	}
	public Investment(String investmentType, String investmentAdministrator, int cost, int profit) {
		super();
		this.investmentType = investmentType;
		this.investmentAdministrator = investmentAdministrator;
		this.cost = cost;
		this.profit = profit;
	}
	public String getInvestmentType() {
		return investmentType;
	}
	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}
	public String getInvestmentAdministrator() {
		return investmentAdministrator;
	}
	public void setInvestmentAdministrator(String investmentAdministrator) {
		this.investmentAdministrator = investmentAdministrator;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
}
