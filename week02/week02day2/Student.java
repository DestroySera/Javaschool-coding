package week02.week02day2;

//한 학생의 성적을 담을 그릇으로 사용할 자료형을 만들기(사용자정의 자료형)

public class Student {
	// 멤버 변수
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	char grade;
	
	//값을 초기화 ( 생성자 이용 ) 
	
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	//학점 구하기
	
	public void calc() { 
		tot = kor+eng;
		avg = tot/2.0;
		
		if(avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg>=70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}
	
	//값을 출력
	
	public void disp() {
		System.out.println(name + " " + kor + " " + eng + " " + tot +" " + avg + " " + grade);
	}
}
