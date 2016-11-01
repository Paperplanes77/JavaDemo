package com.adb.ifelse;

import java.io.PrintStream;

import javax.swing.OverlayLayout;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		out.println("判断结构IF：");
		boolean flag = true;
		if (flag == true)
			out.println("flag:" + flag);
		out.println("***********");
		out.println("判断结构IF...ELSE：");
		int a = 10;
		if (a != 10) {
			out.println("a:" + a);
		} else {
			out.println("a:" + 8);
		}
		out.println("***********");
		out.println("判断结构IF...ELSE IF：");
		int p=56;
		if (p== 38) {
			out.println("p等于38");
		} else if (p==5) {
			out.println("p等于5");
		}else{
			out.println("我什么都不知道！");
		}
		out.println("***********");
		out.println("三目运算符：");
		int m = 5 > 3 ? 4 : 8;
		out.println(m);
		out.println("***********");
		out.println("switch：");
		//int  c =Integer.parseInt(args[0]+"");
 		switch (args[0]) {
		case "1":
			out.println("恭喜获得一等间！");
			break;
		case "2":
			out.println("恭喜获得特等间！");
			break;
		case "3":
			out.println("恭喜获得二等间！");
			break;
		case "4":
			out.println("恭喜获得三等间！");
			break;
		default:
			out.println("再接再厉,加油");
			break;
		}

	}

}
