import javax.swing.JOptionPane;

public class Riddleme {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String awnser = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (awnser.equals("snake")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;

		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
			;
			score--;
			
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showConfirmDialog(null, score);
	}
}
