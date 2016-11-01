package com.java.equals_extends;

public class Police {
	private int id;
	private String name;
	private double hight;
	private int price;
	 
	
	public Police(int id, String name, double hight, int price) {
		super();
		this.id = id;
		this.name = name;
		this.hight = hight;
		this.price = price;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getHight() {
		return hight;
	}



	public void setHight(double hight) {
		this.hight = hight;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Police)) {
			return false;
		}
		Police other = (Police) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}



	@Override
	public String toString() {
		return "Police [id=" + id + ", name=" + name + ", hight=" + hight + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Police p1=new Police(12345, "shangqiang", 174, 2500);
		Police p2=new Police(12345, "shangqiang", 174, 2500);
		Police p3=new Police(17345, "shangqiang", 174, 2500);
		Police p4=p3;
		System.out.println("p1.equals(p2):"+p1.equals(p2));
		System.out.println("!p2.equals(p3):"+!(p1.equals(p2)));
		System.out.println("p3.equals(p4):"+p3.equals(p4));
		p4.setId(-35678);
		System.out.println("修改后的比较p3.equals(p4):"+p3.equals(p4));
	 


	}

}
