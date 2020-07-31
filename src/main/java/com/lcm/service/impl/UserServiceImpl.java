package com.lcm.service.impl;

import com.lcm.pojo.User;
import com.lcm.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String checkLogin(User user, String remember, HttpServletResponse response,HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try{
            subject.login(token);
            if(remember.equals("YES")){
//                Cookie cookie1 = new Cookie("USERNAME",user.getUsername());
//                Cookie cookie2 = new Cookie("PASSWORD",user.getPassword());
//                cookie1.setMaxAge(30*24*60*60);
//                cookie2.setMaxAge(30*24*60*60);
//                response.addCookie(cookie1);
//                response.addCookie(cookie2);
                System.out.println("认证后的用户信息="+user);
                SimpleCookie cookie  = new SimpleCookie();
                cookie.setName("USERNAME");
                cookie.setValue(user.getUsername());
                cookie.setName("PASSWORD");
                cookie.setValue(user.getPassword());
                cookie.setMaxAge(60*60*24*30);
                cookie.saveTo(request,response);
            }
            return "success";
        }catch (AuthenticationException e){
            return "error";
        }

    }

    @Override
    public User queryCookies(HttpServletRequest request) {
        User user = new User();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("USERNAME")){
                user.setUsername(cookie.getValue());
            }
            if(cookie.getName().equals("PASSWORD")){
                user.setPassword(cookie.getValue());
            }
        }
        return user;
    }
}
