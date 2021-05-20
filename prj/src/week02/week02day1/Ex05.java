package week02.week02day1;

public class Ex05 {
	public static void main(String[] args) {
		Student s = new Student();
		s.input("홍길동", 100, 90);
		s.calc();
		s.disp();
		
		int kor;
		
		Student[] scores = new Student[3];
		
		scores[0] = new Student();
		scores[1] = new Student();
		scores[2] = new Student();
		
		scores[0].input("김학생", 90, 60);
		scores[1].input("이학생", 60, 70);
		scores[2].input("박학생", 99, 66);
		

		scores[0].calc();
		scores[1].calc();
		scores[2].calc();
		
		
		scores[0].disp();
		scores[1].disp();
		scores[2].disp();
	}
}
