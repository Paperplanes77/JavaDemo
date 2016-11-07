package com.adb.file;

import java.awt.image.WritableRenderedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class XxDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"configuration.txt");
		config(file);
		math(100,168,1000);
		
	}
	public static void math(int i, int j, int k) {
		// TODO Auto-generated method stub
		for(int c=0;c<=1000;c++){
			for(int v=0;v<=400;v++){
				if(true){
					
				}
			}
		}
	}
	public static void config(File file) throws IOException{
		OutputStream os=new FileOutputStream(file, true);
		Writer writer=new OutputStreamWriter(os,"GBK");
		//Writer writer=new FileWriter(file,true);
		Scanner sc=new Scanner(System.in);
		int m=Integer.parseInt(sc.next());
		int m2=Integer.parseInt(sc.next());
		int m3=Integer.parseInt(sc.next());
		writer.write("读取当前行的内容是：这是一个java上机题的文档文件：\r\n");
		writer.write("读取当前行的内容是：一个正整数,它加上"+m+"后是一个完全平方数,再加上"+m2+"又是一个完全平方数,请问该数是多少？\r\n");
		writer.write("读取当前行的内容是：需要的参数如下：通过解析下面的字母串得到需要的参数值\r\n");
		writer.write("读取当前行的内容是："+m+"#"+m2+"#"+m3+"\r\n");
		writer.write("当前行中，有需要的参数，参数为："+m+"   "+m2+"   "+m3+"\r\n");
		writer.write("不再读取当前文件，读取配置文件的方法退出！\r\n");
		writer.close();
		System.out.println("初始文件写入完毕！\r\n");
	}

}
