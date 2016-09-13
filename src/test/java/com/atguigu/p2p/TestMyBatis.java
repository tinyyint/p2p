package com.atguigu.p2p;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.atguigu.p2p.entities.User;
import com.atguigu.p2p.service.UserService;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations ={"classpath:/spring/applicationContext.xml"})
//@ContextConfiguration(locations ={"classpath:applicationContext.xml"})
public class TestMyBatis extends AbstractJUnit4SpringContextTests
{
	private static Logger logger = Logger.getLogger(TestMyBatis.class);

	@Autowired
	private UserService userService = null;

	@Test
	public void testSelectByPrimaryKey()
	{
		User user = userService.selectByPrimaryKey(3);
		logger.info("*******>值：" + user.toString());
		logger.info("*******>Json 值：" + JSON.toJSONString(user));
	}	
	
	@Test
	public void testInsertUser()
	{
		int result = userService.insert(new User("林云"+new Random().nextInt(1000),"123456",22));
	}		
}

/**
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)*/
