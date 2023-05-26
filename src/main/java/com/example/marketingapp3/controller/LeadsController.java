package com.example.marketingapp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.marketingapp3.DTO.LeadsDto;
import com.example.marketingapp3.Entities.Leads;
import com.example.marketingapp3.service.LeadsService;
import com.example.marketingapp3.utility.MailService;

@Controller
public class LeadsController {
	
	@Autowired
	private MailService mailService;
	
	@Autowired
	private LeadsService leadservice;
	
	//http:localhost:8080/create
	@RequestMapping("/create")
	public String createLead() {
		return "create_Lead";
	}
	
	@RequestMapping("/createLead")
	public String saveLeads(Leads lead, Model model) {
		mailService.sendMail(lead.getEmail(), "sub", "msg");
		leadservice.saveLeads(lead);
		model.addAttribute("msg", "Record is saved");
		return "create_Lead";
	}
	
	//http:localhost:8080/showLeads
	@RequestMapping("/showLeads")
	public String showAllLeads(Model model) {
		List<Leads> leads = leadservice.showAllLeads();
		model.addAttribute("leads", leads);
		return "showAllLeads";
	}
	
	@RequestMapping("/delete")
	public String deleteLeadsById(@RequestParam("id")int id, Model model ) {
		leadservice.deleteLeadsById(id);
		List<Leads> leads = leadservice.showAllLeads();
		model.addAttribute("leads", leads);
		return "showAllLeads";
	}
	
	@RequestMapping("/update")
	public String findById(@RequestParam("id")int id, Model model) {
		Leads leads = leadservice.findById(id);
		model.addAttribute("leads", leads);
		return "update_leads";
	}
	
	@RequestMapping("/updateLead")
	public String updateLeadsById(LeadsDto dto, Model model) {
		Leads l = new Leads();
		l.setId(dto.getId());
		l.setFirstName(dto.getFirstName());
		l.setLastName(dto.getLastName());
		l.setEmail(dto.getEmail());
		l.setMobile(dto.getMobile());
		leadservice.saveLeads(l);
		List<Leads> leads = leadservice.showAllLeads();
		model.addAttribute("leads", leads);
		return "showAllLeads";
	}

}
