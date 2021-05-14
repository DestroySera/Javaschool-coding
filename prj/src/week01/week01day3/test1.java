package week01.week01day3;

import java.util.Scanner;

// 문제 
// 1~10까지의 합을  출력하시오
// 월을 입력받아 해당하는 계절을 출력하시오 (12 ~ 2 : 겨울, 3 ~ 5 : 봄, 6~8 : 여름  9 ~ 11 : 가울)
// 수를 입력받아 1 ~ 입력된 수 까지의 합을  구하시오

public class test1 {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 0; i <= 10; i++) {
			a += i;
		}
		System.out.println(a);
		System.out.println("_____________________________________________________________");

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요(if문)");
		int month = sc.nextInt();
		if (month == 12 || month <= 2) {
			System.out.println("겨울");
			System.out.println("_____________________________________________________________");
		} else if(month >= 3 && month <= 5) {
			System.out.println("봄");
			System.out.println("_____________________________________________________________");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
			System.out.println("_____________________________________________________________");
		} else if ( month >= 9 && month <= 11) {
			System.out.println("가을");
			System.out.println("_____________________________________________________________");
		} else {
			System.out.println("해당되는 계절이 없습니다.");
			System.out.println("_____________________________________________________________");
		}
		System.out.println("수를 입력하세요");
		int value = sc.nextInt();
		int result = 0;
		for(int j = 0; j <= value; j++) {
			result += j;
		}
		System.out.println(result);
		System.out.println("_____________________________________________________________");
		
		System.out.println("월을 입력하세요(switch문)");
		int month1 = sc.nextInt();
		
		switch( month1) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			System.out.println("_____________________________________________________________");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			System.out.println("_____________________________________________________________");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			System.out.println("_____________________________________________________________");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			System.out.println("_____________________________________________________________");
			break;
			default:
		
		}

	}
}
