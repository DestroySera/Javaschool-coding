package week03.week03day1;

public class 휴대폰 {
	
	
	//밧데리
	private 밧데리 밧데리객체;
	// 기능
	void set밧데리(밧데리 밧데리객체) {
		this.밧데리객체 = 밧데리객체;
	}
	void 켜기() {
		밧데리객체.에너지얻어오기();
		System.out.println(" 핸드폰이 켜집니다. ");
	}
}
