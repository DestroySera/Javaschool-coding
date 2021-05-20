package bookstore;

public class Book {
	String title; // 책 이름
	String category; // 책 종류
	int price;
	boolean state; // 책 빌릴수 있는지 없는지 여부 확인
	
	public Book(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public String toString() {
		return title + "  " + category;
	}
}
