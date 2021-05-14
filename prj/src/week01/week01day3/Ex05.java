package week01.week01day3;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		final int ROW = 10;
		int[] count = new int[ROW];
		int[][] arr = new int[ROW][20];
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		// 반복

		for (int i = 0; i < ROW; i++) { // 수

			int su = sc.nextInt();
			// 약수찾기

			for (int j = 1; j <= su; j++) {
				if (su % j == 0) {

					arr[i][count[i]] = j;// 약수 arr에 할당
					// System.out.print(arr[count] + " ");
					count[i]++;
				}
			}
		}

		for (int k = 0; k < arr.length; k++) {

			for (int l = 0; l < count[k]; l++) {
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();

		}

	}
}
