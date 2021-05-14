package week01day4;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("");
		for (int y =  arr.length-1;  y>=0 ; y--) {
			System.out.print(arr[y] + " ");
			
		}

	}
}
