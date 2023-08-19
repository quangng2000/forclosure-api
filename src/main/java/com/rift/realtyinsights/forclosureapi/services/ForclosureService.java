package com.rift.realtyinsights.forclosureapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rift.realtyinsights.forclosureapi.dto.TaxAuctionDto;
import com.rift.realtyinsights.forclosureapi.repository.TaxAuctionRepo;

@Service
public class ForclosureService {
	
	@Autowired
	private TaxAuctionRepo repo;
	
	public List<TaxAuctionDto> getForclosure() {
		return repo.findAll();
	}
	
	
}
