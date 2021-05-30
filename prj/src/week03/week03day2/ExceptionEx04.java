package week03.week03day2;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

class Calculator {
	//예외처리를 강제해 놓은 매서드
	public int substract(int su1, int su2) throws MyException {
		if (su1 < su2) {
			throw new MyException("앞의수가 작을 수 없다 예외");
		}
		return su1 - su2;
	}
}

public class ExceptionEx04 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		try {
			int result = c.substract(1, 3);
			System.out.println(result);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" 앞의 수가 큰값이 되도록 하세요");
		}
		
		
		Score[] arr = new Score[5];
		
		
		arr[0].calcAvg();
		
		
		

	}

}
