package week03.week03day2.test;

public class OrderTest {

	public static void main(String[] args) {		
		//
		
		
		
		
		OrderItem item1 = new OrderItem("선풍기", 49000);
		OrderItem item2 = new OrderItem("과자", 12000);
		OrderItem item3 = new OrderItem("음료수", 8000);
		
	 
		Order order = new Order("j2021-04-09-001" , "angel1004" );
		order.register(item1);
		order.register(item2);
		order.register(item3);
		
		System.out.println(order.toString());		
		

	}

}