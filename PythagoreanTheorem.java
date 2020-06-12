import javax.swing.JOptionPane;

public class PythagoreanTheorem
{
		public static void main(String args[])
		{
				double c;

				String first =
						JOptionPane.showInputDialog("Enter a value for A");
				int a = Integer.parseInt(first);

				String second =
						JOptionPane.showInputDialog("Enter a value for B");
				int b = Integer.parseInt(second);

				int sum =(a*a)+(b*b);
				c = Math.sqrt(sum);

				String msg = "The value of c is \"" + c +"\"";
				JOptionPane.showMessageDialog(null, msg);
		}
}