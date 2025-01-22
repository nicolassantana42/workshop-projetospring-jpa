package com.projetowebservice.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

  
}
