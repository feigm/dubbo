package com.gm.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gm.gmall.service.OrderService;
 
public class Consumer {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        
        OrderService orderService = (OrderService)context.getBean(OrderService.class); // 获取远程服务代理
        
        orderService.initOrder("1"); // 执行远程方法
        
		System.out.println("调用完成....");
		
    }
}