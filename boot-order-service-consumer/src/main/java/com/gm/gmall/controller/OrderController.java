package com.gm.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gm.gmall.bean.UserAddress;
import com.gm.gmall.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	/**
	 * http://127.0.0.1:8081/initOrder?uid=1
	 * @param userId
	 * @return
	 */
	
	@ResponseBody
	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
		return orderService.initOrder(userId);
	}

}
