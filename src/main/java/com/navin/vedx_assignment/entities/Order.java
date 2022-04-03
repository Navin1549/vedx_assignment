package com.navin.vedx_assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String customer;
    private String country;
    private String address;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "order_date")
    private String orderDate;
    private String status;


    

    // public Order(long id, String customer, String country, String address, String productName, String orderDate,
    //         String status) {
    //     this.id = id;
    //     this.customer = customer;
    //     this.country = country;
    //     this.address = address;
    //     this.productName = productName;
    //     this.orderDate = orderDate;
    //     this.status = status;
    // }

    public Order() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", customer=" + customer + ", country=" + country + ", address=" + address
                + ", orderDate=" + orderDate + ", productName=" + productName + ", status=" + status + "]";
    }

    


    
}
