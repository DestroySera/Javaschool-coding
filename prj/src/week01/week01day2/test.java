package week01.week01day2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String name = "";
		
		int subma = 0;
		int suben = 0;
		int subko = 0;
		
		double sum = 0;
		double sumko = 0;
		double sumen = 0;
		double summa = 0;
		
		double Average = 0;
		double Averageko = 0;
		double Averageen = 0;
		double Averagema = 0;
		final int MAX = 3;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < MAX; i++) {
			System.out.println("이름을 입력하세요");
			name = sc.next();
			System.out.println("수학점수를 입력하세요");
			subma = sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			suben = sc.nextInt();
			System.out.println("국어점수를 입력하세요");
			subko = sc.nextInt();
			//개인총점, 평균 구하기
			sum = subko + suben + subma;
			Average = (double) sum / 3;
			
			System.out.print("  이름 :" + name);
			System.out.print("  개인평균:" + Average);
			if (Average >= 90) {
				System.out.println("EXCELLENT!");
			} else if (Average <= 60) {
				System.out.println("FAIL");
			} 
			
			//과목별 총점 구하기
			summa += subma;
			sumko += subko;
			sumen += suben;
		}
		// 과목별 평균 구하기
		Averageko = (double) sumko / MAX;
		Averageen = (double) sumen / MAX;
		Averagema = (double) summa / MAX;
		System.out.printf("국어 평균 : %.2f , 영어 평균 : %.2f , 수학 평균 : %.2f", Averageko, Averageen, Averagema);
	}

}
