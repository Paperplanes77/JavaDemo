package com.java.abstractclass;

 
import lombok.Getter;
import lombok.Setter;

@Setter@Getter 
public abstract class Fruit {
	@Setter@Getter 
	private String color;
	@Setter @Getter 
	private String taste="甜的";
	public Fruit() {
		// TODO Auto-generated constructor stub
		System.out.println("我是Fruit父类的构造方法");
	}
	 
	public abstract void sell();
	public void weight(){
		System.out.println("每种水果的质量不同！");
	}

	public void setColor(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	 
}
