package com.jwh.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.jwh.service.UserService;
//����ע�룬���������������еĶ���Ĳ���  DI  IOC
//���Ʒ�ת --����Ȩ����ת�ƣ�new����--������������
//���--new--����
//struts2 ������  
//ibatis dao
//spring--�������

//����ע��ķ�ʽ��2�֣�һ�����ֶ���ע�룬�Զ�(ע��ķ�ʽ��)
public class UserAction {
	
	
	@Autowired
	private UserService  userService;

	//ע��͵�¼����Ҫ�����Ϣ�ĺϷ���
	//�ɹ�����������ҳ  
	//�����
	
	public void register(){
		//�Ϸ���
		userService.insert();
		//�ɹ� 
	}
	
	public void login(){
		//�Ϸ���
		System.out.println("��¼�� ...");
		//�ɹ� 
	}
	

}
