package com.zking.myba.utils;

import com.zking.myba.model.User;
import com.zking.myba.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class MyRealm extends AuthorizingRealm {
    @Autowired
    private IUserService userService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //
        String username = principalCollection.getPrimaryPrincipal().toString();
        //得到用户角色
        Set<String> roles = userService.findRoles(username);
        //得到用户权限
        Set<String> permissions = userService.findPermissions(username);
        //设置主体中的用户角色以及权限
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();

        authorizationInfo.setRoles(roles);

        authorizationInfo.setStringPermissions(permissions);

        return authorizationInfo;
    }

    //身份认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //得到前端用户输入的账号
        String username = authenticationToken.getPrincipal().toString();
        //得到前端用户输入的密码
        String password = authenticationToken.getCredentials().toString();
        //
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        //根据账号获取数据库中的用户信息
        User u = userService.login(user);
        if(null==u){
            throw new RuntimeException("账号不存在");
        }

        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
        u.getUsername(),
        u.getPassword(),
        ByteSource.Util.bytes(u.getSalt()),
        this.getName()
        );
        return authenticationInfo;
    }
}
