package com.apress.prospring4.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
	// @Value("Chris Schaefer")
	private String name;
	// @Value("32")
	private int age;
	// @Value("1.778")
	private float height;
	// @Value("true")
	private boolean programmer;
	// @Value("1009843200")
	private Long ageInSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:/META-INF/spring/app-context-annotation.xml");
		ctx.refresh();

		InjectSimple injectSimple = (InjectSimple) ctx.getBean("injectSimple");

		System.out.println(injectSimple);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	@Override
	public String toString() {
		return "InjectSimple [name=" + name + ", age=" + age + ", height=" + height + ", programmer=" + programmer
				+ ", ageInSeconds=" + ageInSeconds + "]";
	}

}
