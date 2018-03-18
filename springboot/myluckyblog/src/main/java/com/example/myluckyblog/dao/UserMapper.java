package com.example.myluckyblog.dao;

import com.example.myluckyblog.model.User;
import org.springframework.stereotype.Component;

/**
 * Create by yanggm on 2018/3/17 0017
 */

@Component
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}