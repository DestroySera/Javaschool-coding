package week02.week02day3;

public class legtest {
	public static void main(String[] args) {
		legamount[] legarr = new legamount[3];
		
		legarr[0] = new leg4();
		legarr[1] = new leg2();
		legarr[2] = new leg4();
		for (int i = 0; i < legarr.length; i++) {
			legarr[i].run(); 
		}
	}
}
