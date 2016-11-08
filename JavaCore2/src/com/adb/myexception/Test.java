package com.adb.myexception;

import java.util.Scanner;

class Teacher{
	public void checkScore(int score) throws MyExceptionDemo{
		if (score>=0&&score<=100) {
			System.out.println("分数录入正确！");
		}else{
			System.out.println("分数录入有误,请重新录入！");
            Teacher.thorw();
		}
	}
	public static void thorw() throws MyExceptionDemo{
		throw new MyExceptionDemo();
	}
}
public class Test {
	public static void main(String[] args) throws MyExceptionDemo{
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入分数：");
		int score=scanner.nextInt();//输入字符串的话直接进入了另外一个异常范围了
		Teacher t=new Teacher();
		t.checkScore(score);
	}

}
