package com.sirius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
