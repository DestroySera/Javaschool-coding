package week03.week03day2;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {

	public static void main (String[] args) {
		// 제네릭 , 제네릭스<>
		
		ArrayList<Score> list = new ArrayList<>();

		System.out.println(args[0]);
		
		Score s = new Score("김학생", 100, 90);
		 
		list.add(s);
		
		Score s2 = new Score("이학생", 80, 90);
		 
		list.add(s2);
		
		Score s3 = new Score("박학생", 99, 99);
		 
		list.add(s3);
		
		for ( int i = 0; i < list.size(); i++) {
			list.get(i).calcAvg();
		}
		
		Collections.sort(list);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
