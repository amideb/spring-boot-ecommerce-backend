package com.debrup.ecommerce.dto;

import com.debrup.ecommerce.entity.Address;
import com.debrup.ecommerce.entity.Customer;
import com.debrup.ecommerce.entity.Order;
import com.debrup.ecommerce.entity.OrderItem;
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
