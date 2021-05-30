package week03.week03day4;

public class UserInfo implements Comparable<UserInfo>{
	//멤버 변수, 속성, 값, Filed
	String name;
	int level;
	int stat;
	int damage;
	//생성자
	//생성자를 하나라도 만들면 기본생성자를 제공하지않음
	public UserInfo() {}
	public UserInfo(String name, int level, int stat, int damage) {
		this.name = name;
		this.level = level;
		this.stat = stat;
		this.damage = damage;
	}


	@Override
	public String toString() {
		return name + " " + level + " " + stat + " " + damage;
	}
	@Override
	public int compareTo(UserInfo o) {
		// TODO Auto-generated method stub
		return this.level - o.level;
	}
	
	
	
	
	

}
