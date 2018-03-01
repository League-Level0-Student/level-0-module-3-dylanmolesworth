//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
		Robot bob = new Robot();
		bob.miniaturize();
		bob.setSpeed(200);
		bob.penDown();
		
		
		//3. Ask the user what color they would like the robot to draw
		while (true) {
			
		
		String []choice = new String[] {
				"Red", "Orange", "Yellow", "Green", "Blue", "Purple",
		};
		 int input = JOptionPane.showOptionDialog(null, "What color should the robot draw?",
				"Color?",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		
		//4. Use an if/else statement to set the pen color that the user requested
		 
		 if (input == 0) {
			 
			 bob.setPenColor(255, 29, 0);
			 
		 }
		 
		 else if (input == 1) {
			 
			 bob.setPenColor(255, 153, 0);
			 
		 }
		 
		 else if (input == 2) {
			 
			 bob.setPenColor(255, 238, 0);
			 
		 }
 
		 else if (input == 3) {
	 
			 bob.setPenColor(46, 142, 35);
	 
		 }
 
		 else if (input == 4) {
	 
			 bob.setPenColor(0, 3, 211);
	 
		 }
 
		 else if (input == 5) {
	 
			 bob.setPenColor(140, 0, 255);
	 
		 }

        //5. If the user doesn’t enter anything, choose a random color
		 
		 else {
			 
			 int randomChoice = new Random().nextInt(5);
			 
			 if (randomChoice == 0) {
				 bob.setPenColor(255, 29, 0);
				}  if (randomChoice == 1) {
					 bob.setPenColor(255, 153, 0);
				}  if (randomChoice == 2) {
					bob.setPenColor(255, 238, 0);
				}  if (randomChoice == 3) {
					 bob.setPenColor(46, 142, 35);
				}  if (randomChoice == 4) {
					 bob.setPenColor(0, 3, 211);
				}  if (randomChoice == 5) {
					 bob.setPenColor(140, 0, 255);
				} 
			 
		 }

        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		 bob.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
		for (int i = 0; i < 360; i+=10) {
			
			bob.move(10);
			bob.turn(10);
			
		}
		
		bob.move(100);
		bob.turn(90);
		
		}


	}
}
