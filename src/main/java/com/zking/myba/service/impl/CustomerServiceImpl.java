package com.zking.myba.service.impl;

import com.zking.myba.mapper.CustomerMapper;
import com.zking.myba.model.Customer;
import com.zking.myba.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Integer customerId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }

    @Override
    public Customer load(Customer customer) {
        return customerMapper.load(customer);
    }

    @Override
    public int insertMany(Customer customer) {
        return customerMapper.insertMany(customer);
    }

    @Override
    public int delete(Customer customer) {
        return customerMapper.delete(customer);
    }
}
