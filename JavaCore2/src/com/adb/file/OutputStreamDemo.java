package com.adb.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.OverlayLayout;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:"+File.separator+"boke.txt");
		OutputStream os=new FileOutputStream(file);
		String name="/r/n kaixinjiuhao";
		byte[] b=name.getBytes();
		os.write(b);
		System.out.println("打印内容为："+new String(b));
		os.close();
		os.flush();
	}

}
