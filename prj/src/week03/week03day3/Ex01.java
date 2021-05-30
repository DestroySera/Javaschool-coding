package week03.week03day3;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("자바입출력 왕재미");
		System.err.println("에러가 났어요");
		 try {
			int ch = System.in.read();
			System.out.println("입력한 내용" + (char)ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
