package week04.week03day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
			try {
				FileInputStream fis = new FileInputStream("download.png");
				FileOutputStream fos = new FileOutputStream("github.jpg");
				int ch;
				while((ch = fis.read())!= -1) {
					fos.write(ch);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
