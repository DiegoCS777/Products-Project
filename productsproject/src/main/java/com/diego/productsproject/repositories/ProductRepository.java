package com.diego.productsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.productsproject.entities.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long>{
	
}