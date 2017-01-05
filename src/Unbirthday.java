import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String today = "1/4";
		String anwser = JOptionPane.showInputDialog("When is your Birthday? Put the date");

		if (today.equals(anwser)) {
			JOptionPane.showMessageDialog(null, "happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "happy UNbirthday!");
		}
	}
}
