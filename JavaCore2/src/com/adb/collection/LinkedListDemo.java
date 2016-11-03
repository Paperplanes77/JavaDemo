package com.adb.collection;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		LinkedList<Human> linkedList=new LinkedList<>();
		linkedList.add(new Human("Beyond", 50));
		linkedList.add(new Human("Beyond", 50));
		linkedList.add(new Human("Beyond2", 50));
		linkedList.add(new Human("Beyond", 53));
		out.println(linkedList);
		out.println("linkedList.iterator()+用迭代器去遍历容器");
		Iterator<Human> iterator=linkedList.iterator();
		while (iterator.hasNext()) {
			Human human = (Human) iterator.next();
			out.println(human);
		}
		out.println("linkedList.removeLast()+删除最后一个元素 并且返回这个元素");
		Human human=linkedList.removeLast();
		out.println(human);
		out.println(linkedList);//同理removeFirst();
		out.println("linkedList.clone()+浅copy");
		Object object=linkedList.clone();
		out.println(object);
		out.println("反转迭代器遍历这个linkedlist");
		Iterator<Human> iterator2=linkedList.descendingIterator();
		while (iterator2.hasNext()) {
			Human human2 = (Human) iterator2.next();
			out.println(human2);
		}
		out.println(linkedList);
		out.println("返回这个容器第一个元素");
		out.println(linkedList.element());
		out.println("offer+添加元素 在附加条件");
		linkedList.offer(new Human("布丁", 7));
		out.println(linkedList);
		out.println("返回第一个元素"+linkedList.peek());//没有的话返回null但是不删除
		out.println("捕获最后一个元素并且删除+pollLast()"+linkedList.pollLast());
		//linkedList.pollLast();
		out.println(linkedList);//linkedlist数据发生了改变
		Human human3=linkedList.pop();//删除第一个元素
		out.println(human3);
		linkedList.push(new Human("田馥甄", 43));;//添加第一个元素
		out.println(linkedList);
	}

}
