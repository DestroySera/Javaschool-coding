package week02.week02day1;

import java.util.Scanner;

public class Ex01{
	public static void main(String[] args) {
		int value = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		value = sc.nextInt();
		
		System.out.print("값 출력 :");
		for ( int i = 2; i < value; i++) {
			while (value % i == 0) {
				System.out.print(i + " ");
				value /= i;
			}
		}
		if (value != 1) {
			System.out.print(value);
		}
	}
}