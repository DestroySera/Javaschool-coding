package week03.week03day3;

public class test12 {

	public static void main(String[] args) {
		
		Thread t = new Thread( new Runnable() {

			@Override
			public void run() {
				for( int i=1; i<=10 ;i++) {
					System.out.println( "t=" + i);
				}
				
			}});		
		
		
		Thread t1 = new Thread(  new Runnable() {

			@Override
			public void run() {
				for( int i=1; i<=10 ;i++) {
					System.out.println( "t1=" + i);
				}
				
			}
			
		});
		
		t.start();  // 스레드 실행 요청
		t1.start();
		
		
	}

}
