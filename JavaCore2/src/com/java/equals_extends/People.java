package com.java.equals_extends;
class student{
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if (age>=0&&age<=150) {
			this.age=age;
		}else{
			System.out.println("录入数据有误，请重新输入！");
		}
	}
	public int geAge(){
		return age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	
}
public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.setAge(-20);
		s.setName("lucky dog");
		System.out.println(s.toString());
	}

}
