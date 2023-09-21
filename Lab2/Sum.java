public class Sum {
	public static void main(String[] args) {
	
	int upperLimit = 9;
	int sum = 0;
	for(int i=0; i<= upperLimit; i++ ) {
		sum += i;
	}	
	System.out.printf("The sum form 1 to %d is %d \n", upperLimit, sum);
	
	}
}