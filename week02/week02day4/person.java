
package week02.week02day4;

public abstract class person {
	String name;
	int age;

	// 생성자 (규칙 : 클래스명과 동일하게)

	// default 생성자 (기본생성자)
	public person() {

	}

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sleep() {
		System.out.println("잔다.");
	}

	public void eat() {
		System.out.println("먹는다.");
	}

	public abstract void dance(); // 매서드의 선언부만 가지는
									// 매서드를 추상매서드
}
