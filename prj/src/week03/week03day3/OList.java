package week03.week03day3;

public class OList {
	private Object[] nums;
	private int current;
	
	public OList() {
		nums = new Object[3];
		current=0;
	}
	
	public int size() {
		return current;
	}
	
	public void add(Object obj) {
		nums[current] = obj;
		current++;
	}
	
	public void clear() {
		current = 0;
	}
	
	public Object get(int index) {
		return nums[index];
	}
}
