package week01.week01day5;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
	private final static Logger LOG = Logger.getGlobal();

	public static void main(String[] args) throws SecurityException, IOException {

		Arrlog();

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		while (true) {

			System.out.println("메뉴를 입력하세요.");
			System.out.println("등록 1번 , 조회 2번, 변경 3번, 삭제 4번, 종료 0번");
			System.out.print("입력 : ");
			int menunum = sc.nextInt();

			switch (menunum) {

			case 0:
				// 종료
				System.out.println("시스템을 종료합니다.");
				LOG.info("시스템을 종료했습니다.");
				break;
			case 1:
				// 등록
				input(arr);
				break;
			case 2:
				// 조회
				output(arr);
				LOG.info("배열을 조회합니다." + Arrays.toString(arr));
				break;
			case 3:
				// 변경
				change(arr);
				break;
			case 4:
				// 삭제
				del(arr);
				break;
			default:

				System.out.println("재 입력 하세요.");
				break;

			}

			if (menunum == 0)

				break;

		}
	}

	public static void input(int[] arr) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("위치를 선택하세요 (0 ~ 9) : ");
		int pointvalue = sc.nextInt();

		if (arr[pointvalue] == 0) {

			System.out.print("값을 등록하세요 : ");
			int value = sc.nextInt();

			arr[pointvalue] = value;

			System.out.println(pointvalue + "번 째 에" + value + "값을 등록했습니다.");

			LOG.info(pointvalue + "번 째 에" + value + "값을 등록했습니다.");
			
			System.out.println("배열을 조회합니다." + Arrays.toString(arr));
			System.out.println("");

		} else {

			System.out.println("이미 입력 되어있습니다.");

			LOG.warning("등록하는데 실패했습니다.");
			System.out.println("");

		}
		System.out.println("");
	}

	public static void output(int[] arr) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열을 조회합니다." + Arrays.toString(arr));
		System.out.print("시스템을 종료 하시겠습니까 ? [Yes/No] : ");
		String answer = sc.next();

		if (answer.equalsIgnoreCase("Yes")) {

			System.out.println("시스템을 종료합니다.");
			LOG.info("시스템을 종료했습니다.");
			System.exit(0);

		} else if (answer.equalsIgnoreCase("No")) {

			System.out.println("");

		}
		System.out.println("");
	}

	public static void change(int[] arr) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열을 변경합니다.");
		System.out.print("변경할 위치를 입력하세요 (0 ~ 9): ");
		int indexvalue = sc.nextInt();
		if (arr[indexvalue] != 0) {

			System.out.print("변경할 값을 입력하세요: ");
			int value1 = sc.nextInt();

			arr[indexvalue] = value1;

			System.out.println(indexvalue + "번째 의 값을 " + value1 + " 값으로 변경했습니다.");

			LOG.info(indexvalue + "번째 의 값을 " + value1 + " 값으로 변경했습니다.");
			
			System.out.println("배열을 조회합니다." + Arrays.toString(arr));
			System.out.println("");

		} else {

			System.out.println("아직 등록이 안된 위치입니다.");

			LOG.warning("등록에 실패 했습니다.");
			System.out.println("");
		}
		System.out.println("");
	}

	public static void del(int[] arr) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열을 삭제합니다.");
		System.out.print("삭제할 배열의 위치를 입력하세요 (0 ~ 9): ");
		int changevalue = sc.nextInt();

		if (arr[changevalue] != 0) {

			for (int i = changevalue; i < arr.length - 1; i++) {

				arr[i] = arr[i + 1];

			}

			System.out.println(changevalue + "번째 의 값을 삭제 했습니다.");

			LOG.info(changevalue + "번째 의 값을 삭제 했습니다.");
			
			System.out.println("배열을 조회합니다." + Arrays.toString(arr));
			System.out.println("");

		} else {

			System.out.println("삭제 할 수 없습니다.");
			LOG.warning("삭제를 실패했습니다.");
			System.out.println("");

		}
		System.out.println("");
	}

	public static void Arrlog() throws SecurityException, IOException {
		LOG.setLevel(Level.INFO);
		
		
		Handler handler = new FileHandler("E:\\Java\\서한석\\java\\prj\\log\\Test%u.%g.log", true);
		CustomLogFormatter formatter = new CustomLogFormatter();
		handler.setFormatter(formatter);
		LOG.addHandler(handler);
	}
}
