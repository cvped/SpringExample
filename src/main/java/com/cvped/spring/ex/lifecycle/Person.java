package com.cvped.spring.ex.lifecycle;

public class Person {

	// 먼저 멤버변수 지정
	// 이름, 나이
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "나이 :" + age;
	}
	
	// get 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
