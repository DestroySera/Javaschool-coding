package week02.week02day3.pol;

public class membertest {

	public static void main(String[] args) {
		member kim = new vipmember();
		kim.getPoint();
		
		member jun = new goldmember();
		
		jun.getPoint();
		
		member[] members = new member[2];
		members[0] = new vipmember();
		members[1] = new goldmember();
		for(int i = 0; i<members.length; i++) {
			members[i].getPoint();
		}

	}

}
