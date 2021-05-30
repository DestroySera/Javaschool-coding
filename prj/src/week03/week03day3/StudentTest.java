package week03.week03day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		// 3명 학생정보

		Student s = new Student("김학생", 100, 90);
		list.add(s);
		Student s1 = new Student("이학생", 99, 88);
		list.add(s1);
		Student s2 = new Student("장학생", 100, 80);
		list.add(s2);

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 지역내부클래스
		class ComparatorImp implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.kor - o2.kor;
			}
		}

		Collections.sort(list, new ComparatorImp());
		System.out.println("<< 새로운 정렬기준으로 정렬 : 국어 성적 오름차순 >>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 지역내부익명클래스
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.kor - o2.kor;
			}
		});
		
		
		
		Collections.sort(list, (o1,o2) -> {return o1.tot - o2.tot ;});
		
		System.out.println("<< 새로운 정렬기준으로 정렬 : 국어 성적 오름차순 >>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
