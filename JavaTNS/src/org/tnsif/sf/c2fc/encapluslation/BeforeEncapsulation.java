package org.tnsif.sf.c2fc.encapluslation;


class Human{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setAge(26);
		obj.setName("Rashmi");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(16);
		obj.setName("Hema");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());


	}

}
