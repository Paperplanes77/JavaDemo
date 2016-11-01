package com.java.equals_extends;

class food{
	// TODO Auto-generated constructor stub
	int price;
	String pz;
	
	public food() {
		super();
	}
	public food(int price, String pz) {
		super();
		this.price = price;
		this.pz = pz;
	}
	public food(int pricee){
		super();
		this.price=price;
	}
	void show(){
		System.out.println("狗粮牌子为:"+pz+" 价格为:"+price);
	}
	public String barking(){
		String str="我爱叫喜欢咬人!";
		return str;
	}
}
public class Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food f=new food();
		f.price=35;
		f.pz="精品狗粮";
		f.show();
		f.barking();
		System.out.println(f.barking());
	}

}

