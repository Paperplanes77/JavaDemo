package com.adb.file;

import java.awt.image.WritableRenderedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class XxDemo2 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"configuration.txt");
		//配置文件！
		String tmp=config(file);
		System.out.println(tmp);
		//设法读取数据 i   j   k?
		Reader reader=new FileReader(file); 
		BufferedReader io=new BufferedReader(reader);
		
		Scanner sc=new Scanner(tmp);
		sc.useDelimiter(":");
		sc.useDelimiter("#");
		List<String> list=new LinkedList<String>();
		while (sc.hasNext()) {
			list.add(sc.next());
		}
		for (String string : list) {
			System.out.println(string);
		}
		int index=list.get(0).lastIndexOf(":");
		String string=list.get(0).substring(index+1);
		System.out.println(string+list.get(1)+list.get(2));
		/*Integer[] dataArr=null;
		int i=0;
		for (String string : list) {
			dataArr[i]=Integer.parseInt(string);
			++i;
		}
		for (int j = 0; j < dataArr.length; j++) {
			System.out.println(dataArr[j]);
		}*/
		System.out.println("获得数据结束!");
		 
		//将解题思路写入到配置文件？
		//将计算得到的结果写入   有多个结果换行输出，以方便阅读？（可以在遍历数组 write 然后writer.newline();
		///读取满足条件的数据
		int[] answer=math(100,168,1000);
		for (int ii : answer) {
			System.out.println(ii);
		}
		
	}
	public static int[] math(int i, int j, int k) {
		// TODO Auto-generated method stub
		int q=0;
		int[] arr=new int[q+1];
		for (int c=0;c<=k;c++) {
			if (Math.sqrt(c+i)%1==0&&Math.sqrt(c+j)%1==0) {
				//System.out.println(c);
				arr[q]=c;
				q++;
			} 
		}
		return arr;

		
	}
	public static String config(File file) throws IOException{
		OutputStream os=new FileOutputStream(file, true);
		Writer writer=new OutputStreamWriter(os,"UTF-8");
		//Writer writer=new FileWriter(file,true);
		Scanner sc=new Scanner(System.in);
		int m=Integer.parseInt(sc.next());
		int m2=Integer.parseInt(sc.next());
		int m3=Integer.parseInt(sc.next());
		writer.write("读取当前行的内容是:这是一个java上机题的文档文件:\r\n");
		writer.write("读取当前行的内容是:一个正整数,它加上"+m+"后是一个完全平方数,再加上"+m2+"又是一个完全平方数,请问该数是多少？\r\n");
		writer.write("读取当前行的内容是:需要的参数如下：通过解析下面的字母串得到需要的参数值\r\n");
		String string4="读取当前行的内容是:"+m+"#"+m2+"#"+m3+"\r\n";
		writer.write(string4);
		writer.write("当前行中，有需要的参数，参数为:"+m+"   "+m2+"   "+m3+"\r\n");
		writer.write("不再读取当前文件，读取配置文件的方法退出!\r\n");
		writer.close();
		System.out.println("初始文件写入完毕！\r\n");
		return string4;
	}

}
