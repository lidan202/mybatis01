package com.zking.myba.service;

import com.zking.myba.model.Myfile;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IMyfileService {
    int deleteByPrimaryKey(Long fileId);

    int insert(Myfile record);

    int insertSelective(Myfile record);

    Myfile selectByPrimaryKey(Long fileId);

    int updateByPrimaryKeySelective(Myfile record);

    int updateByPrimaryKey(Myfile record);
}