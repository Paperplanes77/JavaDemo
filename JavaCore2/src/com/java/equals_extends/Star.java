package com.java.equals_extends;

public class Star {
	public static String SING="lalala";//可以再定义，加了final后就不能再定义
	public static final String DANCE="boom";
	
	/**
	 * @return the sING
	 */
	public static String getSING() {
		return SING;
	}

	/**
	 * @param sING the sING to set
	 */
	public static void setSING(String sING) {
		SING = sING;
	}

	/**
	 * @return the dance
	 */
	public static String getDance() {
		return DANCE;
	}
	public static String eat(String string) {
		System.out.println("吃头猪上天");
		string=SING;
		System.out.println(string);
		return string;
	}
	public static final void sleep() {
		System.out.println("人人都爱睡觉");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Star.SING);
		Star star=new Star();
		star.setSING("bbbbbbbb");
		star.eat(SING);
		Star.sleep();

	}

}
