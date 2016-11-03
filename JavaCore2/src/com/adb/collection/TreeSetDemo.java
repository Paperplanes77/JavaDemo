package com.adb.collection;

import java.io.PrintStream;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(12);
		treeSet.add(14);
		treeSet.add(15);
		treeSet.add(17);
		treeSet.add(18);
		out.println("输出大与等于这个元素的最近元素");
		Integer mInteger=treeSet.ceiling(13);
		out.println(mInteger);
		out.println("输出小于等于这个元素的最近元素");
		Integer mInteger2=treeSet.floor(13);
		out.println(mInteger2);
		Integer mInteger3=treeSet.floor(11);
		out.println(mInteger3);//没有满足元素的就输出null！
		int c=mInteger.intValue();
		out.println("将integer装换int"+c);
		treeSet.comparator();
		out.println(treeSet);
		out.println("有没有比这个元素更大的");
		Integer integer =treeSet.higher(17);
		out.println(integer);
		out.println(treeSet.higher(19));
		out.println("严格执行小于这个元素的set"+treeSet.headSet(15));
		out.println("严格执行大于这个元素的set"+treeSet.tailSet(15));
		out.println("严格执行大于这个元素的set"+treeSet.tailSet(15,false));
		out.println("严格执行大于这个元素的set"+treeSet.tailSet(15,true));
		//tailSet(15,false)不带这个元素   true带这个元素



	}

}
