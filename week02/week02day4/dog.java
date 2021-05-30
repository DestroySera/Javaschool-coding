package week02.week02day4;

//상속받은 클래스의 생성자는 무조건 부모의 기본생성자를
//호출하게끔 되어있어요.
// 부모의 기본생성자가 없으면 에러가 발생합니다.
// 단. 내가 부모의 다른 생성자를 호출하고 싶다면
// super(인자정보 ) 형식으로 호출할 수 있음
public class dog extends animal {

	//
	// 생성자
	public dog() {
		// 부모의 기본생성자 호출함 , 무조건
		// 부모의 기본 생성자가 없으면 오류가 발생함
		// 부모의 다른 생성자를 호출하려면 super 사용
		this("푸들", 3);
	}

	public dog(String name, int age) {
		// 부모의 기본생성자 호출함
		super(name, age);
	}

	public void savehome() {
		System.out.println("집을 지킨다.");
	}
}
