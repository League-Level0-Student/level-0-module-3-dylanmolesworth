package extras;

import java.awt.KeyboardFocusManager;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
	public static void main(String[] args) {
		
		Robot bot = new Robot();
		
			
		bot.setWindowImage("hearts.jpg");

		 bot.setSpeed(20);
		
		bot.turn(180);
		bot.move(270);
		bot.turn(180);
		
		bot.penDown();
		
		bot.turn(-35);
		bot.move(400);
		bot.setAngle(0);
		
		for (int i = 0; i < 36; i++) {
			bot.move(10);
			bot.turn(5);
			
		}
		
		bot.turn(180);
		
		for (int i = 0; i < 36; i++) {
			bot.move(10);
			bot.turn(5);
			
		}
		
		bot.turn(30);
		bot.move(400);
		bot.setAngle(0);
		
	}

}
