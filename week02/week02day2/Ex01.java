package week02.week02day2;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {

		// 난수 만들기 ( 자바 에서 제공하는 Math, Random )
		// 클래스 매서드 사용하는 방법, static붙은 매서드 사용법
		// 클래스명, 매서드 이름 사용
		double result = Math.random();
		System.out.println(result);
		System.out.println("-----------------------------------");

		// Random
		// Static 아닌 매서드 사용법은 객체를 먼저 생성해서 사용해야 합니다.
		Random r = new Random(); // Random 클래스를 사용해서 객체생성 코드
		int result2 = r.nextInt();
		System.out.println(result2);
		System.out.println("-----------------------------------");

		// 1. 각 각 5번식 난수를 출력해보세요
		for (int i = 1; i <= 5; i++) {
			double result3 = r.nextInt();
			System.out.println(result3);
		}
		System.out.println("-----------------------------------");
		// 2. 각 각 을 배열에 담아놓고, 출력을 따로 해보세요. ( 난수만들기 출력을 분리 )

		// Random 클래스 의 nextInt()매서드를 이용해서 난수 (정수형) 만들기
		int[] result3 = new int[5];
		for (int i = 0; i < result3.length; i++) {
			result3[i] = r.nextInt(100);
		}

		// Math.random() 이용한 난수 5개 만들기
		double[] result4 = new double[5];

		for (int i = 0; i < result4.length; i++) {
			result4[i] = r.nextDouble();
		}

		// 정수형 난수
		for (int i = 0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
		System.out.println("-----------------------------------");
		// 실수형 난수
		for (int i = 0; i < result3.length; i++) {
			System.out.println(result4[i]);
		}
		System.out.println("-----------------------------------");
	}
}
