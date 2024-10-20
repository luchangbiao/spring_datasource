package org.springframework.demo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Student {
	public void say() {
		System.out.println("hello spring");
	}
}
