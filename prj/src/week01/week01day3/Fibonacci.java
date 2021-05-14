package week01.week01day3;

public class Fibonacci {
	public static void main(String[] args) {
		long value1 = 1;
		long value2 = 1;
		long value3;

		System.out.println(value1);
		System.out.println(value2);

		for (int i = 1; i <= 48; i++) {
			value3 = value1 + value2;
			System.out.println(value3);
			value1 = value2;
			value2 = value3;
		}

	}
}
