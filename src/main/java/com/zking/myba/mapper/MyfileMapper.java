package com.zking.myba.mapper;

import com.zking.myba.model.Myfile;
import org.springframework.stereotype.Repository;

@Repository
public interface MyfileMapper {
    int deleteByPrimaryKey(Long fileId);

    int insert(Myfile record);

    int insertSelective(Myfile record);

    Myfile selectByPrimaryKey(Long fileId);

    int updateByPrimaryKeySelective(Myfile record);

    int updateByPrimaryKey(Myfile record);
}