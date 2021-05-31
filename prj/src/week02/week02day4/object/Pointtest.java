package week02.week02day4.object;

public class Pointtest {

	public static void main(String[] args) {
		
		Point point1 = new Point(3, 5);
		Point point2 = new Point(3, 5); 
		
		if (point1 == point2) {
			System.out.println("주소가 같다");
		} else {
			System.out.println("주소가 같지 않다.");
		}
		
		if (point1.equals(point2)) {
			System.out.println("두 점의 위치 같다");
		} else {
			System.out.println("두 점의 위치 같지 않다.");
		}
		
		/*Score s = new Score();
		Point point3 = new Point(3, 5);
		if (point3.equals(s)) {
			System.out.println("같다");
		} else { 
			System.out.println("같지않다");
		}
*/
	}

}
