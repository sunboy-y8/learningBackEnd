package com.example.demo.entity;

public class User {
	
	private String userId;
	private String userName;
	private String userEmail;
	private String userPwd;
	private String registerCode;
	private String validateStatus;
	private String role;
	
	
	public User() {
		super();
	}
	
	public User(String userId, String userName, String userEmail, String userPwd, String registerCode,
			String validateStatus, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.registerCode = registerCode;
		this.validateStatus = validateStatus;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getRegisterCode() {
		return registerCode;
	}
	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}
	public String getValidateStatus() {
		return validateStatus;
	}
	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
