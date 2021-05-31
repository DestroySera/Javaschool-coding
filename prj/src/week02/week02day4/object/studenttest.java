package week02.week02day4.object;

// 변수 : 값을 저장하는 공간, 기억장소

// 기본변수 : int a= 10; a => 변수 ( 데이타값을 저장하는 변수 )
// 참조형 변수 : 위치를 기억(저장)하는 변수, 기본값 : null (아무것도 참조하지 않음)

public class studenttest {

	public static void main(String[] args) {
		student s = new student("김길도", 19); // s 는 변수입니다. 참조형 변수

		// 모든 클래스는 보이지않게 (무조건) Object 를 클래스를 상속받게 되어 있습니다.
		// 모든 클래스를 하나의 자료형으로 관리 할 수 있는 자료형이 바로 Object

		System.out.println(s.toString()); // 패키지명클래스이름@고유id , 생략할 수 있는 매서드
		System.out.println(s); // 객체의 정보를 가져올때 toString() 사용함
		System.out.println(s.getInfo());
	}

}
