package com.fhzz.psopadmin.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fhzz.psopadminapi.entity.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}