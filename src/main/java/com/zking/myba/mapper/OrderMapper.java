package com.zking.myba.mapper;

import com.zking.myba.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int insertOrder(List<Order> orders);

    int delete(Integer cid);
}