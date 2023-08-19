package com.rift.realtyinsights.forclosureapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rift.realtyinsights.forclosureapi.dto.TaxAuctionDto;
import com.rift.realtyinsights.forclosureapi.services.ForclosureService;

@RestController
@RequestMapping("/api/v1/forclosure")
public class ForclosureRestController {

	
	@Autowired
	private ForclosureService service;	
	
	@GetMapping
	public ResponseEntity<List<TaxAuctionDto>> getForclosureData() {
		
		return new ResponseEntity<>(service.getForclosure(), HttpStatus.OK);
	}
	
	
	
}
