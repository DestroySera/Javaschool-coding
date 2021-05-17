package week02.week01day1;

class Person2{
	String name;
	int ago;
	
	public void input(){
		name  = "홍길동";
		ago = 25;
	}
	
	public void display() {
		System.out.println( name);
		System.out.println( ago);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		p.input();
		p.display();
	}

}
