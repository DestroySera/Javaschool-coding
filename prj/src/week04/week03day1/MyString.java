package week04.week03day1;

public class MyString {
	
	 char[]  values;
	 
	 public MyString() {
		 
	 }
	 public MyString( char[]  values) {
		 
		  this.values = new char[values.length];
		  
		  
		  //깊은 복사
		  for(  int i= 0; i < values.length ; i++) {
			  this.values[i] = values[i];
		  }		  
		  
		  
	 }
	 
 // 매서드
	 
	   public char charAt( int index) {
		   
		   return values[index];
	   } 	 
	 
	  	 
	  public char[] subString( int startIndex){
		  
		  int size  = this.values.length - startIndex;
		  char[] tmp = new char[size];
		  
		  for(int i= 0 ; i< tmp.length; i++) {
			  tmp[ i] = values[i+startIndex];
		  }
		  return tmp;
		  
	  }
	 
	 
	  public void disp(){ 
		  
	  }

	 
}
	 
	