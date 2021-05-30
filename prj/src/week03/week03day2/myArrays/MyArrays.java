package week03.week03day2.myArrays;

public class MyArrays {
	public static void sort(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] instanceof MyComparable) {
					MyComparable m = (MyComparable) arr[i];
					if (m.compare(arr[j]) > 0) {
						Object tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
	}
}
