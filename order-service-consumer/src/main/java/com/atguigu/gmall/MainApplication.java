package com.atguigu.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.gmall.service.OrderService;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext ioc=new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService=ioc.getBean(OrderService.class);
		orderService.initOrder("1");
		System.out.println("������ɡ�����"); 
		System.in.read(); 
	}
}
