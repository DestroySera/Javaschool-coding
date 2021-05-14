package week01.week01day2;

import java.util.Scanner;

//정수  int배열 5개 만들고, 임의의 값으로 초기화
//합계, 평균(배열요소값의 합계, 평균) 구하기

//정수  int배열 5개 만들고, 콘솔로 값으로 초기화
//합계, 평균(배열요소값의 합계, 평균) 구하기

//배열 선언 int[] kors= new int[5]
public class Ex02 {
	public static void main(String[] args) {

		int[] kors = new int[5];
		kors[0] = 10;
		kors[1] = 20;
		kors[2] = 30;
		kors[3] = 40;
		kors[4] = 50;
		int sum = 0;
		double Average = 0;
		for (int i = 0; i < kors.length; i++) {
			sum = sum + kors[i];
		}
		Average = sum / (double)kors.length;
		System.out.println("합계=" + sum);
		System.out.println("평균=" + Average);

		// 콘솔 값으로 초기화

		Scanner sc = new Scanner(System.in);
		double[] kors2 = new double[6];
		double sum2 = 0;
		double Average2 = 0;
		for (int i = 0; i < kors2.length; i++) {
			kors2[i] = sc.nextDouble();
			sum2 = sum2 + kors2[i];
		}
		Average2 = sum2 / (double)kors2.length;
		System.out.println("합계=" + sum2);
		System.out.println("평균=" + Average2);
	}
}
