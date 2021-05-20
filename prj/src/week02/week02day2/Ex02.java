package week02.week02day2;

public class Ex02 {
	public static void main(String[] args) {
		//배열의 요소중에서 가장 큰값 출력
		int[] kors = {90,75,80,92,91}; // 배열 선언과 초기화
		
		//출력자료 : 가장큰값 max
		//입력자료 : 없음
		//준비자료 : 배열 준비 kors
		//처리자료 : 반복제어변수 : i
		
		
		/*처리 과정 
		 1. 반복
		  1.1max와 배열의 요소 비교
		  1.2배열의 요소가 크면 새로운 max가 구해짐
		  */
		
		int max = kors[0];
		for (int i = 0; i < kors.length; i++) {
			if ( kors[i] > max) {
				max = kors[i];
			}
		}
		System.out.println("가장 큰값 : " + max);
		System.out.println("------------------------------------------------------");
		//2 배열의 평균값 보다 큰 계수 구하기
		int sum = 0;
		int avg = 0;
		int count =0;
		for (int i = 0; i < kors.length; i++) {
			sum += kors[i];
		}
		avg = sum / kors.length;
		for (int j = 0; j < kors.length; j++) {
			if ( kors[j] > avg ) {
				count++;
			}
		}
		System.out.println("평균 = " + avg + " 갯수 = " + count);
	}
}
