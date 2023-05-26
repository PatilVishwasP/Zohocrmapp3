package com.example.marketingapp3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marketingapp3.Entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Integer> {

}
