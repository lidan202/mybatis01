package com.zking.myba.service.impl;

import com.zking.myba.model.User;
import com.zking.myba.service.IUserService;
import com.zking.myba.utils.PasswordHelper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IUserServiceImplTest extends BaseTestCase{
    private User user;
    @Autowired
    private IUserService userService;

    @Before
    public void setUp() throws Exception {
        user=new User();
    }

    @Test
    public void insertSelective() {
        user.setUsername("ls");
        String salt = PasswordHelper.createSalt();
        user.setSalt(salt);
        String pwd = PasswordHelper.createCredentials("999", salt);
        user.setPassword(pwd);
        userService.insertSelective(user);
    }

    @Test
    public void login() {
        user.setUsername("ld");
        user.setPassword("777");
        User u = userService.login(user);
        String salt = u.getSalt();
        boolean b = PasswordHelper.checkCredentials(user.getPassword(), salt, u.getPassword());
        if(b){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

    }
}