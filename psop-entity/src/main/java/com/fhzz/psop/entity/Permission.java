package com.fhzz.psop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "PERMISSION")
public class Permission implements Serializable {
	private static final long serialVersionUID = 7218559681239182481L;
	@Id
	private String id;// 主键.
	@Column(name = "NAME")
	private String name;// 名称.
	@Column(name = "PARENT_ID")
	private String parentId; // 父编号
	@Column(name = "AVAILABLE")
	private String available;
	@Column(name = "RESOURCE_TYPE")
	private String resourceType;// 资源类型，[menu|button]
	@Column(name = "URL")
	private String url;// 资源路径.
	@Column(name = "PERMISSION")
	private String permission; // 权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
	@Column(name = "GRADE")
	private Integer grade; // 等级
	@Column(name = "SORT")
	private Integer sort; // 排序
	@Transient
	private String checked;
	@ManyToMany(mappedBy="permissions")
	private List<Role> roles;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}

}