import javax.swing.JOptionPane;
public class Sample1
{
	public static void main(String args[])
	{
		int sum = 0;
		String Num1 = JOptionPane.showInputDialog("Please enter your first number.");
		String Num2 = JOptionPane.showInputDialog("Please enter your second number.");

		int firstNumber = Integer.parseInt(Num1);
		int secondNumber = Integer.parseInt(Num2);

		sum = firstNumber + secondNumber;

		String msg = "The sum is" + sum;
		JOptionPane.showMessageDialog(null,msg);
	}
}