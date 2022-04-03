package com.navin.vedx_assignment.services;

import java.util.List;

import com.navin.vedx_assignment.entities.Order;

public interface OrderService {

    public List<Order> getOrders();
    public Order getOneOrder(long id);
    public String addNewOrder(Order order);
    public String deleteById(long id);
    public String updateByUser(Order order);
    
}
