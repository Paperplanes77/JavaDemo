package com.adb.collection;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		List<String> ll=new LinkedList<String>();
		ll.add("wwww");
		ll.add("ttt");
		ll.add("yyyy");
		ll.add("ttt");
		ll.add("ttt");
		ll.add("ppp");
		//输出ll容器的长度
		ll.size();
		System.out.println(ll);
		out.println("ll.remove('wwww')"+"判断是否成功删除元素");
		boolean flag=ll.remove("wwww");
		out.println(flag);
		out.println("ll.remove(index)"+"删除删除指定索引的元素");
		String tmp=ll.remove(1);
		out.println(tmp);
		out.println("ll.get(2)"+"获得指定索引的元素");
		String tmp2=ll.get(2);
		out.println(tmp2);
		out.println("ll.add(2, 'helloworld')"+"在指定索引加元素 ");
		ll.add(2, "helloworld");
		out.println(ll);//直接数到那个索引加在左边
		out.println("用迭代器去遍历list 对象ll");
		Iterator<String> iterator=ll.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			out.println(string);
		}
		out.println("ll.addAll(ll2)："+"是否将容器加入到ll中去了");
		List<String> ll2=new LinkedList<String>();
		ll2.add("wwww");
		ll2.add("ppp");
		out.println(ll.addAll(ll2));
		out.println(ll);
		out.println("ll2.addAll(1,ll)："+"是否将容器加入到ll2中指定索引去了");
		ll2.addAll(1, ll);
		out.println(ll2);//加入到左边索引
		out.println(".containsAll(ll3)+判断容器是否包含另一个容器中的所以元素！");
		List<String> ll3=new LinkedList<String>();
		ll.containsAll(ll3);
		out.println(ll.containsAll(ll3));
		List<String> ll4=new LinkedList<String>();
		out.println(ll3.equals(ll4));
		out.println(ll2);
		out.println(ll.getClass());
		out.println("ll2.indexOf"+"判断某个元素是否在容器里 返回下标");
		int m=ll2.indexOf("helloworld");	
		out.println(m);//没有的话返回-1
		out.println("ll2.lastindexOf"+"判断某个元素最后出现的在容器里下标");
		int p=ll2.lastIndexOf("ttt");
		out.println(p);
		out.println("2.toArray()将对象ll2转换为数组");
		Object[] obj=ll2.toArray();
		for (Object object : obj) {
			out.print(object+"**");
		}
		out.println(".subList(3, 7)+截取ll2的里面的一段内容");
		List<String> list=ll2.subList(3, 7);
		out.println(list);//抱左不抱右、
		Spliterator<String > spl=list.spliterator();
		out.println(spl);
		out.println("迭代器遍历list容器中指定索引开始的");
		out.println(list);
		Iterator<String> mm=list.listIterator(1);
		while (mm.hasNext()) {
			String string = (String) mm.next();
			out.println(string);
		}
		out.println(".set(1, 'badboy')+换掉指定索引处的索引 用另一个元素");
		list.set(1, "badboy");
		out.println(list.toString());
		out.println(".retainAll(list2)+保留留与另一个容器的共同元素！");
		//ll2.retainAll(list);
		List<String> list2=new LinkedList<String>();
		list2.add("wwww");
		list2.add("ppp");
		out.println(list.retainAll(list2));
		out.println(list.toString());//对象容器必须包含指定容器的所有元素true
		out.println(list2.retainAll(list));
		out.println(list2.toString());//对象容器不包含指定容器的所有元素false
		out.println(".clear()+清除所有元素！");
		ll2.clear();
		out.println(ll2);
		out.println(".add('你好啊')+在末尾添加元素返回值boolean");
		boolean flag2=ll2.add("你好啊");
		out.println(ll2);
	 
		
	}

}
