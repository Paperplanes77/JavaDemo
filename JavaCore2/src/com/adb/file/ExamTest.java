package com.adb.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Sequence;
import javax.swing.JPopupMenu.Separator;

public class ExamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//配置文件地址
		File file=new File("D:"+File.separator+"confgriution2.txt");
		//初始化配置文件
		config(file);
		//解析获得所需要的数据
		int[] arr= getData(file);
		//计算满足数据的所有和数据，和最大最小值
		int average=math(arr[0],arr[1]);
		//解题思路
		String answer="1 调用config(file)方法配置文件 \r\n"+"2通过getData(file)方法获得设置数据源,向配置文件追加数据说明,并告知退出配置文件.并同时返回一个数组的int数组!\r\n"
				+"3通过math(srcData[0],srcData[1])方法求出满足条件的数据!\r\n"+"4通过deal()方法向文件追加解题思路和答案，最后通过show()方法在控制台打印!\r\n";
		//追加解题思路和答案
		deal(average,answer,file);
		//在控制台打印结果
		show(file);
	}
	public static void show(File file) throws IOException {
		// TODO Auto-generated method stub
		//高效字符输入流
		Reader reader=new FileReader(file); 
		BufferedReader io=new BufferedReader(reader);
		//读出每一行！
		String string=io.readLine();
		while (string!=null) {
			System.out.println(string);
			string=io.readLine();
		}
		//关闭流 先刷新在处理！
		io.close();
	}
	//向文件中追加数据
	public  static void deal(int average, String answer,File file) throws IOException {
		// TODO Auto-generated method stub
		//向文件中追加数据
		OutputStream os=new FileOutputStream(file, true);
		Writer writer=new OutputStreamWriter(os,"UTF-8");
		writer.write("解题思路为："+"\r\n");
		writer.write(answer);
		writer.write(average+"\r\n");
		//关闭刷新流
		writer.flush();
		writer.close();
	}
	//求出满足数据的数据
	public  static int math(int i, int j) {
		// TODO Auto-generated method stub
		//创建list集合接受所有满足数据的数据
		List<Integer> list=new LinkedList<Integer>();
		if (j<=0) {
			System.out.println("数据录入错误,请重新输入！");
			return 0;
		}
		
		for(int m=0;m<=i;m++){
			if (m%j==0) {
				list.add(m);
				//System.out.println(m);
			}
		}
		Collections.sort(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		int max=Collections.max(list);
		int min=Collections.min(list);
		int averge=(max+min)/2;
		return averge;
	}
	//获得需要的数据源,并向配置文件追加说明
	public static int[] getData(File file) throws IOException {
		// TODO Auto-generated method stub
		//读取配置文件的数据信息 高效字节输入流
		Reader is=new FileReader(file);
		BufferedReader br=new BufferedReader(is);
		//写入配置文件内容
		OutputStream os=new FileOutputStream(file,true);
		Writer wt=new OutputStreamWriter(os,"UTF-8");
		//定义一个string类型字符串str用于接受数据源的那条语句 
		String tmp=null;
		String string=br.readLine();
		while (string!=null) {
			if(string.contains("#")){
				tmp=string;
				break;
			}
			string=br.readLine();
		}
		//对数据源的字符串进行处理
		int index=tmp.lastIndexOf(":");
		String str=tmp.substring(index+1);
		String[] dataStr=str.split("#");
		int m=Integer.parseInt(dataStr[0]);
		String  data2=dataStr[1].trim();
		int n=Integer.parseInt(data2);
		//定义一个数组 接受数据的数组
		int[] arr={m,n};
		//追加文件说明
		wt.write("当前行中，有需要的参数，参数为:"+m+"   "+n+"\r\n");
		wt.write("不再读取当前文件，读取配置文件的方法退出!\r\n");
		wt.flush();
		br.close();
		wt.close();
		return arr;
	}
	//初始化配置文件
	public static void config(File file) throws IOException {
		// TODO Auto-generated method stub
		//写入配置文件内容
		OutputStream os=new FileOutputStream(file,true);
		Writer wt=new OutputStreamWriter(os,"UTF-8");
		//键盘输入数据
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		//写入数据
		wt.write("读取当前行的内容是:这是一个java上机题的文档文件:\r\n");
		wt.write("读取当前行的内容是:在"+m+"范围内有多少数整除与"+n+"求出满足条件的所有数据最大值与最小值的平均值？\r\n");
		wt.write("读取当前行的内容是:需要的参数如下：通过解析下面的字母串得到需要的参数值\r\n");
		wt.write("读取当前行的内容是:"+m+"#"+n+"\r\n");
		//刷新关闭流
		wt.flush();
		wt.close();
	}

}
