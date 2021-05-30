package week03.week03day1.객체정렬;

import java.util.Arrays;

public class 성적처리프로그램 {

	public static void main(String[] args) {
		Score[] arr = new Score[5];

		arr[0] = new Score(1, 100, 99);
		arr[1] = new Score(2, 85, 99);
		arr[2] = new Score(3, 99, 91);
		arr[3] = new Score(4, 93, 82);
		arr[4] = new Score(1, 100, 100);
		// 정렬전
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
		// 정렬
		Arrays.sort(arr);
		System.out.println("<<정렬  후>>");
		// 정렬후
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		}

	}

}
