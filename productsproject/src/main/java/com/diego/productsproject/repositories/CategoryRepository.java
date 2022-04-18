package com.diego.productsproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diego.productsproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}