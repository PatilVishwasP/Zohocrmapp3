package com.example.marketingapp3.service;

import java.util.List;

import com.example.marketingapp3.Entities.Leads;

public interface LeadsService {
	
	public void saveLeads(Leads lead);

	public List<Leads> showAllLeads();

	public void deleteLeadsById(int id);

	public Leads findById(int id);

}
