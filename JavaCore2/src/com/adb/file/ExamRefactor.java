package com.adb.file;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExamRefactor {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		//配置文件地址
		File file=new File("D:"+File.separator+"confgriution3.txt");
		//获取字节码对象
		Class<?> class1=Class.forName("com.adb.file.ExamTest");
		//获取构造方法
		Constructor<?> c=class1.getConstructor();
		Object obj=c.newInstance();
		//配置方法
		Method m=class1.getMethod("config", File.class);
		m.invoke(obj,file);
		//获得数据的方法
		Method m1=class1.getMethod("getData", File.class);
		int[] arr=(int[]) m1.invoke(obj, file);
		for (int i : arr) {
			System.out.println(i);
		}
		//处理数据的方法
		Method m2=class1.getMethod("math", int.class,int.class);
		int average= (int) m2.invoke(obj,arr[0],arr[1]);
		//解题思路
		String answer="1 调用config(file)方法配置文件 \r\n"+"2通过getData(file)方法获得设置数据源,向配置文件追加数据说明,并告知退出配置文件.并同时返回一个数组的int数组!\r\n"
		+"3通过math(srcData[0],srcData[1])方法求出满足条件的数据!\r\n"+"4通过deal()方法向文件追加解题思路和答案，最后通过show()方法在控制台打印!\r\n";
		//处理数据的方法
		Method m3=class1.getMethod("deal",int.class,String.class,File.class);
		m3.invoke(obj, average,answer,file);
		//控制台打印输出所有
		Method m4=class1.getMethod("show",File.class);
		m4.invoke(obj,file);
	}

}
