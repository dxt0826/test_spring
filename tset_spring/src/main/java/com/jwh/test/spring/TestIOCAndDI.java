package com.jwh.test.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jwh.controller.UserAction;
public class TestIOCAndDI {
	//spring ����ע��,DI  
	public static void main(String[] args) {
		
		//ͨ��ClassPathXmlApplicationContext����������spring�����ļ�
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		
//		Student  st =  (Student) ac.getBean("st");
//		
//		System.out.println(st.getName());
//		System.out.println(st.getAge());
//		System.out.println(st.getPwd());
		
		UserAction action = (UserAction) ac.getBean("userAction");
		
		//UserAction action = (UserAction) ac.getBean(UserAction.class);
		action.register();
		// new---spring--����ע��
		
	
}
	
}
