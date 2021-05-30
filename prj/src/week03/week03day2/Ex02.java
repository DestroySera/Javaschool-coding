package week03.week03day2;

import java.util.ArrayList;

// Collections: ArrayList
// 바구니 : 저장하는 바구니
// 배열과 받은 구조를 가짐
// 순서가 있고, 중복을 허용

public class Ex02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		Score s = new Score("이학생", 90, 100);
		list.add(s);
		
		Score s2 = new Score("김학생", 100, 99);
		list.add(s2);
		
		Score s3 = new Score("박학생", 100, 80);
		list.add(s3);
		
		
		for(int i = 0; i < list.size(); i++ ) {
			//꺼내서 사용할때는 다시 형변환 해서 사용해야 함
			((Score)list.get(i)).calcAvg();
		}
		
		for(int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
	}

}
