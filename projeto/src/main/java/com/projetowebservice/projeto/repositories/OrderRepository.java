package com.projetowebservice.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

  
}
