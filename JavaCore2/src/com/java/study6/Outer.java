package com.java.study6;

import org.omg.CORBA.PUBLIC_MEMBER;

 class Outer {
	int score=95;
	void inst(final int s){
		int temp=20;
		class Inner{
			void display(){
				 System.out.println("成绩：score="+(score+s+temp));
			}
		}
		Inner in=new Inner();
		in.display();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		outer.inst(5);
	}

}
