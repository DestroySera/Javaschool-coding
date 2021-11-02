package week02.week02day1;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Game {
	int userId;
	String userName;
	double ability;
	int level = 1;
	double exp;
	boolean Activemode = false;

	String[] monster = { "슬라임", "고블린", "스켈레톤", "서큐버스", "드래곤" };

	// 기본 셋팅 입력
	public Game(int userId, String userName, double ability, double exp) {
		this.userId = userId;
		this.userName = userName;
		this.ability = ability;
		this.exp = exp;
	}

	// 기본 정보
	public void mainInfo() {
		System.out.println(
				"아이디 : " + userId + "이름 : " + userName + "능력치 : " + ability + "레벨 : " + level + "경험치 : " + exp);
	}

	// 레벨
	public void getLevel() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("경험치 10을 얻었습니다");
		exp += 10;
		if ( exp%100 == 0) {
			System.out.println("레벨업 !");
			level += 1;
			ability += 1;
			System.out.println("레벨과 경험치를 보시겠습니까 ? [Y/N]");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("Y")) {
				System.out.println("레벨 : " + level + " 경험치 : " + exp);
				move();
			} else if (answer.equalsIgnoreCase("N")) {
				move();
			}
		} else if (level == 10) {
			System.out.println("만렙을 달성하였습니다");
			System.out.println(
					"아이디 : " + userId + "이름 : " + userName + " 능력치 : " + ability + "레벨 : " + level + " 경험치 : " + exp);
			System.out.println("게임을 종료합니다");
			TimeUnit.SECONDS.sleep(5);
			endgame();
		}
	}

	// 탐험
	public void move() throws InterruptedException {
		int adventuremode = 0;
		Random rd = new Random();
		if (level >= 1) {
			System.out.println("탐험을 시작합니다.");
			while (true) {
				adventuremode = rd.nextInt(2);
				if (adventuremode == 0) {
					TimeUnit.SECONDS.sleep(5);
					getLevel();
					continue;
				} else if (adventuremode == 1) {
					TimeUnit.SECONDS.sleep(5);
					hunt();
					continue;
				}
			}
		}
	}

	// 사냥
	public void hunt() throws InterruptedException {

		Random rd = new Random();
		int mobcount = rd.nextInt(monster.length);
		Scanner sc = new Scanner(System.in);
		int roundcount = rd.nextInt(100);

		System.out.println(monster[mobcount] + "이(가) 나타났다!");

		if (ability >= 1) {
			System.out.print("싸우시겠습니까? [Y/N]");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("Y")) {
				Activemode = true;
				TimeUnit.SECONDS.sleep(5);
				if (roundcount >= 1) {
					System.out.println(monster[mobcount] + "으로 부터 이겼습니다!");
					getLevel();
					Activemode = false;
				} else if (roundcount <= 90) {
					System.out.println(monster[mobcount] + "으로 부터 졌습니다!");
					System.out.println("레벨과 경험치가 초기화 됩니다.");
					Activemode = false;
					level = 1;
					exp = 0;
				}
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println(monster[mobcount] + "으로 부터 도망쳤다!");
			}
		} else {
			System.out.println("당신은 아직 약합니다.");
		}
	}

	public void endgame() {
		System.exit(0);
	}
}
