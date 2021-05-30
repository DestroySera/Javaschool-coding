package week03.week03day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * ArrayList<Snack> list = new ArrayList<>();
		 * 
		 * Snack 과자객체1 = new Snack("홈런볼", "롯데", "2021-01-12", "2021-12-31", 30, 350);
		 * list.add(과자객체1); Snack 과자객체2 = new Snack("아몬드빼빼로", "롯데", "2021-01-12",
		 * "2021-12-31", 30, 350); list.add(과자객체2); Snack 과자객체3 = new Snack("가나초콜릿",
		 * "롯데", "2021-01-12", "2021-12-31", 30, 350); list.add(과자객체3);
		 * 
		 * Collections.sort(list);
		 * 
		 * 
		 * System.out.println("<<과자정보 출력 >>"); for(int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); }
		 */
		ArrayList<UserInfo> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		UserInfo[] database = new UserInfo[3];
		for (int i = 0; i < database.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("레벨을 입력하세요 : ");
			int level = sc.nextInt();
			System.out.print("스텟을 입력하세요 : ");
			int stat = sc.nextInt();
			System.out.print("데미지를 입력하세요 : ");
			int damage = sc.nextInt();
			database[i] = new UserInfo(name, level, stat, damage);
			list.add(database[i]);
		}

		Collections.sort(list);
		System.out.println("<<유저정보 출력 >>");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
