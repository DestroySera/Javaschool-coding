package week03.week03day3;

public class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	public Student() {}
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = this.kor + this.eng;
		this.avg = this.tot/2.0;
	}
	@Override
	public String toString() {
		return name + " " + kor + " " + eng + " " + tot + " " + avg;
	}
	@Override
	public int compareTo(Student o) {
		return this.tot - o.tot;
	}
}
