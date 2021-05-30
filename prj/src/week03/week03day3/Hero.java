package week03.week03day3;

public class Hero {
							//필드 (멤버변수)
	String name;//인스턴스 변수
	int hp;
	static int count; //클래스에서 공통으로 사용하는 변수
									//생성자
	public Hero(String a, int b) {
		count++;
		name = a;
		hp = b;
	}
	
						//매서드
	public void punch() {
		System.out.println(name + "펀치 =>" + hp);
	}

}
