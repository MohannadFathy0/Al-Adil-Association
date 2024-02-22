package com.backend.AlAdil.Association.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@PutMapping("/{id}")
	public ResponseEntity<Case> updateCase(@PathVariable Long id, @RequestBody Case oldCase) {
		if (!caseRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		oldCase.setId(id);
		Case updatedProduct = caseRepository.save(oldCase);
		return ResponseEntity.ok(updatedProduct);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCase(@PathVariable Long id) {
		if (!caseRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		caseRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
