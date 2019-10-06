package com.nba;

/**
 * @author dashuai
 *
 */
public class Person {
	
	private String id;
	private String name;
	private int age;
	private int gender;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public static void main(String[] args) {
		System.out.println(new Person());
	}

}
