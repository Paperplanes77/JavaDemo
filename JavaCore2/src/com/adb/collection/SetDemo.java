package com.adb.collection;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Human>  set=new TreeSet<Human>();
		Set<Integer>  set2=new TreeSet<Integer>();
		for (int i = 0; i <4; i++) {
			set2.add(i+5);
		}
		System.out.println(set2);
		System.out.println(set2.size());
		System.out.println("foreach遍历 set");
		for (Integer integer : set2) {
			System.out.println(integer);
		}
	}

}
