package com.java.equals_extends;

 

public class Worker extends Human{
	private String oox;
	 
	


	public String getOox() {
		return oox;
	}

	public void setOox(String oox) {
		this.oox = oox;
	}

	public Worker(int age, String name, double hight, int price) {
		super(age,name,hight,price);
 
	}
	public Worker(int age, String name, double hight, int price,String oox) {
		super(age,name,hight,price);
		this.oox=oox;
	}
	 
	public void make(){
		System.out.println("工人热爱生活和工作！");
	}
	@Override
	public String toString() {
		return "Worker [oox=" + oox + ", getOox()=" + getOox() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker(32, "shangqiang", 174.5, 3200);
		System.out.println(worker);
		Worker worker2 = new Worker(32, "shangqiang", 174.5, 3200,"fly fly fly");
		System.out.println(worker2);
	}

}
