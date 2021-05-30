package week03.week03day3;

public class OListTest {

	public static void main(String[] args) {
		OList list = new OList();
		list.add(3);
		list.add(5);
		list.add(4);
		//list.add(5);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
