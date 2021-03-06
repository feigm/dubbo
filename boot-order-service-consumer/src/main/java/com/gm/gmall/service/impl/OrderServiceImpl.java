package com.gm.gmall.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import com.gm.gmall.bean.UserAddress;
import com.gm.gmall.service.OrderService;
import com.gm.gmall.service.UserService;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖\操作zookeeper的客户端()  https://github.com/apache/dubbo
 * 		2）、配置服务提供者
 * 
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * @author lfy
 *
 */

@Service
public class OrderServiceImpl implements OrderService {

	@Reference
	UserService userService;
	

	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户id："+userId);
		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
	
	

}
