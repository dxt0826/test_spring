package com.jwh.spring.aop;

//定义个 切面
public class AopAsept {
	
	public void check(){
		System.out.println("检查用户名...");
	}
	
	
	public void success(){
		System.out.println("登录成功调整到首页...");
	}

}

