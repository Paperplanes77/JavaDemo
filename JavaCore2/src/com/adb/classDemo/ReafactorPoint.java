package com.adb.classDemo;

public class ReafactorPoint {
	private  int x;
	public int y;
	public String str1="ball";
	public String str2="basketball";
	public String str3="falls";

	public ReafactorPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  str1 +"***"+ str2+"***" + str3 ;
	}
	
}
