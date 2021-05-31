package week04.week03day1;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		 
		
		char[]  str= {'a','p','p','l','e'};
		MyString s1 = new MyString(str);
		char[] result = s1.subString(1);
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
