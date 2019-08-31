package com.atguigu.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;


@Service // dubbo 用于暴露服务
@Component
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {

        System.out.println("UserServiceImpl..3.....");
        UserAddress address1 = new UserAddress(1,"1","qhb","18");
        UserAddress address2 = new UserAddress(2, "2", "qlc", "18");

        return Arrays.asList(address1, address2);
    }

}
