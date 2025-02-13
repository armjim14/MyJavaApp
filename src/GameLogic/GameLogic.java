package GameLogic;

import java.util.Scanner;
import java.util.Random;

public class GameLogic {

	public static void main(String[] args) {
		// Simple game of Rock, Paper, Scissors
		
		String[] gameOptions = {"R", "P", "S"};
		
		String ComputerChoice = gameOptions[new Random().nextInt(gameOptions.length)];
		
		System.out.print(ComputerChoice);
	}

}
