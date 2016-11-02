package com.adb.collection;

public class Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=100;
		int n=0;
		int c;
		for (int i = 0; i <=20; i++) {
			for(int j=0;j<=33;j++){
				c=100-i-j;
				while(c/3+i*5+j*3==100&&c%3==0){
					System.out.println("公鸡数为："+i+"母鸡数为："+j+"小鸡数为："+c);
					break;
				}
			}
		}
		
	}

}
