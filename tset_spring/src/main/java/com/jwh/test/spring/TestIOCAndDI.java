package com.jwh.test.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jwh.controller.UserAction;
public class TestIOCAndDI {
	//spring 依赖注入,DI  
	public static void main(String[] args) {
		
		//通过ClassPathXmlApplicationContext对象来解析spring核心文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		
//		Student  st =  (Student) ac.getBean("st");
//		
//		System.out.println(st.getName());
//		System.out.println(st.getAge());
//		System.out.println(st.getPwd());
		
		UserAction action = (UserAction) ac.getBean("userAction");
		
		//UserAction action = (UserAction) ac.getBean(UserAction.class);
		action.register();
		// new---spring--依赖注入
		
	
}
	
}
