package com.adb.enumdemo;

import lombok.Getter;
import lombok.Setter;

public enum SeasonEnum {
	 SPRING(1,"春天来了") ,SUMMER(5,"夏天来了"),AUTUMN(8,"秋天来了"),WINTER(11,"冬天来了");
	@Getter@Setter
	private Integer index;
	@Getter@Setter
	private String str;
	private SeasonEnum(Integer index, String str) {
		this.index = index;
		this.str = str;
	}
	private SeasonEnum() {
	}
	private SeasonEnum(Integer index) {
		this.index = index;
	}
	
}
