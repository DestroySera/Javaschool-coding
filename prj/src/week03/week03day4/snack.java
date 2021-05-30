package week03.week03day4;

public class Snack implements Comparable<Snack>{
	//멤버 변수, 속성, 값, Filed
	String 이름;
	String 제조사;
	String 제조일자;
	String 유통기한;
	int 중량;
	int 칼로리;
	//생성자
	//생성자를 하나라도 만들면 기본생성자를 제공하지않음
	public Snack() {}
	public Snack(String 이름, String 제조사, String 제조일자, String 유통기한, int 중량, int 칼로리) {
		this.이름 = 이름;
		this.제조사 = 제조사;
		this.제조일자 = 제조일자;
		this.유통기한 = 유통기한;
		this.중량 = 중량;
		this.칼로리 = 칼로리;
	}
	
	@Override
	public String toString() {
		return 이름 + " " + 제조사 + " " + 제조일자 + " " + 유통기한  + " " + 중량 + " " + 칼로리;
	}
	@Override
	public int compareTo(Snack o) {
		// TODO Auto-generated method stub
		return this.이름.compareTo(o.이름);
	}
}
