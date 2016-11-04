package com.adb.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		File file=new File("D:\\temp.txt");
		//file.createNewFile();
		out.println("file.createNewFile():"+file.createNewFile());
		file.getParentFile();
		out.println("file.getParentFile():"+file.getParentFile());
		out.println("file.getFreeSpace():"+(double)file.getFreeSpace()/1024/1024/1024+("GB"));
		boolean flag=file.mkdirs();
		out.println(flag);
		boolean flag2=file.mkdir();
		out.println(flag2);
	}

}
