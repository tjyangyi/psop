package com.fhzz.psop.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fhzz.psop.entity.UserInfo;

@FeignClient(value = "psop-admin")
public interface UserInfoService {
	@RequestMapping(value = "/user/findByUsername", method = RequestMethod.GET)
	UserInfo findByUsername(@RequestParam(value = "username") String username);
}
