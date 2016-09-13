package com.atguigu.p2p.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.p2p.entities.User;
import com.atguigu.p2p.mapper.UserMapper;
import com.atguigu.p2p.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer id)
	{
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public int insert(User user)
	{
		return userMapper.insert(user);
	}
}
