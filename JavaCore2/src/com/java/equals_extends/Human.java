package com.java.equals_extends;

public class Human {
	private int age;
	private String name;
	private double hight;
	private int price;
	
	public Human() {
		//super();
		System.out.println("使用了父类里面的无参构造方法！");
	}
	public Human(int age, String name, double hight, int price) {
		this();
		this.age = age;
		this.name = name;
		this.hight = hight;
		this.price = price;
		System.out.println("使用了父类里面的四个参数的构造方法！");
	}
	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + ", hight=" + hight + ", price=" + price + "]";
	}
	
}
