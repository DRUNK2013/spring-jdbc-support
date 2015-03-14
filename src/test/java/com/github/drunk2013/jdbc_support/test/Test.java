package com.github.drunk2013.jdbc_support.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.drunk2013.jdbc_support.model.Student;
import com.github.drunk2013.jdbc_support.service.StudentService;


public class Test {
	private static ApplicationContext ac;

	public static void main(String[] args) {
		System.out.println("Hello World");
		ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		StudentService studentService = ac.getBean("studentService",
				StudentService.class);
		studentService.addStudent(new Student("张双福", 27));
		System.out.println("SECCESS");
	}
}
