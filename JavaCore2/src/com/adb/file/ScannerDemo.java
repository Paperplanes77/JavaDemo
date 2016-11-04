package com.adb.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.imageio.stream.ImageInputStream;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		/*Scanner scanner=new Scanner(System.in);
		out.println("请输入字符创：");
		if (scanner.hasNext()) {
			String string=scanner.next();
			out.println(string);
		}*/
		File file=new File("D:\\helloWorld.txt");
		file.createNewFile();
		InputStream is=new FileInputStream(file);
		Scanner scanner=new Scanner(is,"GBK");
		while (scanner.hasNextLine()) {
			out.println(scanner.nextLine());
		}
		is.close();
 	}

}
