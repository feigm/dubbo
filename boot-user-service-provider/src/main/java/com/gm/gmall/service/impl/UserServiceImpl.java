package com.gm.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.gm.gmall.bean.UserAddress;
import com.gm.gmall.service.UserService;

@SuppressWarnings("deprecation")
@Component
@Service
public class UserServiceImpl implements UserService {

	
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "�����в�ƽ���긣�Ƽ�԰�ۺ�¥3��", "1", "����ʦ", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "�����б�����������ȴ���B��3�㣨���ڷ�У��", "1", "����ʦ", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return Arrays.asList(address1,address2);
	}

}