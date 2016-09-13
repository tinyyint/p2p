package com.atguigu.p2p.service;

import com.atguigu.p2p.entities.User;

public interface UserService
{
	public User selectByPrimaryKey(Integer id);
	
	public int insert(User user);
}
