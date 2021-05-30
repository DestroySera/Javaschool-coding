package week03.week03day2.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* class 자료형이다, 즉 설계도임 , 메모리 생성시 이 지시서대로 공간확보해 주세요 의미~
   new로 객체생성해야만 공간이 확보되는 것임
*/
public class Order {
	
	private String orderNo;   //주문번호	
	private String customerId;  // 고객아이디	
	
	private int  totalOrderPrice;  // 총주문금액
	private List<OrderItem> list = new ArrayList<>();  //주문상품을 담는 바구니 (배열같은
	private Date orderDate= new Date();    // 주문일자
	
	/*	
	 멤버 변수에 값 채우는 것 생성자가 담당하도록
	 멤버 변수의 내용을 문자열로 반환하는것은 toString()이 하도록 한다.	
	  다른메서드를 사용해도 되지만getInfo() 등 등 ,  toString()을 사용하면 잇점이 있다. 상속에서 설명
    */
	
	public  Order() {		
	}
	
	public  Order(String orderNo, String customerId) {
		this.orderNo = orderNo;
		this.customerId = customerId;		
		
	}
	
	//주문상품 등록
	public void register(OrderItem item) {
		list.add(item);
		totalOrderPrice += item.getPurchasePrice();		
	}
	 
	
	public String toString() {		
		
		StringBuffer buffer = new StringBuffer();
		buffer.append( " 주문 내역\n");	
		buffer.append( orderNo + "  " + customerId  + "\n");
		buffer.append( "총구매금액"  + totalOrderPrice + "\n");
		
		
		for(int i=0 ; i< list.size(); i++) {
			OrderItem item = list.get(i);
			buffer.append(item );
		}
		return  buffer.toString();
	}
	
}