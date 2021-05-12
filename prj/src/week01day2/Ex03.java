package week01day2;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		String sawonnum;
		int worktime = 0;
		int money = 0;

		int tax = 0;
		int allmoney = 0;
		int givemoney = 0;

		final int MAX = 2;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= MAX; i++) {

			sawonnum = sc.next();
			worktime = sc.nextInt();
			money = sc.nextInt();

			// 총지금액 구하기

			if (worktime > 40) {
				allmoney = (int) ((money * 40) + ((worktime - 40) * money * 1.5));
			} else {
				allmoney = money * worktime;
			}

			// 세금구하기
			if (allmoney >= 400000) {
				tax = 30000;

			} else {
				tax = 0;
			}
			// 실수령액
			givemoney = allmoney - tax;

			System.out.printf("번호 : %s 단가: %d 세금: %d 총임금: %d 지급임금: %d %n", sawonnum, money, tax, allmoney, givemoney);
		}

	}
}
