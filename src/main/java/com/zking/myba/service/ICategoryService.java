package com.zking.myba.service;

import com.zking.myba.model.Category;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICategoryService {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}