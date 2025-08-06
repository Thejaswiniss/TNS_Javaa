package java_core4;

public class TypeCasting {

	public static void main(String[] args) {
		
					//widening 
					int quatity=2;
					double priceperitem=95.50;
					double totalprice= quatity*priceperitem;
								
					//narrowing			
					double discount=15.75;
					int roundedDiscount =  (int)discount;
					double finalAmount =totalprice-roundedDiscount;
					System.out.println("Online Shopping Summary");
					System.out.println("Final amount = "+finalAmount);

	}

}
