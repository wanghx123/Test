package day13;

import java.util.Objects;

public class Customer {
    	private String name;
	private int age;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Customer)) return false;
		Customer customer = (Customer) o;
		return age == customer.age && Objects.equals(name, customer.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


//    @Override
//    public boolean equals(Object obj) {
//		if (this == obj){
//			return  true;
//		}
//		if (obj instanceof  Customer){
//			Customer cust = (Customer)obj;
//			//比较两个对象的每个属性是否都相同
////			if(this.age == cust.age && this.name.equals(cust.name) ){
////				return true;
////			}else {
////				return false;
////			}
//			//或
//			return this.age == cust.age && this.name.equals(cust.name);
//		}
//		return  false;
//    }
}
