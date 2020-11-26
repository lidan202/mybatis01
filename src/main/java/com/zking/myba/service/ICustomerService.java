package com.zking.myba.service;

import com.zking.myba.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerService {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    @Transactional(readOnly = true)
    Customer load(Customer customer);

    int insertMany(Customer Customer);

    int delete(Customer customer);
}