package jose.sunoj;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		var name = JOptionPane.showInputDialog("Enter a Name.");
		JOptionPane.showMessageDialog(null, "Hello" + name);
		
		var age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
		JOptionPane.showMessageDialog(null, "you are " + age + " years old.");
		
		var height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));
		JOptionPane.showMessageDialog(null, "you are " + height + " cm tall.");

	}

}
