package week01day4;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int value = sc.nextInt();
		if ( value == 1) {
		for (int i = 1; i <= arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		}
	}
}
