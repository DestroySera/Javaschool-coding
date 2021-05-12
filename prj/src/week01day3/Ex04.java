package week01day3;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		int sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		//while (true) {
			System.out.println("수를 입력하세요.");
			int a = sc.nextInt();

//			if (a == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					arr[count] = i;// 약수 arr에 할당
					System.out.print(arr[count] + " ");
					count++;
				}
			}

			System.out.print("\n");

			if (arr[count] == a) { 
				for (int j = 0; j <= count; j++) {
					sum += arr[j];
				}
				
			}
			System.out.println(sum);
//			for (int j = 0; j < count; j++) {
//				sum++;
//			}
//			System.out.println("약수의 갯수 : " + sum);
		//}
	}
}
