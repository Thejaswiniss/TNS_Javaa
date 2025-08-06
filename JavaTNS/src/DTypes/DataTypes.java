package DTypes;

public class DataTypes {

	public static void main(String[] args) {
		int orderId=101;
		double price=699.99;
		boolean isdelivered =false;
		char rating='A';
		float deliveryDistance=9.4f;
		long deliveryBoyPhone=100034;
		short restaurantid=51;
		
		//non primitive data type
		
		String customerName="Thejaswini";
		String fooditems[]= {"Cake","Pizza","Frooti"};

		//oder summary
		
		System.out.println("Oder Summary");
		System.out.println("Customer Name :"+customerName);
		System.out.println("Order id : "+orderId);
		System.out.println("Restaurant id : "+restaurantid);
		System.out.println("DeliverBoy Number : "+deliveryBoyPhone);
		System.out.println("Food items : ");
		for (String item:fooditems)
		{
			System.out.println("->  "+item);
		}
		System.out.println("Total price :"+price);
		System.out.println("Deliver distance : "+deliveryDistance);
		System.out.println("is Delivered : "+isdelivered);
		System.out.println("Rating :"+rating);
	}


	}


