import javax.swing.JOptionPane;

 public class KeyboardReaderGUI
{
		public static void main(String[]args)
		{
				String message =
						JOptionPane.showInputDialog("Please enter a message.");
						
				String msg = "Your message was \"" + message + "\"";
				JOptionPane.showMessageDialog(null, msg);
		}
}