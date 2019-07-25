package cn.itcast.dubbodemo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import cn.itcast.dubbodemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public String getName() {		
		return "itcast";
	}
}
