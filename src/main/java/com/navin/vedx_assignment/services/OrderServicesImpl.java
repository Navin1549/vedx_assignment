package com.navin.vedx_assignment.services;

import java.util.List;
import java.util.Optional;

import com.navin.vedx_assignment.dao.OrderDao;
import com.navin.vedx_assignment.entities.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public List<Order> getOrders() {
        
        return orderDao.findAll();
    }



    @Override
    public Order getOneOrder(long id) {
        
       Optional<Order> orderOptional=orderDao.findById(id);
       Order order=orderOptional.get();
       return order;
    }



    @Override
    public String addNewOrder(Order order) {
        
        orderDao.save(order);
        return "Add new Order Sucessfully";
    }



    @Override
    public String deleteById(long id) {
        
        Optional<Order> optional=orderDao.findById(id);
        Order order=optional.get();
        orderDao.delete(order);
        return "Delete Successfuly";
    }



    @Override
    public String updateByUser(Order order) {
        
       orderDao.save(order);

        return "update Suceessfully";
    }
    
}
