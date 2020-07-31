package com.lcm.controller;

import com.lcm.pojo.User;
import com.lcm.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("loginController")
public class LoginController {

    @Autowired
    UserService userService;


    @RequestMapping("toLogin.do")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("checkLogin.ajax")
    @ResponseBody
    public String checkLogin(User user, String remember, HttpServletResponse response,HttpServletRequest request){
        return userService.checkLogin(user,remember,response,request);
    }

    @RequestMapping("index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("logout.do")
    public String logout(){

        return "login";
    }

    @RequestMapping("logout.ajax")
    @ResponseBody
    public User logoutUser(HttpServletRequest request){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return userService.queryCookies(request);
    }
     @RequestMapping("showWelcome.do")
    public String showWelcome(){

        return "welcome";
     }

}
