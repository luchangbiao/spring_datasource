package org.springframework.nashibing.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplication extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplication(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展一下initPropertySources方法拉。。。。。");
		//getEnvironment().setRequiredProperties("abc");
	}
}
