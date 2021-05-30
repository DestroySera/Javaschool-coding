package week03.week03day2.myArrays;

public class Member implements MyComparable{
	
	int point;
	String name;
	
	public Member(String name, int point) {
		this.name = name;
		this.point = point;
	}
	@Override
	public int compare(Object obj) {
		if(obj instanceof Member) {
			Member tmp = (Member)obj;
			return (this.point - tmp.point) >0 ? 1:0;
		}
		return 0;
	}
}
