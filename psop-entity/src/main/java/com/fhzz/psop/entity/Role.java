package com.fhzz.psop.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ROLE")
public class Role {
	@Id
	private String id;// 编号
	@Column(name = "ROLE")
	private String role;// 角色标识程序中判断使用,如"admin",这个是唯一的:
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;// 角色描述,UI界面显示使用
	@Column(name = "AVAILABLE")
	private String available;
	@Column(name = "CREATE_TIME")
	private Date createTime;
	@Column(name = "MODIFY_TIME")
	private Date modifyTime;// 是否可用,如果不可用将不会添加给用户

	// 角色 -- 权限关系：多对多关系;
	@ManyToMany(fetch = FetchType.EAGER)
	@JsonIgnoreProperties(value="roles")
	@JoinTable(name = "ROLE_PERMISSION", 
			   joinColumns = { @JoinColumn(name = "ROLE_ID") }, 
			   inverseJoinColumns = {@JoinColumn(name = "PERMISSION_ID") })
	private List<Permission> permissions;

	// 用户 - 角色关系定义;
	@ManyToMany(mappedBy="roles")
	private List<UserInfo> userInfos;// 一个角色对应多个用户

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public List<UserInfo> getUserInfos() {
		return userInfos;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}
}