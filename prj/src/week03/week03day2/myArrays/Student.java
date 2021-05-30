package week03.week03day2.myArrays;

public class Student implements MyComparable<Student>{

	int kor;
	int eng;
	
	
	public Student(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}


	


	@Override
	public int compare(Student obj) {
		// TODO Auto-generated method stub
		return (this.kor - obj.kor) > 0 ? 1:0;
	}
}
