package week02.week02day2;

//계산기
// 더하기, 빼기, 곱하기, 나누기 
//1. static 있는 경우와 없는 경우 매서드 사용법
//2. static 키워드는 언제 붙일수 있나요 ? 매서드가 멤버변수를 사용하지 않을 때
	

public class Calculator {

	public int add(int su1, int su2) {
		return su1+su2;
	}
	
	public int minus(int su1, int su2) {
		return su1-su2;
	}
	
	public int multi(int su1, int su2) {
		return su1 * su2;
	}
	
	public static int divide(int su1, int su2) {
		return su1/su2;
	}
	//static 을 붙힐수 있는 메서드는 매서드 안에서 멤버변수를 사용하지 않을 때

}

//static 키워드 사용할 수 있는 경우
//매서드안에서 멤버변수를 사용하지 않을 때
//static 키워드가 붙으면 프로그램실행시 바로 사용 가능한 상태가 됨 , 즉
//프로그램실행전에 static이  먼저 메모리에 올라옴
//static아닌 매서드들은 메모리에 올라가는 직업인 new하는 과정을 해야 사용 할 수 있음
