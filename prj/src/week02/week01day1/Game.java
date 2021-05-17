package week02.week01day1;

import java.util.Random;
import java.util.Scanner;

class Game {
	int userId;
	String userName;
	double ability;
	int level;
	double exp;
	boolean Activemode = false;
	
	String[] monster = {"슬라임", "고블린", "스켈레톤", "서큐버스", "드래곤"};
	
	
	public void input(int userId, String userName, double ability, int level, double exp) {
		this.userId = userId;
		this.userName = userName;
		this.ability = ability;
		this.level = level;
		this.exp = exp;
	}
	
	public void move() { 
		System.out.println("");
	}
	
	public void hunt() {
		
		Random rd = new Random();
		int mobcount = rd.nextInt(monster.length);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(monster[mobcount] + "이(가) 나타났다!");
		
		if (ability > 1) {
			System.out.print("싸우시겠습니까? [Y/N]");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("Y")) {
				Activemode = true;
				
				
			} else if (answer.equalsIgnoreCase("N")) {
				System.out.println(monster[mobcount] + "로 부터 도망쳤다!");
			}
		} else { 
			System.out.println("당신은 아직 약합니다.");
		}
	}
}
