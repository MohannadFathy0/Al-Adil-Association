package com.backend.AlAdil.Association.entity;

import java.util.List;

import jakarta.persistence.Embeddable;

@Embeddable
public class CommitteeEvaluation {
	
	private List<String> names;
	private List<Integer> grades;
	public CommitteeEvaluation() {
		super();
	}
	
	public CommitteeEvaluation(List<String> names, List<Integer> grades) {
		super();
		this.names = names;
		this.grades = grades;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<Integer> getGrades() {
		return grades;
	}
	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	
}
