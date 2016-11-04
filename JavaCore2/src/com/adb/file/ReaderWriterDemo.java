package com.adb.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;


public class ReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		File file=new File("D:\\helloWorld.txt");
		/*out.println("读取任意的东西！");
		Reader reader=new FileReader(file);
		char[] b=new char[(int)file.length()];
		reader.read(b);
		reader.close();
		System.out.println("文本的内容为:"+new String(b));*/
		
		
		
		out.println("如果写入的时候是从eclise就不用改编码 如果是从windows中写入读要改！");
		InputStream is=new FileInputStream(file);
		Reader reader=new InputStreamReader(is, "UTF-8");//读取正常的utf-8
		char[] b=new char[(int)file.length()];
		reader.read(b);
		reader.close();
		out.println("b:"+b);
		System.out.println("文本的内容为:"+new String(b));
		
		
		/*out.println("直接写入数据！文字都可以不需要改码");
		Writer writer=new FileWriter(file);
		String string="--------天空很蓝！-----";
		writer.write(string);
		writer.flush();*/
		
		
		
		
		/*out.println("如何追加数据呢！在FileWriter()对象后面加参数true");
		Writer writer=new FileWriter(file,true);
		String string="\r\n---222-----天空很蓝！--222---";
		writer.write(string);
		writer.flush();*/
		
	/*	out.println("向数据中追加数据  编码格式为gbk");
		OutputStream os=new FileOutputStream(file,true);
		Writer writer=new OutputStreamWriter(os, "GBK");
		String str="挺可惜的人都不在!";
		writer.write(str);
		writer.flush();
		writer.close();//先刷新在关掉流！
		out.println("向文件内容追加数据");*/
	}

}
