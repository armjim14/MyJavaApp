package GameLogic;

import java.util.Random;

public class GameLogic {

	static String[] gameOptions = {"R", "P", "S"};
	
	public static void main(String[] args) {
		// Simple game of Rock, Paper, Scissors
		
		Boolean run = true;
		int startGame = RunGame();
		
		while(run) {
			if ( startGame == 1 ) {
				run = false;
			}
		}
		
		Res.closeScanner();
	}

	public static int RunGame() {
		String ComputerChoice = gameOptions[new Random().nextInt(gameOptions.length)];
		String UserChoice = Res.getInput("Please choose from (P, R, S)");
		
		if ( UserChoice.length() == 0 ) {
			System.out.println("\n\n\n");
			Res.getInput("Input not accepted, please choose from (P, R, S)");
		} else {			
			System.out.println("Computer Chose: " + ComputerChoice);
			System.out.println("You Chose:" + UserChoice);
		}
		
		return 1;
	}
	
}
