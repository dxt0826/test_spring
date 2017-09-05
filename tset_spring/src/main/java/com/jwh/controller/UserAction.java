package com.jwh.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.jwh.service.UserService;
//依赖注入，是容器，管理所有的对象的产生  DI  IOC
//控制反转 --控制权进行转移，new对象--让容器来产生
//结果--new--容器
//struts2 控制器  
//ibatis dao
//spring--对象产生

//依赖注入的方式有2种，一种是手动，注入，自动(注解的方式，)
public class UserAction {
	
	
	@Autowired
	private UserService  userService;

	//注册和登录，需要检查信息的合法性
	//成功，调整到首页  
	//切入点
	
	public void register(){
		//合法性
		userService.insert();
		//成功 
	}
	
	public void login(){
		//合法性
		System.out.println("登录中 ...");
		//成功 
	}
	

}
