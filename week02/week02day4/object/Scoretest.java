package week02.week02day4.object;

public class Scoretest {

	public static void main(String[] args) {
		Score[] arr = new Score[5];
		
		arr[0] = new Score("전지훈", 99 , 100);
		arr[1] = new Score("홍기연", 100 , 99);
		arr[2] = new Score("김혜겸", 100 , 100);
		arr[3] = new Score("이현호", 99 , 99);
		arr[4] = new Score("임지수", 100 , 98);

		
		for (int i = 0; i < arr.length; i++) {
			arr[i].calc();
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j].toString());
		}
	}

}
