package week02.week02day4.object;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;
	//생성자
	public Score() {
		
	}
	
	public Score(String name, int kor, int eng) {
		this.name =name;
		this.kor = kor;
		this.eng = eng;
	}
	
	//매서드
	public void calc() {
		tot =kor+eng;
		avg = tot/2.0;
	}
	
	// 부모의 매서드를 재정의하는것 오버라이드, 반드시 부모의 매서드와 선언부와 일치하면 됨
	@Override
	public String toString() {
		return name + " " + kor + " " + eng + " " + tot + " " + avg;
	}
}
