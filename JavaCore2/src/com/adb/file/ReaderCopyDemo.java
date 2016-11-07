package com.adb.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("D:"+File.separator+"temp.txt");
		File dest=new File("D:"+File.separator+"tempCopy.txt");
		Reader io=new FileReader(src);
		BufferedReader br=new BufferedReader(io);
		Writer os=new FileWriter(dest);
		BufferedWriter bw=new BufferedWriter(os);
		String tmp=br.readLine();
		while (tmp!=null) {
			bw.write(tmp);
			bw.newLine();
			tmp=br.readLine();
		}
		br.close();
		bw.close();
		System.out.println("字符流文件复制结束！");
		//复制文本是从windows写入的 编码格式  和从eclipse直接写入编码不一样有乱码
		
	}
}
