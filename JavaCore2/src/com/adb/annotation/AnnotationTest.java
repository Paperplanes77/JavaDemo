package com.adb.annotation;
@XaAnnoation
public class AnnotationTest {
	@SuppressWarnings("deprecation")//让他不警告 命令行可以理解
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.runFinalizersOnExit(true);
		//是不是它的注解
		if(AnnotationTest.class.isAnnotationPresent(XaAnnoation.class)){
			XaAnnoation annoation=(XaAnnoation)AnnotationTest.class.getAnnotation(XaAnnoation.class);
			System.out.println(annoation);
		}
	}
	@Deprecated//使它过时
	public static void sayHello(){
		System.out.println("hello world!");
	}

}
