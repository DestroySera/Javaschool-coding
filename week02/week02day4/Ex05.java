package week02.week02day4;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * person hong = new person("홍길동", 25);
		 * 
		 * hong.eat(); hong.sleep();
		 */

		// 1. 추상클래스 : 클래스 멤버에 추상 매서드를 가지면 추상클래스
		// 2. 추상클래스는 new 할 수 없음 ( 미완성 클래스 )
		// 3. 부모로서만 사용됨

		people a = new people();
		a.eat();
		a.sleep();
		a.dance();

		person s = new people(); // 상속관계에서 부모형 참조변수에 저장
		s.eat();
		s.sleep();
		s.dance();

	}
}
