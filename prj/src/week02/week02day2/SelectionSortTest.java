package week02.week02day2;

public class SelectionSortTest {
	public static void main(String[] args) {
		int[] arr = { 90, 50, 87, 78, 69 };
		
		
		//selection sort
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		
		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
