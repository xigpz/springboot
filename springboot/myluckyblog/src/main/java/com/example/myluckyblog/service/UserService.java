package com.example.myluckyblog.service;

import com.example.myluckyblog.dao.UserMapper;
import com.example.myluckyblog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by yanggm on 2018/3/17 0017
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserById(String id){
        return  userMapper.selectByPrimaryKey(id);
    }

    public int insertUserById(User record){
        return  userMapper.insert(record);
    }
}
