package com.projetowebservice.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.projeto.entities.OrderItem;
import com.projetowebservice.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
