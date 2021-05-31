package week02.week02day4;

public class animal {
	String name; // 멤버 변수, 필드즈 (fileds), 속성 : attribute
	int age;

	// 생성자
	public animal() {

	} // 기본 생성자

	public animal(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public void output() {
		System.out.println(name + " : " + age);
	}

}

// 상속관계에서 부모의 기본생성자를 만들어 두는것이 좋다.
// 자식의 생성자에서 부모의 기본생성자를 무조건 호출하게끔 되있었다 .
// 부모의 멤버변수의 값은 초기화는 부모의 생성자가 책임을 질 수 있도록 하는 것임
// 부모의 다른생성자 호출하는 키워드 super를 사용함
