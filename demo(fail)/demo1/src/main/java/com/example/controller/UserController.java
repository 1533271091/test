package com.example.controller;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/insert")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public Map insert(){
        User lxy = new User();
        lxy.setAge(18);
        lxy.setId(1);
        lxy.setName("lxy");
        int i = userMapper.insert(lxy);
        return new HashMap(){{put("status",i);}};
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Map getList(){
        List<User> list = userMapper.getList();
        System.out.println(list);
        return new HashMap(){{put("status",list);}};
    }

}
