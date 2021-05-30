package week03.week03day2;

import java.util.Arrays;
import java.util.Scanner;

//인터페이스
/*
  interface 인터페이명{
  	void 매서드명();  //추상매서드 : 매서드의 구현부가 없는 것을(abstract 키워드 생략 )
  	void 매서드명1(); //
  	}
 */

//1. 학생성적 처리 프로그램에서 학생정렬

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score[] arr = new Score[3];
		
		Scanner sc = new Scanner(System.in);
		
		//입력 받기
		for (int i = 0; i < arr.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			arr[i] = new Score(name, kor, eng);
		}
		//평균 구하기
		for (int i = 0; i < arr.length; i++) {
			arr[i].calcAvg();
		}
		
		Arrays.sort(arr);
		//출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
