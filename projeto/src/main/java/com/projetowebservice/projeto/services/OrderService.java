package com.projetowebservice.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservice.projeto.entities.Order;
import com.projetowebservice.projeto.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    /**
     * @param id
     * @return
     */
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
