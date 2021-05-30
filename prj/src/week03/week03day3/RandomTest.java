package week03.week03day3;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();// 객체생성 후 사용
		
		for (int i = 0; i <= 20; i++) {
			System.out.println(r.nextDouble());
		}
		System.out.println("---------------------------------");
		
		for(int i = 0; i <=20; i++) {
			System.out.println(Math.random());
		}

	}

}
