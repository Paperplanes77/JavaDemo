package com.adb.collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		Map<String, Human> map=new HashMap<String,Human>();
		map.put( "会唱你把我灌醉!",new Human("zhangsan", 30));
		map.put("会唱Paperplanes!",new Human("lisi", 30));
		map.put("会唱心爱!",new Human("wanger", 30));
		map.put("会唱情有独钟!",new Human("zhangsan", 30));
		map.put("会唱大王喊我来巡山!",new Human("myself", 30));
		out.println("map的大小"+map.size());
		out.println(map);
		out.println("输出key所对应的values值");
		Human human1=map.get("会唱心爱!");
		out.println(human1);
		out.println("删除指定key对应的键值对！");
		map.remove("会唱心爱!");
		out.println(map);
		out.println("会获得keys的集合");
		Set<String> sett=map.keySet();
		out.println(sett);
		Human human=map.put("会唱大王喊我来巡山!", new Human("shangqiang", 25));
		out.println(human);
		Set<Map.Entry<String, Human>> set2=map.entrySet();
		for (Entry<String, Human> entry : set2) {
			out.println(entry.getKey()+"***"+entry.getValue());
		}
		out.println("&&&&&&&&&&&&&&&&&&7");
		Set<String> sett2=map.keySet();
		for (String string : sett2) {
			out.println();
		}
	}

}
