package com.adb.enumdemo;

import lombok.Getter;
import lombok.Setter;

 
public  enum EnumDemo {
	MONDAY(1, "星期一"), TUESDAY(2, "星期二"), WEDNESDAY(3, "星期三"), THURSDAY(4, "星期四"), FRIDAY(5, "星期五"), SATURDAY(6,
			"星期六"), SUNDAY(7, "星期日");
	@Getter@Setter
	private Integer index;
	@Getter@Setter
	private String str;
	private EnumDemo(Integer index, String str) {
		this.index = index;
		this.str = str;
	}
	private EnumDemo(String str) {
		this.str = str;
	}
	private EnumDemo(Integer index) {
		this.index = index;
	}
	
}
