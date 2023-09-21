import java.util.*;


public class EvenOdd{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		if(num % 2 == 1)
			System.out.println("Number is odd");
		else
			System.out.println("Number is even");
	}

}