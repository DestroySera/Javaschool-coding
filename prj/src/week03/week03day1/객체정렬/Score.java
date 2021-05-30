package week03.week03day1.객체정렬;

public class Score implements Comparable{
	int bunho;
	int kor_subject;
	int eng_subject;
	int total;
	double avg;

	// 생성자
	
	public Score() {
		
	}
	
	public Score(int bunho, int kor_subject, int eng_subject) {
		this.bunho = bunho;
		this.kor_subject = kor_subject;
		this.eng_subject = eng_subject;
		this.total = this.kor_subject + this.eng_subject;
		this.avg = total/2.0;
	}
	
	public String toString() {
		return bunho + " " + kor_subject + " " + eng_subject + " " + total + " " + avg;
	}
	@Override
	public int compareTo(Object o) {
		Score tmp = (Score)o;
		return this.total - tmp.total;
	}

}
