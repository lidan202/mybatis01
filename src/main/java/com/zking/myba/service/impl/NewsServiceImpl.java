package com.zking.myba.service.impl;

import com.zking.myba.mapper.NewsMapper;
import com.zking.myba.model.News;
import com.zking.myba.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return 0;
    }

    @Override
    public int insert(News record) {
        return 0;
    }

    @Override
    public int insertSelective(News record) {
        return 0;
    }

    @Override
    public News selectByPrimaryKey(Integer newsId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return 0;
    }

    @Override
    @Cacheable(value = "NewselectTest",key = "'key:'+#news.newsId")
    public News selectSingle(News news) {
        return newsMapper.selectSingle(news);
    }
}
