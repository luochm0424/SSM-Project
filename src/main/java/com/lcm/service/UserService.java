package com.lcm.service;

import com.lcm.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
    String checkLogin(User user, String remember, HttpServletResponse response, HttpServletRequest request);

    User queryCookies(HttpServletRequest request);
}
