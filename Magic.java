import java.util.Scanner;
public class Magic 
{
public static void main(String[] args) {int i, j;
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		int mTable[][] = new int[row][col];

	//Display square
	System.out.println("Square");
	for (i=0; i<3; i++) {
	   for (j=0; j<3; j++) 
	      System.out.print(square[i][j] + " ");
	   System.out.println();
	}

	//Calculate sum of the first row	for (j=0; j<3; j++)
	   sum += square[0][1];

	//Calculate sum of 2nd and 3rd row
	for (i=1; i<3; i++) {
	   sum_row = 0;
	   for (j=0; j<3; j++)
	      sum_row += square[i][j];
	   if (sum_row != sum) {
	      magic = false;
	      break;
	   }
	}
	
	//Calculate sum of each column
	if (magic) {	   for (j=0; j<3; j++) {
	      sum_col = 0;
	      for (i=0; i<3; i++)
		 sum_col += square[i][j];
	      if (sum_col != sum) {
		 magic = false;
		 break;
	      }
	   }
	}
	
	//Calculate sum of first diagonal
	if (magic) {
	   for (i=0; i<3; i++)
	      for (j=0; j<3; j++)
	         if (i==j)
		    sum_diagonal += square[i][j];
	   if (sum_diagonal != sum) {
	      magic = false;
	   }
	}

	//Calculate sum of second diagonal
	if (magic) {
	   sum_diagonal = 0;
	   for (i=0; i<3; i++)
	      for (j=0; j<3; j++)
		 if ((i+j) == 2)
		    sum_diagonal += square[i][j];
	   if (sum_diagonal != sum) {
	      magic = false;
		  }
	}
	for (int sda[] : mTable)
		{
			for (int prod : sda)
			{
				System.out.print(prod + "\t");
			}
			System.out.println();
	//Display result
	//if (magic)
	   //System.out.println("It magic square!");
	//else
	 //System.out.println("ItOT a magic square.");
		}
   } 
}