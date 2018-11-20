/**
 * 
 */
package com.fhzz.psop.controller;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class UserContoller {
	@Autowired
	private IdentityService identityService;

	@GetMapping("/cretateUser")
	public Object cretateUser() {
		// 项目中每创建一个新用户，对应的要创建一个Activiti用户//两者的userId和userName一致
		User admin = identityService.newUser("yangyi");
		admin.setLastName("yangyi");
		identityService.saveUser(admin);
		// 项目中每创建一个角色，对应的要创建一个Activiti用户组
		Group adminGroup = identityService.newGroup("admin");
		adminGroup.setName("admin");
		identityService.saveGroup(adminGroup);
		// 用户与用户组关系绑定
		identityService.createMembership("yangyi", "admin");
		return "cretateUser ok!";
	}

}
