package com.demo.store.common;

import java.util.List;

import lombok.Data;

@Data
public class Result<T> {
	
	private List<T> value;
	
	private int code;
	
	private String message;
	
	private int total;
	
	public void success(List<T> t){
		this.value = t;
		this.code = Result.CODE_SUCCESS;
		this.message = Result.MSG_SUCCESS;
	}
	
	public void fail() {
		this.code = Result.CODE_FAIL;
		this.message = Result.MSG_FAIL;
	}
	
	//Result code
	
	public static int CODE_SUCCESS = 200;
	public static int CODE_FAIL = 0;
	
	//Rresult message
	
	public static String MSG_SUCCESS = "success";
	public static String MSG_FAIL = "fail";
}
