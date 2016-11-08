package com.adb.file;

import java.awt.image.WritableRenderedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class XxDemo3 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"configuration.txt");
		//配置文件！
		String tmp=config(file);
		//设法读取数据 data1   data2   data3?  同时向文件中追加说明 数据是那些  并退出配置文件
		int[] srcData=getData(file, tmp);
		//将解题思路
		String str="1 调用config(file)方法配置文件 并返回一个数据的String的说明字符串！\r\n"+"2通过getData(file,tmp)方法获得设置数据源,并同时返回一个数组的int数组!\r\n"
		+"3通过gerData（file,tmp)方法向配置文件追加数据说明,并告知退出配置文件!\r\n"+"4满足同时满足加m加n平方根后取余1余数为0,并把答案输出!\r\n";
		//求出满足条件的数据数组
		int[] answerData=math(srcData[0],srcData[1],srcData[2]);
		//写入数据的解题思路和答案！
		deal(str,answerData,file);
		//将计算得到的结果写入   有多个结果换行输出，以方便阅读？（可以在遍历数组 write 然后writer.newline();
		//在控制台打印输出
		show(file);
		
	}
	//在控制台输出一切！
	public static void show(File file) throws IOException{
		//高效字符输入流
				Reader reader=new FileReader(file); 
				BufferedReader io=new BufferedReader(reader);
				while (io.readLine()!=null) {
					System.out.println(io.readLine());
				}
				//关闭流
				io.close();
				
	}
	//将解题思路和答案追加到文件中去！
	public static void deal(String str,int[] arr,File file) throws IOException{
		//向文件中追加数据
				OutputStream os=new FileOutputStream(file, true);
				Writer writer=new OutputStreamWriter(os,"UTF-8");
				writer.write(str);
				for (int i : arr) {
					writer.write("满足数据的数据为："+i+"\r\n");
				}
				//关闭刷新流
				writer.close();
				writer.flush();
	}
	
	//获得数据同时把答案数组算出
	public static int[] getData(File file,String tmp) throws IOException{
		//高效字符输入流
		Reader reader=new FileReader(file); 
		BufferedReader io=new BufferedReader(reader);
		//向文件中追加数据
		OutputStream os=new FileOutputStream(file, true);
		Writer writer=new OutputStreamWriter(os,"UTF-8");
		//扫描目标字符创的数据 并从"#"字符创隔开
		Scanner sc=new Scanner(tmp);
		sc.useDelimiter("#");
		//将切割开的字符创加入list
		List<String> list=new LinkedList<String>();
		while (sc.hasNext()) {
			list.add(sc.next());
		}
		//获得需要的标准数据处理
		int index=list.get(0).lastIndexOf(":");
		String string=list.get(0).substring(index+1);
		int data1=Integer.parseInt(string);
		int data2=Integer.parseInt(list.get(1));
		int data3=Integer.parseInt(list.get(2));
		writer.write("当前行中，有需要的参数，参数为:"+data1+"   "+data2+"   "+data3+"\r\n");
		writer.write("不再读取当前文件，读取配置文件的方法退出!\r\n");
		//关闭刷新流
		writer.close();
		writer.flush();
		//将得到的数据放入数组
		int[] arr={data1,data2,data3};
		return arr;
	}
	
	//获得答案的数组 
	public static int[] math(int i, int j, int k) {
		// TODO Auto-generated method stub
		int q=0;
		int[] arr=new int[q+1];
		for (int c=0;c<=k;c++) {
			//同时满足平方根后取于为0的数即为答案
			if (Math.sqrt(c+i)%1==0&&Math.sqrt(c+j)%1==0) {
				//System.out.println(c);
				arr[q]=c;
				q++;
			} 
		}
		return arr;

		
	}
	
	//书写配置文档
	public static String config(File file) throws IOException{
		//字节输出流 输入
		OutputStream os=new FileOutputStream(file, true);
		Writer writer=new OutputStreamWriter(os,"UTF-8");
		//Writer writer=new FileWriter(file,true);
		//控制台输入控制数据
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		//写入数据 
		writer.write("读取当前行的内容是:这是一个java上机题的文档文件:\r\n");
		writer.write("读取当前行的内容是:一个正整数,它加上"+m+"后是一个完全平方数,再加上"+m2+"又是一个完全平方数,请问该数是多少？\r\n");
		writer.write("读取当前行的内容是:需要的参数如下：通过解析下面的字母串得到需要的参数值\r\n");
		String string4="读取当前行的内容是:"+m+"#"+m2+"#"+m3+"\r\n";
		writer.write(string4);
		writer.close();
		return string4;
	}

}
