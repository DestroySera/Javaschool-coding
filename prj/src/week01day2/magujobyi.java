package week01day2;

import java.util.Scanner;

public class magujobyi {
	public static void main(String[] args) {
		final int MAX = 100;
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("-----------------------------------------------------");
		// 항 n
		// 항 누적 sum2 
		int n = 0;
		int sum2 = 0;

		for (int j = 1; j <= 100; j++) {
			n = 0;
			for (int a = 1; a <= j; a++) {
				n += a;
			}
			sum2 += n;
		}

		System.out.println(sum2);
		System.out.println("-----------------------------------------------------");

		int pos_cnt = 0, neg_cnt = 0, even_cnt = 0, odd_cnt = 0; // 출력자료
		int number;
		int n1 = 0;
		final int Max = 2;

		Scanner sc = new Scanner(System.in);
		for (n = 1; n1 <= Max; n1++) {
			number = sc.nextInt();
			n1 = n1 + 1;
			if (number > 0) {
				pos_cnt = pos_cnt + 1;
				if (number % 2 == 0) {
					even_cnt = even_cnt + 1;
				} else {
					odd_cnt = odd_cnt + 1;
				}
			} else {
				neg_cnt = neg_cnt + 1;
			}
		}
		System.out.println("양수개수=" + pos_cnt);
		System.out.println("음수개수=" + neg_cnt);
		System.out.println("양수중 짝수개수=" + even_cnt);
		System.out.println("양수중 홀수개수=" + odd_cnt);
		System.out.println("-----------------------------------------------------");

		int b = 1;
		int c = 2;
		int y = 0;
		int sum3 = 0;
		while (sum3 <= 1000) {
			sum3 += b;
			b = b + c;
			y++;
		}

		System.out.println("마지막 항 : " + y);
		System.out.println("초과한 값 : " + sum3);
		System.out.println("-----------------------------------------------------");

		int t = 0;
		int sum4 = 0;
		int value = 6;
		double Average3 = 0;
		Scanner sc1 = new Scanner(System.in);
		for (int v = 0; v < value; v++) {
			t = sc1.nextInt();
			sum4 += t;
		}
		Average3 = (double) sum4 / value;
		System.out.println("합계=" + sum4);
		System.out.println("평균=" + Average3);
		System.out.println("end");
	}

}
