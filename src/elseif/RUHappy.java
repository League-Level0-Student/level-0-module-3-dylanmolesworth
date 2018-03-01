package elseif;

import javax.swing.JOptionPane;

public class RUHappy {
	
public static void main(String[] args) {
	
	String []choice = new String[] {
			"Yes", "No"
	};
	 int input = JOptionPane.showOptionDialog(null, "Are you happy",
			"Happy?",
			JOptionPane.YES_NO_OPTION, 
		      JOptionPane.QUESTION_MESSAGE,  
		      null, choice, null);
	 if (input == 0) {
		 
		 JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
		 
	 }
	 
	 else if (input == 1) {
		
			 int input2 = JOptionPane.showOptionDialog(null, "Do you want to be happy?",
					"Change?",
					JOptionPane.YES_NO_OPTION, 
				      JOptionPane.QUESTION_MESSAGE,  
				      null, choice, null);
			 
			 if (input2 == 0) {
				 
				 JOptionPane.showMessageDialog(null, "Change Something!");
				 
			 }
			 
			 else if (input2 == 1) {
				 
				 JOptionPane.showMessageDialog(null, "Keep doing what you are doing!");
				 
			 }
	 }
}


}
