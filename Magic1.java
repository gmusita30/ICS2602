import java.util.Scanner;
public class Magic1
{
	public static void main(String args[])
	{
		/*
		Scanner console = new Scanner(System.in);
	    System.out.print("Give an odd number: ");
	    int n = console.nextInt();
	    int[][] magicSquare = new int[n][n];

	    int number = 1;
	    int row = 0;
        int column = n / 2;
		*/
		Scanner console = new Scanner(System.in);
	    System.out.print("Give an odd number: ");
	    int n = console.nextInt();
		int input = Integer.parseInt(args[0]); 
		int sqTable[][] = new int[input][input];
		
		
		int input = 1;
	    int row = 0;
        int column = n / 2;
		System.out.println();
		
		while (number <= n * n) 
		{
			{
				sqTable[row][column] = number;
				number++;
				row -= 1;
				column += 1;
				if (row == -1) {
				row = n - 1;
			}
			if (column == n) {
				column = 0;
			}
			if (row == 0 && column == n - 1) {
				column = n - 1;
				row += 1;
			} 
			else if (sqTable[row][column] != 0) {
				row += 1;
			}
		}

		for (int input = 0; input < sqTable.length; i++) 
		{
			for (int column = 0; j < sqTable.length; column++) {
				System.out.print(sqTable[input][input] + " ");
        
        
		}
	}
}