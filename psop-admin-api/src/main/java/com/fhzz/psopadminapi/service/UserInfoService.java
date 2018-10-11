package com.fhzz.psopadminapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fhzz.psopentity.entity.UserInfo;

@FeignClient(value = "psop-zuul")
public interface UserInfoService {
	@RequestMapping(value = "/admin/user/findByUsername", method = RequestMethod.GET)
	UserInfo findByUsername(@RequestParam(value = "username") String username);
}
