package com.atguigu.p2p.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.atguigu.p2p.entities.User;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    public int insert(User user);

    public User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}