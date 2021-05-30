package week02.week02day4.instanceo;

public class persontest {
	public static void main(String[] args) {
		person[] arr = new person[3];
		
		arr[0] = new nurse();
		arr[1] = new doctor();
		arr[2] = new nurse();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].walk();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] instanceof doctor) {
			doctor tmp = (doctor)arr[i];
			tmp.healing();
			}
		}
	}
}
