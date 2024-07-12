import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		String[] response = {"I do", "I don't"};
		int option = JOptionPane.showOptionDialog(null, 
						"Do you want to change to the first class ticket?", null
						, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
						, null, response, 0);
		
		JOptionPane.showMessageDialog(null, "You've choosen: "
				+ (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
		System.exit(0);
	}
}