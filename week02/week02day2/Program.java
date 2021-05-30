package week02.week02day2;

import java.util.Scanner;

//성적 처리 , class 를 이용해서 성적 처리

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student("홍길동", 100, 90);
		s.calc();
		s.disp();
		
		//여러명
		Student[] arr= new Student[3];
		/*arr[0] = new Student("김학생", 100, 90);
		arr[1] = new Student("이학생", 80, 70);
		arr[2] = new Student("박학생", 70, 60);*/
		
		for (int i = 0; i < arr.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			arr[i] = new Student(name, kor, eng);
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].calc();
		}
		
		//output
		System.out.println("<<성적표>>");
		for(int j = 0; j < arr.length; j ++) {
			arr[j].disp();
		}
		
	}
}
