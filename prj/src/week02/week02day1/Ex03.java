package week02.week02day1;

public class Ex03 {
	public static void main(String[] args) {
		Person p = new Person();
		
		input(p);
		display(p);
		
	}
	public static void input(Person p) {
		p.name = "홍길동";
		p.ago = 25;
	}
	
	public static void display(Person p) {
		System.out.println(p.name);
		System.out.println(p.ago);
	}
}
