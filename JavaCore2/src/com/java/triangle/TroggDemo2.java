package com.java.triangle;

public class TroggDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if ((j>(4+i)) ) {
					System.out.print(" ");
				}else if(j<(4-i)){
					System.out.print(" ");
				}else if(i<5){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
