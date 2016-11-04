package com.adb.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
 
public class WriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\tmp.txt");
		Writer writer=new FileWriter(file,true);
		System.out.println("向文件追加内容！");                                                        
		Date date=new Date();
		String str="/r/n abcdegfg";
		String str2="boomboomboom";
		writer.write(str2);
		writer.write(str);
		writer.close();
		
	}

}
