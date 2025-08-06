package java_core2;


public class Variables {

	

		int a = 10;
		void print() {
		String msg= "Hello";//local variable
	    System.out.println(msg);
	}
	static String message="Hello Students";//static variable
	public static void main(String[] args) {
    Variables obj=new  Variables();
	System.out.println("The value of a is "+obj.a);
	obj.print();
	System.out.println(message);
				
	}

}
