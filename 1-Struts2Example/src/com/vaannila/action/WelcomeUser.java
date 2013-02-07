package com.vaannila.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUser extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1736348886332750909L;
	private String userName;
	private String message;
	public String execute() {
		message = "Welcome " + userName;
		return SUCCESS;
		}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
