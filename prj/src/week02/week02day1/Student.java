package week02.week02day1;

class Student {
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	char grade;

	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void calc() {
		tot = kor + eng;
		avg = tot / 2.0;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
	}

	public void disp() {
		System.out.println(name + "  " + kor + "  " + eng + "  " + avg + "  " + grade);
	}
}
