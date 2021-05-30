package week03.week03day2.test;

public class OrderItem {	 
    private String goodsName;       //상품명
    private int purchasePrice;        // 제품구매가격       
    
    
    public OrderItem() {
    	
    }

    public OrderItem(String goodsName , int purchasePrice) {
    	this.goodsName = goodsName;
    	this.purchasePrice = purchasePrice;
    }
    
    public String toString() {
    	return  goodsName + "   " +  purchasePrice +"\n";
    }
    
    public int getPurchasePrice() {
    	return purchasePrice;
    }
    
}