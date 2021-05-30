package week03.week03day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		final int MAX = 3;
		ArrayList<Score> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < MAX; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			Score s =new Score(name, kor, eng);
			list.add(s);
		}
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).calcAvg();
		}
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
