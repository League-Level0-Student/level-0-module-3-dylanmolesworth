package extras;

import javax.swing.JOptionPane;

public class YearsAlive {
	
	public static void main(String[] args) {
		int years = 2004;
		
		String age = JOptionPane.showInputDialog("How old are you?");
		int num = Integer.parseInt(age);
		
		for (int i = 0; i < num; i++) {
			
			System.out.println(years);
			years = years + 1;
		}
	}

}
