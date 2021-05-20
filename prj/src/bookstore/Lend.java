package bookstore;

import java.util.ArrayList;
import java.util.List;

public class Lend {
	String lend_date; // 대여 일지
	String name; // 대여자 정보
	List<Book> list = new ArrayList<>();
	int cnt = 5;

	public Lend() {

	}

	public Lend(String lend_date, String name) {
		this.lend_date = lend_date;
		this.name = name;
	}

	public void lendBook(Book book) {
		if (book.state == false && list.size() < cnt) {
			book.state = true;
			list.add(book);
			System.out.println(book.title + " 대여정보 : 대여 되었습니다.");
		} else {
			System.out.println(book.title + " 대여정보 : 대여 할 수 없습니다.");
			return;
		}
	}

	public void showLendBook() {
		System.out.println("==============================================\n");
		System.out.println("대여자 : " + name + " 대여일자 : " + lend_date);
		System.out.println("==============================================\n");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
