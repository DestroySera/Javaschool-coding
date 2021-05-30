package week03.week03day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex06file {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Score> list = new ArrayList<>();

		Scanner sc = new Scanner(new File("list.txt"));

		while (sc.hasNext()) {
			String line = sc.nextLine();

			Scanner sc2 = new Scanner(line).useDelimiter(",");

			String name = sc2.next();
			int kor = sc2.nextInt();
			int eng = sc2.nextInt();

			Score s = new Score(name, kor, eng);

			list.add(s);

		}

		for (int i = 0; i < list.size(); i++) {
			list.get(i).calcAvg();
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
