
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 9th";
		String dadsBirthday = "August 16th";
		String myBirthday = "August 16th";
		String hankBirthday = "October 5th";
		

		// 2. Find out which birthday the user wants and and store their response in a variable
		
		String input = JOptionPane.showInputDialog("Who's Birthday would you like to know? Mom, Dad, Dylan, Hank(dog)");
	
		// 3. Print out what the user typed
		
		JOptionPane.showInputDialog("You chose " + input + ".");
		
		if (input.equals("mom")) {
			
			JOptionPane.showInputDialog("My moms birthday is " + momsBirthday + ".");
			
		}
		
		else if (input.equals("dad")) {
			
			JOptionPane.showInputDialog("My dads birthday is " + dadsBirthday + ".");
			
		}

		else if (input.equals("dylan")) {
	
			JOptionPane.showInputDialog("Dylan's birthday is " + myBirthday + ".");
	
		}
		
		else if (input.equals("hank")) {
			
			JOptionPane.showInputDialog("Hanks's birthday is " + hankBirthday + ".");
	
		}
		
		else {
			JOptionPane.showInputDialog("Sorry, i don't remember that person's birthday!");
			
		}
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
