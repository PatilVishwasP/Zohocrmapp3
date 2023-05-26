package com.example.marketingapp3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marketingapp3.Entities.Leads;
import com.example.marketingapp3.Repository.LeadsRepository;


@Service
public class LeadsServiceImpl implements LeadsService {
	
	
	@Autowired
	private LeadsRepository leadRepo;
	
	@Override
	public void saveLeads(Leads lead) {
		leadRepo.save(lead);
		return;
	}

	@Override
	public List<Leads> showAllLeads() {
		List<Leads> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deleteLeadsById(int id) {
		leadRepo.deleteById(id);
		}

	@Override
	public Leads findById(int id) {
		Optional<Leads> findById = leadRepo.findById(id);
		return findById.get();
	}

	

}
