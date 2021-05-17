package week02.week01day1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		final int MAX = 2;

		int[][] cnt = new int[MAX][8];
		Scanner sc = new Scanner(System.in);
		String name; // 사원 이름
		int money = 0; // 입력 받는 돈
	
		int flag = 0; // 단위를 바꿔줄 때 사용할 변수
		 

		// 사원정보입력
		for( int i = 0; i < MAX; i++){
			System.out.print("사원이름을 입력하세요 : ");
			name = sc.next(); // 사원이름 입력
			System.out.print("출장비를 입력하세요 : ");
			money = sc.nextInt(); // 출장비 입력
			System.out.println("이름 : " + name);
			System.out.println("출장비 : " + money);

			// 화폐매수 구하기(반복)

			
			int value = 50000; // 최대 화폐
			for (int k = 0; k < cnt[i].length; k++) { // 화폐 갯수만큼 반복
				//화폐매수
				cnt[i][k]  = money / value; // 출장비랑 최대 화폐 계산
				System.out.println( "i=" + i + "k=" + k + ":" +   cnt[i][k]);
				//잔액 갱신
				money =  money % value;   	//	money = money - (value2 * value); // 출장비 - ( 계산된 매수 X 최대 화폐 )

				if (flag == 0) {
					value = value / 5;
					flag = 1;
				} else {
					value = value / 2;
					flag = 0;
				}

				// 화폐매수 출력
			}
			
			//System.out.println(Arrays.toString(cnt));
		}
		
		
		
		//화폐 출력
		
		
		
		for( int  i=0 ; i < cnt.length ; i++) {
			
			System.out.println( Arrays.toString( cnt[i]));
		}
	}
}
