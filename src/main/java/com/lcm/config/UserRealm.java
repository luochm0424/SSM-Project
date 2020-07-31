package com.lcm.config;

import com.lcm.mapper.PermissionMapper;
import com.lcm.mapper.UserMapper;
import com.lcm.pojo.Permission;
import com.lcm.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserMapper userMapper;
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
         SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        String  username =(String) principalCollection.getPrimaryPrincipal();
        Set<String> set = new HashSet<>();
        List<Permission> permissions = permissionMapper.queryPermissionByUserName(username);
        for (Permission permission : permissions) {
            set.add(permission.getPermissionName());
        }
                info.addStringPermissions(set);//--->对应的权限拦截为perms[]
//        info.addRole("admin");//-->对应的权限拦截为roles[]
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken =(UsernamePasswordToken) authenticationToken;
        User user = userMapper.checkLogin(usernamePasswordToken.getUsername());
        if (user==null){return null;}
        ByteSource salt = ByteSource.Util.bytes(user.getUsername());
        return new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),salt,getName());
    }
}
