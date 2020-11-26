package com.zking.myba.service;

import com.zking.myba.mapper.OrderMapper;
import com.zking.myba.model.Customer;
import com.zking.myba.model.Order;
import com.zking.myba.service.impl.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceTest extends BaseTestCase {

    private Customer customer;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private OrderMapper orderMapper;
    @Before
    public void setUp() throws Exception {
        customer=new Customer();
    }

    @Test
    public void load() {
        customer.setCustomerId(6);
        Customer load = customerService.load(customer);
        System.out.println(load);
    }

    @Test
    public void add() {
        customer.setCustomerName("狍子");
        customerService.insertMany(customer);
        Order o=new Order();
        o.setCid(customer.getCustomerId());
        o.setOrderNo("P13");
        Order o2=new Order();
        o2.setCid(customer.getCustomerId());
        o2.setOrderNo("P14");
        List<Order> orders=new ArrayList<>();
        orders.add(o);
        orders.add(o2);
        orderMapper.insertOrder(orders);

    }

    @Test
    public void del() {
        customer.setCustomerId(3);
        orderMapper.delete(customer.getCustomerId());
        int delete = customerService.delete(customer);
        System.out.println(delete);
    }
}