package week03.week03day3;

public class test1 {

	public static void main(String[] args) {
		int arr[][][][] = new int[3][3][3][3];
		int num = 2;
		int D = 2;
		for (int h = 0; h < arr.length; h++) {
			for (int i = 0; i < arr.length; i++) { // 면

				num = i + 2; // 초기화
				for (int j = 0; j < arr[i].length; j++) {// 행
					for (int k = 0; k < arr[i][j].length; k++) {// 열
						System.out.print(num + "\t");

						arr[h][i][j][k] = num += D;

					}
					System.out.println();
				}
				System.out.println();
				D++;
			}
		}

	}

}
