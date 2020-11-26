package com.zking.myba.service;

import com.zking.myba.model.Myfile;
import com.zking.myba.service.impl.BaseTestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class MyfileServiceTest extends BaseTestCase {
    private Myfile myfile;
    @Autowired
    private IMyfileService myfileService;

    @Before
    public void setUp() throws Exception {
        myfile=new Myfile();
    }

    @Test
    public void insert() {
        long fileId = new Date().getTime();
        myfile.setFileId(fileId);
        myfile.setRealName("wyf.jpg");
        myfile.setContentType("image/jpeg");
        myfileService.insert(myfile);
    }
}