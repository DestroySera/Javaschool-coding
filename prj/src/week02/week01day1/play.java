package week02.week02day1;

import java.util.Scanner;

public class play {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("기본 정보를 입력해주세요.");
		System.out.print("ID 를 입력하세요 : ");
		int userId = sc.nextInt();
		System.out.println("");
		System.out.print("이름을 입력하세요 : ");
		String userName = sc.next();
		System.out.println("");
		System.out.print("능력치를 입력하세요 : ");
		double ability = sc.nextDouble();
		System.out.println("");
		System.out.print("경험치를 입력하세요 : ");
		
		double exp = sc.nextDouble();

		Game g = new Game(userId, userName, ability, exp);

		System.out.println("");
		System.out.println("기본 정보를 입력했습니다.");
		System.out.println("모험을 떠나시겠습니까 ? [Y/N]");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("Y")) {
			g.move();
		} else if(answer.equalsIgnoreCase("N")) {
			g.endgame();
		}

	}

}
