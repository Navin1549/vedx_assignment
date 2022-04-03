package com.navin.vedx_assignment.controller;
import java.util.List;

import com.navin.vedx_assignment.entities.Order;
import com.navin.vedx_assignment.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping("/home")
    public String home()
    {
        return "Welcome to Our Application...!";
    } 

    //get All orders
    @GetMapping("/orders")
    public List<Order> getOrders()
    {
        return  this.orderService.getOrders();
    }

    //get One Order by Id
    @GetMapping("/orders/{id}")
    public Order getOneOrder(@PathVariable String id)
    {
        return this.orderService.getOneOrder(Long.parseLong(id));
    }


    //add new Order by User
    @PostMapping(path="/addOrder", consumes = "application/json")
    public String addOrder(@RequestBody Order order)
    {
        return this.orderService.addNewOrder(order);
    }

    //delete one order by id
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable String id)
    {
        return this.orderService.deleteById(Long.parseLong(id));
    }

    //update the order by user
    @PutMapping("/update")
    public String updateByUser(@RequestBody Order order)
    {
        return this.orderService.updateByUser(order);
    }


    
}
