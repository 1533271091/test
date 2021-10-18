package com.example.mapper;


import pojo.User;

import java.util.List;

public interface UserDao {
    int insert(User user);
    List<User> getList();

}
