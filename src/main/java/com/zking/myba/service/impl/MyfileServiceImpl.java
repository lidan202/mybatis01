package com.zking.myba.service.impl;

import com.zking.myba.mapper.MyfileMapper;
import com.zking.myba.model.Myfile;
import com.zking.myba.service.IMyfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyfileServiceImpl implements IMyfileService {
    @Autowired
    private MyfileMapper myfileMapper;
    @Override
    public int deleteByPrimaryKey(Long fileId) {
        return 0;
    }

    @Override
    public int insert(Myfile record) {
        return myfileMapper.insert(record);
    }
    @Override
    public int insertSelective(Myfile record) {
        return 0;
    }

    @Override
    public Myfile selectByPrimaryKey(Long fileId) {
        return myfileMapper.selectByPrimaryKey(fileId);
    }

    @Override
    public int updateByPrimaryKeySelective(Myfile record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Myfile record) {
        return 0;
    }
}
