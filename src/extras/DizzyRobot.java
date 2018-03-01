//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot("vic");
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		robot.setSpeed(10);
		
		while(true) {
		
		String []choice = new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"		};
		 int input = JOptionPane.showOptionDialog(null, "How many times should the robot spin?",
				"Spin",
				JOptionPane.YES_NO_OPTION, 
			      JOptionPane.QUESTION_MESSAGE,  
			      null, choice, null);
		
		
		 
		 if (input == 0) {
			 
			 robot.turn(360);
			 
		 }
		 
		 else if (input == 1) {
			 
			 robot.turn(360*2);
			 
		 }
		 
		 else if (input == 2) {
			 
			 robot.turn(360*3);
			
		 }
 
		 else if (input == 3) {
	
			 robot.turn(360*4);
			 
		 }
 
		 else if (input == 4) {
	 
			 robot.turn(360*5);
	 
		 }
 
		 else if (input == 5) {
	 
			 robot.turn(360*6);
	 
		 }
		 else if (input == 6) {
			 
			 robot.turn(360*7);
			 
		 }
 
		 else if (input == 7) {
	
			 robot.turn(360*8);
			 
		 }
 
		 else if (input == 8) {
	 
			 robot.turn(360*9);
	 
		 }
		 
		 else if (input == 9) {
			 
			 robot.turn(360*10);
	 
		 }
		}

 // 1. Use the dance method to make the robot spin.
		

	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

