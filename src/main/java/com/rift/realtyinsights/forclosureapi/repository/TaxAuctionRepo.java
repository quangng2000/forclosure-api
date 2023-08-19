package com.rift.realtyinsights.forclosureapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rift.realtyinsights.forclosureapi.dto.TaxAuctionDto;

@Repository
public interface TaxAuctionRepo extends JpaRepository<TaxAuctionDto, Long>  {

}