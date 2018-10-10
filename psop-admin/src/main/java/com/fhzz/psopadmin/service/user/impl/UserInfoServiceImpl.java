package com.fhzz.psopadmin.service.user.impl;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhzz.psopadmin.dao.jpa.UserInfoDao;
import com.fhzz.psopadmin.entity.UserInfo;
import com.fhzz.psopadmin.service.user.UserInfoService;

@RestController
@RequestMapping("/user")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    
    @Override
    @RequestMapping("/findByUsername")
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}