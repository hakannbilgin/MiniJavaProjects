package main;
import java.util.Scanner;

public class PrimeNumbersDriver {

	
	public static void main(String[] args) {

		final int displayCountPerLine = 30;
		Scanner scanner = new Scanner(System.in);
		System.out.println("***** PRIME NUMBER DISPLAYER *****");
		System.out.println("Please enter the count of PN(s) : ");
		int primeNumberCount = scanner.nextInt();
		int count = 0;
		int testNumber = 2;

		while (primeNumberCount > count) {

			isPrime(testNumber);
			
			boolean isPrime = isPrime(testNumber);
			
			if (isPrime) {
				displayNumberInConsole(displayCountPerLine, count++, testNumber);
			}
			
			testNumber++;
		}
	}
	
	
	public static void displayNumberInConsole(int displayCountPerLine, int currentDisplayCount, int number) {
		
		if (currentDisplayCount % displayCountPerLine == 0) {
			System.out.println(number);
		} else {
			System.out.print(number + " ");
		}
	}
	
	public static boolean isPrime(int testNumber) {
		for (int d = 2; (d <= testNumber / 2); d++) {
			if (testNumber % d == 0)
				return false;
		}
		
		return true;
	}
}
