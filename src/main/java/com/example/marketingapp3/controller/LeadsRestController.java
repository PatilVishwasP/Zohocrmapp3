package com.example.marketingapp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.marketingapp3.DTO.LeadsDto;
import com.example.marketingapp3.Entities.Leads;
import com.example.marketingapp3.Repository.LeadsRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadsRestController {
	
	@Autowired
	private LeadsRepository leadRepo;
	
	//http://localhost:8080/api/leads
	@GetMapping
	public List<Leads> getAllLeads(){
		List<Leads> leads = leadRepo.findAll();
		return leads;	
	}
	
	@PostMapping
	public void saveLeads(@RequestBody Leads lead) {
		 leadRepo.save(lead);
	}
	
	//http://localhost:8080/api/leads/1
	@DeleteMapping("/{id}")
	public void deleteLeads(@PathVariable("id") int id) {
	leadRepo.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updateLeads(@RequestBody LeadsDto dto, @PathVariable("id") int id) {
		Leads l = new Leads();
		l.setId(id);
		l.setFirstName(dto.getFirstName());
		l.setLastName(dto.getLastName());
		l.setEmail(dto.getEmail());
		l.setMobile(dto.getMobile());
		leadRepo.save(l);
	}

}
