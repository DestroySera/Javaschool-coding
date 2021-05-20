package bookstore;

public class LendBookTest {
	public static void main(String[] args) {
		Book book1 = new Book("재미있는 책1", "소설");
		Book book2 = new Book("미치게 재미있는 책2", "만화");
		Book book3 = new Book("무서운책3", "역사");
		Book book4 = new Book("마음이 시리도록 슬픈책4", "시");
		Book book5 = new Book("재미있는 책5", "수필");
		Book book6 = new Book("재미있는 책6", "수필");
		

		Lend lend = new Lend("2021-2-10", "홍길동 ");
		lend.lendBook(book1);
		lend.lendBook(book2);
		lend.lendBook(book3);
		lend.lendBook(book4);
		lend.lendBook(book5);
		lend.lendBook(book6);
		
		
		lend.showLendBook();
		
		Lend lend2 = new Lend("2021-2-10", "공유");
		lend2.lendBook(book1);
		lend2.lendBook(book3);
		lend2.lendBook(book6);
		
		lend2.showLendBook();
	}
}
