package com.adb.for_data;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=5;
		/*System.out.println("a="+a+",b="+b);
		if (a>b) {
			System.out.println("a-b="+(a-b));
			System.out.println("a*b="+(a*b));
		}*/
		/*if (a%2==1) {
			System.out.println(a+"是奇数！");
		}
		else
			System.out.println(a+"是偶数！");*/
		/* if (a==1) {
			System.out.println("a==1");
		}else if (a==2) {
			System.out.println("a==2");
		}else {
			System.out.println("a==6");
		}
	}*/
		char mtea='B';
		switch (mtea) {
		case 'B':
			System.out.println("顾客需要一杯大杯奶茶！");
			break;
		case 'M':
			System.out.println("顾客需要一杯中杯奶茶！");
			break;
		default:
			System.out.println("顾客需要一杯小杯奶茶！");
			break;
		}
	}
}
