package org.springframework.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Student.class);
		Student student = (Student) applicationContext.getBean("student");
		student.say();
	}
}
