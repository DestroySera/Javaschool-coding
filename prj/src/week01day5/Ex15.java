package week01day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input.txt"));
		
		String[] names = new String[5];
		
		int i = 0;
		while(sc.hasNext()) {
			names[i] = sc.nextLine();
			i++;
		}
		
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
	}
}
