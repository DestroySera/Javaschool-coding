package week02.week02day4.object;

public class student {
	String name;
	int age;

	public student() {

	}

	public student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return name + " " + age;
	}

	@Override
	public String toString() {
		return name + " " + age;
	}
}
