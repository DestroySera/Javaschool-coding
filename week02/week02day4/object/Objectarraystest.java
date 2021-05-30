package week02.week02day4.object;

public class Objectarraystest {
	public static void main(String[] args) {
		// 모든클래스를 관리할 수 있는 자료형입니다. 
		// 무조건 모든클래스는 Object 클래스를 자동으로 상속받습니다.
		Object[] arr = new Object[3];
		
		arr[0]=new member();
		arr[1]=new VIPmember();
		arr[2]=new call();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			//System.out.println(arr[i].toString());
		}
		
	}
}
