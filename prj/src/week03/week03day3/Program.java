package week03.week03day3;

public class Program {

	public static void main(String[] args) {
		//실습 : 여러 히어로객체를 만들고 객체의 수를 카운트 하자
		
		Hero h1 = new Hero("아서스", 200);
		Hero h2 = new Hero("레오닉", 180);
		Hero h3 = new Hero("제이나", 170);
//생성된 객체의 수
		System.out.println(Hero.count);
	}

}
