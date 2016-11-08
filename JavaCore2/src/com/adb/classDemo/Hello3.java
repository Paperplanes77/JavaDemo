package com.adb.classDemo;
class Demo3{  
    //other codes...  
}  
   
public class Hello3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> demo1=null;  
        Class<?> demo2=null;  
        Class<?> demo3=null;  
        try{  
            //一般尽量采用这种形式  
            demo1=Class.forName("com.adb.classDemo.Demo3");  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        demo2=new Demo3().getClass();  
        demo3=Demo3.class;  
           
        System.out.println("类名称   "+demo1.getName());  
        System.out.println("类名称   "+demo2.getName());  
        System.out.println("类名称   "+demo3.getName()); 
	}

}
