package week01day4;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int input = 0, answer = 0;
		answer = (int) (Math.random() * 100) + 1;

		Scanner sc = new Scanner(System.in);
		int count = 0;
		do {
			System.out.println("1과 100사이의 정수를 입력하세요");
			input = sc.nextInt();
			if (input > answer) {
				System.out.println("더 작은수로 시도해보세요");
			} else if (input < answer) {
				System.out.println("더 큰 수로 시도해보세요");
			}
			count++;
		} while (input != answer);
		System.out.println("시도 횟수 :" + count);
		System.out.println("정답입니다");
	}
}
