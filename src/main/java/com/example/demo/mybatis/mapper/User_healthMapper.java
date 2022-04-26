package com.example.demo.mybatis.mapper;
import com.example.demo.mybatis.bean.User_health;
import org.apache.ibatis.annotations.Mapper;

//如果不加下面注解会报错，找不到此文件
@Mapper
public interface User_healthMapper {
     User_health getName(String user_name);
     void insertData(User_health e);
}
