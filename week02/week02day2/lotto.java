package week02.week02day2;

import java.util.Random;

public class lotto {
	public static void main(String[] args){

		int[] ball = new int[45];

		for (int i = 0; i < 45; i++) {
			ball[i] = i + 1;
		}
		
		// 각 배열의 요소를 1~45로 초기화 함
		Random r = new Random();
		int tmp;
		for (int i = 0; i < 100; i++) {
			int changeIndex = r.nextInt(45);
			tmp = ball[0];
			ball[0] = ball[changeIndex];
			ball[changeIndex] = tmp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + "  ");
		}
	}
}