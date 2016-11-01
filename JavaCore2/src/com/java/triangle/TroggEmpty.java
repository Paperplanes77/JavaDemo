package com.java.triangle;

public class TroggEmpty {
	private Math math;
	public Math getMathInstance(){
		if (math==null) {
			math=new Math();
		}
		return math;
	}
	/**
	 * 内部类虚心三角形
	 * @author 
	 *
	 */
	public void print(String str1,String str2){
		int m=Integer.parseInt(str1);
		int n=Integer.parseInt(str2);
		int c=(m/2);
		int p=(n/2);
		for(int i=0;i<c;i++){
			for(int j=0;j<n;j++){
				if (j==(p-i)||j==(p+i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int t=0;t<m+1;t++){
			System.out.print("*");
		}
	}
	class Math{
		 
		public void goMathPrint(String str1,String str2){
			TroggEmpty.this.print(str1,str2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TroggEmpty trogg1=new TroggEmpty();
		TroggEmpty.Math math2=trogg1.getMathInstance();
		math2.goMathPrint(args[0], args[1]);
	}

}
