package com.fhzz.psop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "USER_INFO")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 6285492931952240332L;
	@Id
	@Column(name = "CUST_ID")
	private String custId;
	@Column(name = "CUST_CODE")
	private String custCode;
	@Column(name = "CUST_NAME")
	private String custName;
	@Column(name = "CUST_PASSWORD")
	private String custPassword;// 密码
	@Column(name = "CUST_SALT")
	private String custSalt;// 加密密码的盐
	@Column(name = "REAL_NAME")
	private String realName;
	@Column(name = "CUST_GENDER")
	private String custGender;
	@Column(name = "CUST_PHONE")
	private String custPhone;
	@Column(name = "CUST_EMAIL")
	private String custEmail;
	@Column(name = "ORG_ID")
	private String orgId;
	@Transient
	private String orgName;
	@Column(name = "ROLE_ID")
	private String roleId;
	@Column(name = "STATE")
	private String state;// 启用状态,1:已启用,0：未启用.
	@Column(name = "ONLINE_STATE")
	private String onlineState;
	@Column(name = "LONGITUDE")
    private Double longitude;
	@Column(name = "LATITUDE")
    private Double latitude;
	@Column(name = "REGISTER_TIME")
    private Date registerTime;
	@Column(name = "MODIFY_TIME")
    private Date modifyTime;
	@Column(name = "LOGIN_TIME")
    private Date loginTime;
	@Column(name = "MOBILE_ONLINE_STATE")
    private String mobileOnlineState;
	@Column(name = "MOBILE_LOGIN_TIME")
    private Date mobileLoginTime;
    
    public static String ONLINE = "114";
    public static String OFFLINE = "113";
    public static String START = "1";
    public static String STOP = "0";
	
	@ManyToMany(fetch = FetchType.EAGER) // 立即从数据库中进行加载数据;
	@JsonIgnoreProperties(value="userInfos")
	@JoinTable(
			name="USER_ROLE", 
			joinColumns={@JoinColumn(name="USER_ID")},
			inverseJoinColumns={@JoinColumn(name="ROLE_ID")}
	)
	private List<Role> roles;// 一个用户具有多个角色

	

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public String getCustSalt() {
		return custSalt;
	}

	public void setCustSalt(String custSalt) {
		this.custSalt = custSalt;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getOnlineState() {
		return onlineState;
	}

	public void setOnlineState(String onlineState) {
		this.onlineState = onlineState;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getMobileOnlineState() {
		return mobileOnlineState;
	}

	public void setMobileOnlineState(String mobileOnlineState) {
		this.mobileOnlineState = mobileOnlineState;
	}

	public Date getMobileLoginTime() {
		return mobileLoginTime;
	}

	public void setMobileLoginTime(Date mobileLoginTime) {
		this.mobileLoginTime = mobileLoginTime;
	}

	/**
	 * 密码盐.
	 * 
	 * @return
	
	// 重新对盐重新进行了定义，用户名+salt，这样就更加不容易被破解
	public String getCredentialsSalt() {
		return this.custName + this.getCustSalt();
	} */
}