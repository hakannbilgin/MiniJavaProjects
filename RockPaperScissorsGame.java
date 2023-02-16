import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
		System.out.println("**** WELCOME TO THE ROCK-PAPER-SCISSORS GAME ****");
		Scanner scanner = new Scanner(System.in);
		int computerScore = 0;
		int userScore = 0;
		
		
		
		do {
			int computer = (int)(Math.random() * 3);
			int user;
			
			do {
				System.out.println("Select:\nScissors (0)\nRock (1)\nPaper (2)\n");
				user = scanner.nextInt();
				
			}while(user < 0 || user > 2);
			
			
			System.out.print("Computer is : ");
			switch (computer) {
			case 0:
				System.out.println("Scissors");
				break;
			case 1:
				System.out.println("Rock");
				break;
			case 2:
				System.out.println("Paper");
				break;
			}
			
			System.out.print("You : ");
			switch (user) {
			case 0:
				System.out.println("Scissors");
				break;
			case 1:
				System.out.println("Rock");
				break;
			case 2:
				System.out.println("Paper");
				break;
			}
			
			if(computer == user) {
				System.out.println("It is a draw !!");
			}else {
				
				boolean win = (computer == 0 && user == 1) ||
								(computer == 1 && user == 2) || 
									(computer == 2 && user == 1);
				
				if(win) {
					System.out.println("You won.");
					userScore++;
				}else {
					System.out.println("Computer won.");
					computerScore++;
				}
				
			}
			System.out.println("\n:: Score Table :\n-------------\nComputer : "+ computerScore + "\nUser : " + userScore + "\n--------------\n");
			
		}while(Math.abs(computerScore - userScore) <= 2);
		
		
	}
}
