package week03.week03day2;

public class ExceptionEx03 {

	public static void main(String[] args) {
		String quantity_s = "125"; //숫자로 된  문자열 => 진짜 숫자로 변환 , 자바의 Integer.parseInt() 매서드 사용
		int quantity =Integer.parseInt(quantity_s);
		int amount = 50000*quantity;
		System.out.println(amount);
		
		//NumberFormatException 예외 => 선택
		try {
		String str = "1212S"; // "1212S" => 숫자로 예외 NumberFormatException 발생함
		int strValue = Integer.parseInt(str);
		System.out.println(strValue);
		}catch(Exception e) {
			System.out.println("숫자로된 문자열만 가능합니다.");
			e.printStackTrace();
			e.toString();
			e.getMessage();
		}
		System.out.println("정상종료");
	}

}
