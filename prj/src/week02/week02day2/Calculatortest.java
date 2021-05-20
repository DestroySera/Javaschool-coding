package week02.week02day2;

public class Calculatortest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calculator c = new Calculator();
		
		//더하기
		int result1 = c.add(num1, num2);
		System.out.println("합은 :" + result1);
		//뺄셈
		int result2 = c.minus(num1, num2);
		System.out.println("차는 :" + result2);
		//곱하기
		int result3 = c.multi(num1, num2);
		System.out.println("곱은 :" + result3);
		//나눗셈
		//int result4 = c.divide(num1, num2);
		int result4 = Calculator.divide(num1, num2);
		System.out.println("나누기는 :" + result4);
	}
}
