package com.gabrielpaiv.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielpaiv.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
