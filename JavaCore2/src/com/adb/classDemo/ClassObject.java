package com.adb.classDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.adb.file.ExamRefactor;

public class ClassObject {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		//创建对象 通过
		Class class1=Class.forName("com.adb.file.ExamRefactor");
		Constructor[] constructors=class1.getConstructors();
		ExamRefactor refactor=(ExamRefactor) constructors[0].newInstance();
	}

}
