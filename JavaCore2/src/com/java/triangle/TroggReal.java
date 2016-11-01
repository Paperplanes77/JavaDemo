package com.java.triangle;

public class TroggReal {
	private Math math;
	public Math getMathInstance(){
		if (math==null) {
			math=new Math();
		}
		return math;
	}
	/**
	 * Outter实现实心三角形
	 * @author 
	 *
	 */
	class Math{
		public void print(String str1,String str2){
			int m=Integer.parseInt(str1);
			int n=Integer.parseInt(str2);
			int c=(m/2);
			int p=(n/2);
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if (j<(p-i)||j>(p+i)) {
						System.out.print(" ");
					}else if (i<c+1) {
						System.out.print("*"); 
					}
				}
				System.out.println();
			}
		}
	}
	public void goMathPrint(String str1,String str2){
		getMathInstance().print(str1,str2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TroggReal trogg1=new TroggReal();
		trogg1.goMathPrint(args[0], args[1]);
	}

}
