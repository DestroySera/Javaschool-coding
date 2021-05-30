package week03.week03day1.객체정렬;

import java.util.Arrays;

public class String정렬 {
	public static void main(String[] args ) {
		String[] str = {"apple", "banana", "pear", "tomato", "strawberry"};
		
		
		Arrays.sort(str);
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
