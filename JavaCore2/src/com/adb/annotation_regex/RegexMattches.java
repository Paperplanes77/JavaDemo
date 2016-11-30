package com.adb.annotation_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//*0次获多次匹配前面的字符或者字表达是
//+一次获多次匹配前面的字符或子表达式
//?0次一次匹配前面的字符或子表达式
public class RegexMattches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//按指定模式在字符串查找
		String line="this order was placed for QT3000!";
		//\b单词边界    匹配除"\r\n"之外的任何单个字符
		String pattern="(\\D*)(\\d+)(.*)";
		//创建Pattern对象
		Pattern r=Pattern.compile(pattern);
		//现在创建matcher对象
		Matcher m=r.matcher(line);
		if(m.find()){
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}else{
			System.out.println("NO MATCH");
		}
	}

}
