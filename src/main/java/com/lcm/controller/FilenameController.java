package com.lcm.controller;

import com.lcm.pojo.Filename;
import com.lcm.service.FilenameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class FilenameController {

    @Autowired
    FilenameService service;

//   produces = "application/text;charset=utf-8" 设置返回值可为中文
    @RequestMapping("hello.do")
    @ResponseBody
    public Filename hello(@RequestBody List<Filename> filenameList){
        for (Filename filename : filenameList) {
            System.out.println(filename);
        }
        return service.selectByPrimaryKey(8);
    }

    @RequestMapping("hello1.ajax")
    @ResponseBody
    public Filename hello1(Filename filename, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        System.out.println(filename);
        return service.selectByPrimaryKey(8);
    }

}
