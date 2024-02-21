package com.backend.AlAdil.Association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.AlAdil.Association.dto.CaseDto;
import com.backend.AlAdil.Association.entity.Case;
import com.backend.AlAdil.Association.repository.CaseRepository;

@RestController
@RequestMapping("/api/case")
public class CaseController {

	@Autowired
	private CaseRepository caseRepository;
	
	@GetMapping
	public List<Case> getAllCases () {
		return caseRepository.findAll();
	}
	
	@PostMapping
	public Case createCase(@RequestBody Case newCase) {
		return caseRepository.save(newCase);
	}
}
