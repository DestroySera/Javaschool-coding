package week01.week01day3;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int sum = 0;
		for ( int i = 1; i <= value; i++) {
			if (value % i == 0) {
				sum = i;
				System.out.println(sum);
			}
		}
	}
}
