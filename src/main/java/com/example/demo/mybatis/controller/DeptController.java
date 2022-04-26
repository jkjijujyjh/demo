package com.example.demo.mybatis.controller;


import com.alibaba.fastjson.JSON;
import com.example.demo.mybatis.bean.User_health;
import com.example.demo.mybatis.mapper.User_healthMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public class DeptController {
    @Autowired
    User_healthMapper emp;

    @GetMapping("/emp/{user_name}")
    public User_health getUser(@PathVariable("user_name") String user_name){
        return emp.getName(user_name);
    }


    //综合注解
    @RequestMapping(value = "/emp/add1",method = RequestMethod.POST)
    //@PostMapping("/emp/add")
    @ResponseBody
    public void setData1(HttpServletRequest request, HttpServletResponse response) {
        String str1 = request.getParameter("openid");
        System.out.println(str1);
    }



    //综合注解
    @RequestMapping(value = "/emp/add",method = RequestMethod.POST)
    //@PostMapping("/emp/add")
    @ResponseBody
    public void setData(HttpServletRequest request, HttpServletResponse response) {
        String str = request.getParameter("json_params");
        String str1 = request.getParameter("openid");
        System.out.println(str);
        System.out.println(str1);
        //将前台传过来的字符串转为Json
        User_health a = JSON.parseObject(str,User_health.class);
        emp.insertData(a);
    }


    //以下方法为Get获取方法
//    public User_healthMapper setData(@PathVariable("user_name") String user_name,
//                                 @PathVariable("create_time") Date create_time,
//                                 @PathVariable("address") String address,
//                                 @PathVariable("leave_flag") String leave_flag,
//                                 @PathVariable("leave_case") String leave_case,
//                                 @PathVariable("rest_flag") String rest_flag,
//                                 @PathVariable("user_id") String user_id) {
//        User_health e = new User_health();
//        e.setUser_name(user_name);
//        e.setCreate_time(create_time);
//        e.setAddress(address);
//        e.setLeave_flag(leave_flag);
//        e.setLeave_case(leave_case);
//        e.setRest_flag(rest_flag);
//        e.setUser_id(user_id);
//        return emp.insertData(e);
//    }



}
