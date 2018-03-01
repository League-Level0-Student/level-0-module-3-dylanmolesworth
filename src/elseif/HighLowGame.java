//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99)+ 1;
		int guess = 0;
		// 2. Print out the random variable above
		
		
		
		// 11. Repeat steps 1 to 10 ten times
		
		for (int i = 0; i < 10; i++) {
			
		
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		
		String input =  JOptionPane.showInputDialog(null, "What is your guess?");
		guess = guess + 1;
		

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		
		int num = Integer.parseInt(input);
			
			// 5. if the guess is correct
		if (num == random) {
			
			JOptionPane.showMessageDialog(null, "You Won!");
			JOptionPane.showMessageDialog(null, "It took you "+ guess + "!");
			System.exit(0);
		}
		else if (num < random) {
			
			JOptionPane.showMessageDialog(null, "The guess is too low!");
			
		}
		else if (num > random) {
			
			JOptionPane.showMessageDialog(null, "The guess is too high!");
			
			
		}
		}
		JOptionPane.showMessageDialog(null, "You lost");
		
				// 6. Win
				// 11. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 12. Tell them they lose
		
	}

}


