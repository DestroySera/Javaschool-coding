package week03.week03day3;

public class MyCalc {
	//필드 (멤버변수)
	
	int M_a;
	int M_b;
	
	//생성자
	
	public MyCalc(int a, int b) {
		M_a = a;
		M_b = b;
	}
	
	//인스턴스 매서드
	
	public int add() {
		return M_a + M_b;
	}
	
	//클래스 매서드
	
	static int add(int a, int b) {
		return a+ b;
	}
}
