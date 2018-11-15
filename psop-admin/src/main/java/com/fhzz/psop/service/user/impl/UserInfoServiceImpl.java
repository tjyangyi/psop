package com.fhzz.psop.service.user.impl;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhzz.psop.dao.jpa.UserInfoDao;
import com.fhzz.psop.entity.UserInfo;
import com.fhzz.psop.service.UserInfoService;

@RestController
@RequestMapping("/user")
public class UserInfoServiceImpl implements UserInfoService {
	@Resource
	private UserInfoDao userInfoDao;

	@Override
	@RequestMapping("/findByUsername")
	public UserInfo findByUsername(String username) {
		return userInfoDao.findByCustName(username);
	}
}