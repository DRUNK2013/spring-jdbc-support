package com.github.drunk2013.jdbc_support.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.drunk2013.jdbc_support.model.Student;
import com.github.drunk2013.jdbc_support.service.StudentService;

public class JdbcTest {
	private ApplicationContext ac;

	@Before
	public void setup() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void addStudent() {
		StudentService studentService = ac.getBean("studentService",
				StudentService.class);
		int addNum = studentService.addStudent(new Student("张双福", 27));
	    if(addNum==1){
	    	System.out.println("添加成功！");
	    }
	}
	
	@Test
	public void updateStudent() {
		StudentService studentService = ac.getBean("studentService",
				StudentService.class);
		int updateNum=studentService.updateStudent(new Student(3,"张双福", 2));
		if(1==updateNum){
			System.out.println("更新成功！");
		}
	}
	
	@Test
	public void deleteStudent() {
		StudentService studentService = ac.getBean("studentService",
				StudentService.class);
		int deleteNum=studentService.deleteStudent(8);
		if(1==deleteNum){
			System.out.println("删除成功！");
		}
	}
	
	@Test
	public void findStudent() {
		StudentService studentService = ac.getBean("studentService",
				StudentService.class);
		List<Student> studentlList=studentService.findStudents();
		for (Student student : studentlList) {
			System.out.println(student.toString());
		}
	}
}
