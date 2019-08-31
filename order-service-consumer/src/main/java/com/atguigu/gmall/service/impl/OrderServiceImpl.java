package com.atguigu.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
// 1.�������ṩ��ע�ᵽע�����ģ���¶����
//		1)������dubbo����
//		2)��
// 2.�÷���ȥע�����Ķ��ķ����ṩ�ķ����ַ

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		System.out.println("�û�ID "+userId);
		List<UserAddress> list=userService.getUserAddressList(userId);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		} 
		return list; 
	}
}
