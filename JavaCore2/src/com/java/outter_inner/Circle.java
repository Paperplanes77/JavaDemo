package com.java.outter_inner;

public class Circle {
	private double radius=0;
	public static int count=1;
	public Circle(double radius){
		this.radius=radius;
	}
	class Draw{
		public void drawShape(){
			System.out.println(radius);
			System.out.println(count);
		}
	}
}
