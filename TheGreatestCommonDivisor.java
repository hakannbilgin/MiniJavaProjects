import java.util.Scanner;


public class TheGreatestCommonDivisor {

	
	public static void main(String[] args) {
		
		System.out.println("**** The Greatest Common Divisor (GCD)*****");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the 1st number : ");
		int number1 = scanner.nextInt();
		
		System.out.println("Please enter the 2nd number : ");
		int number2 = scanner.nextInt();
		
		
		int gcd = 1;
		int b = 2;
		
		while(b <= (number1 / 2) && b <= (number2 / 2)) {
			if(number1 % b == 0 && number2 % b == 0) {
				gcd = b;
			}
			b++;
		}
		
		System.out.println("GCD : " + gcd);
		
		
	}
}
