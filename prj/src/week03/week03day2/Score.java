package week03.week03day2;

//클래스
// 관리해야 할 데ㅐ이터를 저장하기 위한 type을 만든다고 생각하며됨
// 관리해야 할 데이터와 관련된 기능(매서드를) 함께 관리하는 자료형
// 데이터+기능이 함께 캡슐로 묶여서 제공함 (생성자,접근제한자)

// 학생 성적
public class Score implements Comparable<Score >{
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	//생성자
	public Score() {	} // 기본생성자
	
	public Score(String name, int kor, int eng) {
		this.name = name; //
		this.kor = kor;
		this.eng = eng;
	}
	
	//평균 구하기
	public void calcAvg() {
		
		tot = kor + eng;
		
		avg = tot/2.0;
	}
	
	//모든클래스는 Object를 상속받는다.
	@Override
	public String toString() {
		return name + " " + kor + " " + eng + " " + tot + " " + avg;
	}
//	@Override
//	public int compareTo(Object o) {
//		Score tmp = (Score)o;
//		return this.tot - tmp.tot;		//어떤값으로 정렬할지
//	}									//기준만 정해주면 됨
//										//음수 :내가 작은경우
										//양수 : 내가 큰 경우

	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		return this.tot - o	.tot;
	}
}
