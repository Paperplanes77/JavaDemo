package com.adb.thread;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time=System.currentTimeMillis();
		Date date=new Date(time);
		DateFormat df=new SimpleDateFormat();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		String timeString=sdf.format(date);
		System.out.println(timeString);
	}

}
