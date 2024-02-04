package com.petproject.ecommerce.dto;

import com.petproject.ecommerce.entity.Address;
import com.petproject.ecommerce.entity.Customer;
import com.petproject.ecommerce.entity.Order;
import com.petproject.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
