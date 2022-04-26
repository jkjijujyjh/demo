package com.example.demo.mybatis.bean;

import java.util.Date;

public class User_health {
    //用户名称
    private String user_name;
    //创建时间
    private Date create_time;
    //地址
    private String address;
    //是否请假(1是，2否)
    private String leave_flag;
    //请假原因
    private String leave_case;
    //是否休息(1是，2否)
    private String rest_flag;
    //用户id(唯一键open_id)
    private String user_id;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeave_flag() {
        return leave_flag;
    }

    public void setLeave_flag(String leave_flag) {
        this.leave_flag = leave_flag;
    }

    public String getLeave_case() {
        return leave_case;
    }

    public void setLeave_case(String leave_case) {
        this.leave_case = leave_case;
    }

    public String getRest_flag() {
        return rest_flag;
    }

    public void setRest_flag(String rest_flag) {
        this.rest_flag = rest_flag;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
