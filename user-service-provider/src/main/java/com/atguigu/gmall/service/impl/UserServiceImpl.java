package com.atguigu.gmall.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

public class UserServiceImpl implements UserService{

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("into UserServiceImpl.......version:1.0.0");
		List<UserAddress> list=new ArrayList<UserAddress>();
		UserAddress u1=new UserAddress(1, "001", "qhb", "18");
		UserAddress u2=new UserAddress(2, "002", "qlc", "18");
		list.add(u1);
		list.add(u2);
		
		return list;
	}

}
