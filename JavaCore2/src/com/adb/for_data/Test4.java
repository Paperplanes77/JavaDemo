package com.adb.for_data;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1,sum=0;
		/*while (i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1+2+3...+10="+sum);*/
	/*	do{
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("1+2+3...+10="+sum);*/
	/*	for(i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println(sum);*/
		/*int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}*/
		int i,j;
		for(i=9;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
