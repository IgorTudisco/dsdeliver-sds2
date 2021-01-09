package com.tudis.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tudis.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
