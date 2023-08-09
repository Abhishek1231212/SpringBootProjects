package com.learning.spring.exceptions;



public class ResourceNotFoundException extends Throwable{
	private static final long serialVersionUID = 1L;
	private String msg;

	public ResourceNotFoundException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
