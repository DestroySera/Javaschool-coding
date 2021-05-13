package week01day4;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		String name; // 사원 이름
		int money = 0; // 입력 받는 돈
		int value = 50000; // 최대 화폐
		int value1 = 0; // 단위를 바꿔줄 때 사용할 변수
		int value2; // 계산된 매수를 저장할 변수
		Scanner sc = new Scanner(System.in);
		name = sc.next(); // 사원이름 입력
		money = sc.nextInt(); // 출장비 입력
		System.out.println("이름 : " + name);
		System.out.println("출장비 : " + money);
		System.out.print("오만원 만원 오천원 천원 오백원 백원 오십원 십원 "); // 출력
		System.out.println(" ");
		for (int i = 0; i < 8; i++) { // 화폐 갯수만큼 반복
			value2 = money / value; // 출장비랑 최대 화폐 계산
			

			System.out.print(value2 + "   "); // 출력

			money = money - (value2 * value); // 출장비 - ( 계산된 매수 X 최대 화폐 )

			if (value1 == 0) { 
				value = value / 5; 

				value1 = 1; 
			} else {
				value = value / 2;
				value1 = 0;
			}
		}

	}

}
