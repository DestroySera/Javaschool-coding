package week01day5;

public class Ex12 {
 public static void main(String[] args) {
	 int[] kors = new int[5];
	 kors[0] = 90;
	 kors[1] = 95;
	 kors[2] = 90;
	 kors[3] = 80;
	 kors[4] = 100;
	 
	 int total = kors[0] + kors[1] + kors[2] + kors[3] + kors[4];
	 
	 for (int i = 0; i < kors.length; i++) {
		 System.out.println(kors[i]);
	 }
	 }
}
