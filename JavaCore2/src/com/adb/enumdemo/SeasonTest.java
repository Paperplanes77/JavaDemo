package com.adb.enumdemo;

public class SeasonTest {
	public static void print2(SeasonEnum ss){
		System.out.println(ss.getIndex()+"******"+ss.getStr());
	}
	public static void print(SeasonEnum ss){
		switch (ss) {
		case SPRING:
			System.out.println("花香鸟语飘满村。细听来，句句是乡音");
			print2(ss);
			break;
		case SUMMER:
			System.out.println("村前村后一幅画。午饭后，纳凉大树下");
			print2(ss);
			break;
		case AUTUMN:
			System.out.println("有朋来自五大洲。东海岸，相约看海鸥");
			print2(ss);
			break;
		default:
			System.out.println("佳节已在喜庆中。大街上，传来爆竹声");
			print2(ss);
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(SeasonEnum.SPRING);
		print(SeasonEnum.SUMMER);
		print(SeasonEnum.AUTUMN);
		print(SeasonEnum.WINTER);
		System.out.println("遍历打印所有枚举！");
		for (SeasonEnum ss : SeasonEnum.values()) {
			print2(ss);
		}
	}

}
