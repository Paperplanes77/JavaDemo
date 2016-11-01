package com.java.triangle;
class Dd{
	public void math(String str1,String str2){
		int m=Integer.parseInt(str1);
		int n=Integer.parseInt(str2) ;
		int p=(n/2);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				
				if ((j>(p+i)) ) {
					System.out.print(" ");
				}else if(j<(p-i)){
					System.out.print(" ");
				}else if(i<p+1){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void math2(int m,int n){
		 
		int p=(n/2);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				
				if ((j>(p+i)) ) {
					System.out.print(" ");
				}else if(j<(p-i)){
					System.out.print(" ");
				}else if(i<p+1){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}
public class TroggDemo3 extends Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TroggDemo3 tg3=new TroggDemo3();
		 tg3.math2(15,15);
		 tg3.math(args[0], args[1]);
	}

}
