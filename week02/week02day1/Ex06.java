package week02.week02day1;
// 생성자 : 클래스 멤버 변수의 값을 초기화 하는 역할
//실행시점 : 객체를 생성하는 new 하는 코드에서 단 한번 실행됨 
// 생성자를 두는 이유 : 데이터보호, 데이터값이 실수로 변경되는것을 막음
class Person3{
	private String name;
	private int age;
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person3() {
		
	}
	
	public void disp() {
		System.out.println(name + "" + age);
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Person3 p = new Person3();
		Person3 p2 = new Person3("홍길동", 19);
		
		p2.disp();
	}
}
