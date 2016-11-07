package com.adb.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("D:\\ceshi.wmv");
		File dest=new File("D:\\ceshiCopy.wmv");
		InputStream io=new FileInputStream(src);
		BufferedInputStream bis=new BufferedInputStream(io);
		byte[] b=new byte[1024];//(int) (src.length()/16)
		OutputStream os=new FileOutputStream(dest);
		BufferedOutputStream bos=new BufferedOutputStream(os);
		while (bis.read(b)!=-1) {
 			bos.write(b);
		}
		//bis.read()!=-1   是任何时候都会满足   会继续写
		bis.close();
		bos.close();
		System.out.println("字节流文件复制结束！");
	}

}
