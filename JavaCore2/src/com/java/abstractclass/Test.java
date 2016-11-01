package com.java.abstractclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple=new Apple();
		//System.out.println(apple.getColor());
		apple.setColor("red");
		System.out.println(apple.getColor());
		apple.sell();
		Fruit fruit=new Orange();
		fruit.sell();
		fruit.weight();
//		fruit.bb();爷 --父类--子类 Fruit--Banana--Orange长辈只 会安排你做他认知的事
	}

}
