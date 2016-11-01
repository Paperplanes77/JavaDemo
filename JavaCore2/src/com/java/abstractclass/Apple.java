package com.java.abstractclass;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Apple extends Fruit{
	public Apple(){
		System.out.println("我是Apple子类的构造方法");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("苹果每斤6块钱！");
	}

}
