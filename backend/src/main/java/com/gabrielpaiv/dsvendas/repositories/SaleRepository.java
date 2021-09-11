package com.gabrielpaiv.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielpaiv.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
