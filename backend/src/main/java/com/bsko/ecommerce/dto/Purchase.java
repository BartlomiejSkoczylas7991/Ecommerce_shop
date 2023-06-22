package com.bsko.ecommerce.dto;

import com.bsko.ecommerce.entity.Address;
import com.bsko.ecommerce.entity.Customer;
import com.bsko.ecommerce.entity.Order;
import com.bsko.ecommerce.entity.OrderItem;
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
