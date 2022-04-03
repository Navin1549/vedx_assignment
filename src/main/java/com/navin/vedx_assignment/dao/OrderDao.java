package com.navin.vedx_assignment.dao;

import com.navin.vedx_assignment.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Long>{ 
    
}
