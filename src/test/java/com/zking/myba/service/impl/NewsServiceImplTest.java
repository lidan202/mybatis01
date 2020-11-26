package com.zking.myba.service.impl;

import com.zking.myba.mapper.NewsMapper;
import com.zking.myba.model.News;
import com.zking.myba.service.INewsService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsServiceImplTest extends BaseTestCase{

    private News news;
    @Autowired
    private NewsMapper newsMapper;
    @Before
    public void setUp() throws Exception {
        news=new News();
    }

    @Test
    public void selectSingle() {
        news.setNewsId(1);
        News n = newsMapper.selectSingle(this.news);
        System.out.println(n);

    }
}