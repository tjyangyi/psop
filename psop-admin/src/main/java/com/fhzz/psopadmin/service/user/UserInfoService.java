package com.fhzz.psopadmin.service.user;

import com.fhzz.psopadmin.entity.UserInfo;

public interface UserInfoService {
	UserInfo findByUsername(String username);
}
