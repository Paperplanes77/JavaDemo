package com.adb.collection;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Human {
	private String name;
	private int age;
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name+"**"+age;
	}
	
}
