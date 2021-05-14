package week01.week01day2;

public class ArraryTest {

	public static void main(String[] args) {
		int [] arr = {10, 20,30,40,50};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//변수 여러개 사용, 배열 사용 이유 ?
		
		int a=10; //연속적이라는 것을 약속 받을 수 없다.
		int b=20;
		int c=30;
		int d=40;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//합계
		int sum = a+b+c+d;
		System.out.println("합계="+sum);
		
		int [] arr2 = new int [4]; //연속적이라는 것을 약속 => 반복구조
		arr2[0]=10;
		arr2[1]=20;
		arr2[2]=30;
		arr2[3]=40;
		
		int sum2 =0;
		for(int i =0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}
		System.out.println(sum2);
		
		for(int i =0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	
}
