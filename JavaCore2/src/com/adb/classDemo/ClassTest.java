package com.adb.classDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.activation.FileDataSource;
import javax.print.DocFlavor.STRING;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		String str="abc";
		Class class1=str.getClass();
		Class class2=String.class;
		Class class3=Class.forName("java.lang.String");
		System.out.println(class1==class2);
		System.out.println(class2==class3);
		
		System.out.println(class1.isPrimitive());
		System.out.println(int.class.isPrimitive());
		System.out.println(int.class==Integer.class);
		System.out.println(int.class==Integer.TYPE);
		System.out.println(int[].class.isPrimitive());
		//数组类型不是基本类型
		
		Constructor constructor1=String.class.getConstructor(StringBuffer.class);
		//构造方法可以做什么 
		String str2=(String)constructor1.newInstance(new StringBuffer("abc"));
		//String str2=(String)constructor1.newInstance("abc");//运行后才知道类型不匹配
		System.out.println(str2.charAt(2));
		
		ReafactorPoint pt1=new ReafactorPoint(3, 5);
		Field   fieldY=pt1.getClass().getField("y");
		//field的值是多少？ 5？错，field不是对象身上的变量，而是类上的，要用他自己
		System.out.println(fieldY.get(pt1));
		Field fieldX=pt1.getClass().getDeclaredField("x");
		//变量私有话了 数据不匹配 getDescoreFiled     看到了不给用  
		//暴力反射   看不见   拿不到 怎么解决！
		fieldX.setAccessible(true);
		System.out.println(fieldX.get(pt1));
		//不给你拿到强       拿钱在你面前晃（分别解决！
		changeStringValue(pt1);
		System.out.println(pt1);
		//str1.charAt(1);
		Method methodCharAt=String.class.getMethod("charAt", int.class);
		System.out.println(methodCharAt.invoke(str, 1));
		//一个Integer类型的对象2
		System.out.println(methodCharAt.invoke(str, new Object[]{2}));
	}

	private static void changeStringValue(Object obj) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Field[] fields=obj.getClass().getFields();
		for (Field field : fields) {
			if (field.getType()==String.class) {
				String oldValue=(String) field.get(obj);
				String newValue=oldValue.replace("b", "a");
				field.set(obj, newValue);
			}
		}
		//反射把a变成b！
	}

}
