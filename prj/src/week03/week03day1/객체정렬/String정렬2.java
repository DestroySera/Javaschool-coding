package week03.week03day1.객체정렬;

public class String정렬2 {

	public static void main(String[] args) {
		String[] str = {"apple", "banana", "pear", "tomato", "strawberry"};
		//String 정렬
		
		for(int i = 0; i<str.length; i++) {
			for(int j = i+1 ; j <str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) { // 오름차순
					String tmp;
					tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}

}
