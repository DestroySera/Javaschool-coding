package week01day1;

public class Ex03 {

	public static void main(String[] args) {


		//항     n
		//항 누적  sum2
		int n=0;
		int sum2 = 0;
		
		for(int j = 1; j <= 3; j++) {
			n=0;
			for(int a = 1;  a<=j; a++) {
				n += a;
			}
			System.out.println("n= "  + n);
			sum2 +=n;
		}
		
		System.out.println(sum2);
	}

 


 
}
