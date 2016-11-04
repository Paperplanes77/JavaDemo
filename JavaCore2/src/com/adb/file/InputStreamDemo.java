package com.adb.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"boke.txt");
		InputStream is=new FileInputStream(file);
		byte[] b =new byte[(int)file.length()];
		is.read(b);
		System.out.println("文本内容是："+new String(b));
		is.close();
		System.out.println("流关闭了！");
	}

}
