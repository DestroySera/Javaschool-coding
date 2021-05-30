package week03.week03day1.계산기;

// 계산기클래스를 만들어서 계산기 클래스의 기능을 이용하여 아래 문제를 해결하려고 함.

public class Program {
	
	public static void main(String[] args) {
		//계산기객체 생성 
		//엘지계산기 calculator = new 엘지계산기();
		//Calculator calculator = new 삼성계산기();
		Calculator calculator = new 한석계산기();
		int su1=10, su2=2;
		
		//두 수 더하기
		int result = calculator.add(su1, su2);
		System.out.println(result);
		//두 수 빼기
		int result1 = calculator.sub(su1, su2);
		System.out.println(result1);
		//두 수 곱하기
		int result2 = calculator.multi(su1, su2);
		System.out.println(result2);
		//두 수 나누기
		double result3 = calculator.divide(su1, su2);
		System.out.println(result3);
	}

}
