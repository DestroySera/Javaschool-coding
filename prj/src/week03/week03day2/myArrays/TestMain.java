package week03.week03day2.myArrays;

public class TestMain {

	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(30, 50);
		arr[1] = new Student(10, 90);
		arr[2] = new Student(60, 50);
		MyArrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].kor + " " + arr[i].eng);
		}
		Member[] arr2 = new Member[3];
		arr2[0] = new Member("hong", 9000);
		arr2[1] = new Member("kim", 2000);
		arr2[2] = new Member("park", 3000);
		MyArrays.sort(arr2);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i].name + " " + arr2[i].point);
		}
	}

}
