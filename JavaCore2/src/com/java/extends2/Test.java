package com.java.extends2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joker player1=new Top();
		Joker player2=new Mid();
		Joker player3=new Jug();
		Top top=(Top)player1;
		System.out.println(top);
		/*Mid mid=(Mid)player1;
		System.out.println(mid);*///兄弟之间不能装换


	}

}
