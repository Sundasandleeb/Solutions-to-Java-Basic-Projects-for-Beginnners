
public class main {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(2255));
		
		

	}
	
	public static int sumFirstAndLastDigit(int number) {
		int lastdigit=0;
		int sum =0;
		
		
	
	if(number < 0) {
		return -1;
		
	}
	
		lastdigit= number % 10 ; // to store least significant digit
		while (number > 9) {
		number /= 10;      //to discard least significant digit
	
	
	
	 
	    sum=lastdigit + number;

}
	   return sum;
}
}
