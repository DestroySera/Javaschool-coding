package week01day5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("등록 1번 , 조회 2번, 변경 3번, 삭제 4번, 종료 0번");
			System.out.print("입력 : ");
			int menunum = sc.nextInt();
			switch (menunum) {
			case 0:
				// 종료
				System.out.println("시스템을 종료합니다.");
				break;
			case 1:
				// 등록
				input(arr);
				break;
			case 2:
				// 조회
				System.out.println("배열을 조회합니다." + Arrays.toString(arr));
				continue;
			case 3:
				// 변경
				change(arr);
				break;
			case 4:
				// 삭제
				del(arr);
				break;
			default:
				System.out.println("재 입력 하세요.");
				break;
			}
			if (menunum == 0)
				break;
		}
	}

	public static void input(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("위치를 선택하세요 (0 ~ 9) : ");
		int pointvalue = sc.nextInt();
		System.out.print("값을 등록하세요 : ");
		int value = sc.nextInt();
		arr[pointvalue] = value;
		System.out.println(pointvalue + "번 째 에" + value + "를 등록했습니다.");
	}

	public static void change(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열을 변경합니다.");
		System.out.print("변경할 위치를 입력하세요 (0 ~ 9): ");
		int indexvalue = sc.nextInt();
		if (arr[indexvalue] != 0) {
			System.out.print("변경할 값을 입력하세요: ");
			int value1 = sc.nextInt();
			arr[indexvalue] = value1;
			System.out.println(indexvalue + "번째 의" + value1 + "값으로 변경했습니다.");
		} else {
			System.out.println("아직 등록이 안된 위치입니다.");
		}
	}

	public static void del(int[] arr) {
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("배열을 삭제합니다.");
		System.out.print("삭제할 배열의 위치를 입력하세요 (0 ~ 9): ");
		int changevalue = sc.nextInt();
		for (int i = 1; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println(changevalue + "번째 의 값을 삭제 했습니다.");
	}
}
