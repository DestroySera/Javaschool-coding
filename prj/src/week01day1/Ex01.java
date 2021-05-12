package week01day1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int pos_cnt = 0, neg_cnt= 0, even_cnt = 0, odd_cnt = 0; // 출력자료
		int number;
		int n = 0;
		final int Max = 10;
		
		
		Scanner sc = new Scanner(System.in);
		for(n=1; n <= Max; n++) {
			number = sc.nextInt();
			n = n + 1;
			if (number > 0) {
				pos_cnt = pos_cnt + 1;
				if ( number % 2 == 0) {
					even_cnt = even_cnt + 1;
				}else {
					odd_cnt = odd_cnt + 1;
				}
			}else {
				neg_cnt = neg_cnt + 1;
			}
		}
		System.out.println("양수개수="+ pos_cnt);
		System.out.println("음수개수="+ neg_cnt);
		System.out.println("양수중 짝수개수="+ even_cnt);
		System.out.println("양수중 홀수개수="+ odd_cnt);
	}
}