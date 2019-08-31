package com.atguigu.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
// 1.将服务提供者注册到注册中心（暴露服务）
//		1)、导入dubbo依赖
//		2)、
// 2.让服务去注册中心订阅服务提供的服务地址

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		System.out.println("用户ID "+userId);
		List<UserAddress> list=userService.getUserAddressList(userId);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		} 
		return list; 
	}
}
