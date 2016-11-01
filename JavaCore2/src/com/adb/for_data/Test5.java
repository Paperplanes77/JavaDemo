package com.adb.for_data;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++){
			if(i%3==0)
//				break;
				continue;
			System.out.println("i="+i);
			}
		System.out.println("循环中断：i="+i);

		}
	}


