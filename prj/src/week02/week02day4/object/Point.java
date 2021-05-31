package week02.week02day4.object;

public class Point {
	int x;
	int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return x + " " + y;
	}

	@Override
	public boolean equals(Object obj) {
		// 부모로 부를 수 있다.
		// 부모로 부르면 의미가 축소가 됩니다. 그래서 Object가 가지는
		// 내용만 알 수 있다
		// 그래서 Point객체로 사용하려면 다운캐스팅 해야 함
		if (obj instanceof Point) {
			Point tmp = (Point) obj;
			if (this.x == tmp.x && this.y == tmp.y) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}