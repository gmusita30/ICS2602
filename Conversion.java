import java.util.Scanner;
public class Conversion
{
	public static void main(String Args [])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 999");
		int n = s.nextInt();
		
				
			int huns = n / 100;
			int fak = (go %  100 / 10 * 10); 
			int tens = (go % 100);
			int ones = n % 10;
			
			if(n == 0)
			 {
			     System.out.print("Zero");
			 }
			else if(n < 0)
			 {
			     System.out.print("Negative ");
				   n = n * -1;
				   huns = n / 100;
				   fak = (go %  100 / 10 * 10); 
				   tens = (go % 100);
				   ones = n % 10;
				   
				switch(huns)
				{
					case 1: System.out.print("One Hundred");
						break;
					case 2: System.out.print("Two Hundred");
						break;
					case 3: System.out.print("Three Hundred");
						break;
					case 4: System.out.print("Four Hundred");
						break;
					case 5: System.out.print("Five Hundred");
						break;
					case 6: System.out.print("Six Hundred");
						break;
					case 7: System.out.print("Seven Hundred");
						break;
					case 8: System.out.print("Eight Hundred");
						break;
					case 9: System.out.print("Nine Hundred");
						break;

				}
				
			 if (ones > 10 && ones < 20)
			 {
				switch(tens)
				{
					case 11: System.out.print("Eleven");
						break;
					case 12: System.out.print("Twelve");
						break;
					case 13: System.out.print("Thirteen");
						break;
					case 14: System.out.print("Fourteen");
						break;
					case 15: System.out.print("Fifteen");
						break;
					case 16: System.out.print("Sixteen");
						break;
					case 17: System.out.print("Seventeen");
						break;
					case 18: System.out.print("Eighteen");
						break;
					case 19: System.out.print("Nineteen");
						break;
				}
			 }
			else 
			{	 
				switch(fak)
				{
					case 10: System.out.print("Ten");
						break;
					case 20: System.out.print("Twenty");
						break;
					case 30: System.out.print("Thirty");
						break;
					case 40: System.out.print("Fourty");
						break;
					case 50: System.out.print("Fifty");
						break;
					case 60: System.out.print("Sixty");
						break;
					case 70: System.out.print("Seventy");
						break;
					case 80: System.out.print("Eighty");
						break;
					case 90: System.out.print("Ninety");
						break;
				}
			}
				switch(n)
				{
					case 1: System.out.print("One");
						break;
					case 2: System.out.print("Two");
						break;
					case 3: System.out.print("Three");
						break;
					case 4: System.out.print("Four");
						break;
					case 5: System.out.print("Five");
						break;
					case 6: System.out.print("Six");
						break;
					case 7: System.out.print("Seven");
						break;
					case 8: System.out.print("Eight");
						break;
					case 9: System.out.print("Nine");
						break;
				}
			 }
			else if (n > 0)
			{
				switch(huns)
				{
					case 1: System.out.print("One Hundred");
						break;
					case 2: System.out.print("Two Hundred");
						break;
					case 3: System.out.print("Three Hundred");
						break;
					case 4: System.out.print("Four Hundred");
						break;
					case 5: System.out.print("Five Hundred");
						break;
					case 6: System.out.print("Six Hundred");
						break;
					case 7: System.out.print("Seven Hundred");
						break;
					case 8: System.out.print("Eight Hundred");
						break;
					case 9: System.out.print("Nine Hundred");
						break;
				}
			}
		 if (ones > 10 && ones < 20)
			 {
				 switch(tens)
				{
					case 11: System.out.print("Eleven");
						break;
					case 12: System.out.print("Twelve");
						break;
					case 13: System.out.print("Thirteen");
						break;
					case 14: System.out.print("Fourteen");
						break;
					case 15: System.out.print("Fifteen");
						break;
					case 16: System.out.print("Sixteen");
						break;
					case 17: System.out.print("Seventeen");
						break;
					case 18: System.out.print("Eighteen");
						break;
					case 19: System.out.print("Nineteen");
						break;
				}
			 }
		else 
			{	 
				switch(fak)
				switch(fak)
				switch(fak)
				{
					case 10: System.out.print("Ten");
						break;
					case 20: System.out.print("Twenty");
						break;
					case 30: System.out.print("Thirty");
						break;
					case 40: System.out.print("Fourty");
						break;
					case 50: System.out.print("Fifty");
						break;
					case 60: System.out.print("Sixty");
						break;
					case 70: System.out.print("Seventy");
						break;
					case 80: System.out.print("Eighty");
						break;
					case 90: System.out.print("Ninety");
						break;
				}
			}
			switch(n)
				{
					case 1: System.out.print("One");
						break;
					case 2: System.out.print("Two");
						break;
					case 3: System.out.print("Three");
						break;
					case 4: System.out.print("Four");
						break;
					case 5: System.out.print("Five");
						break;
					case 6: System.out.print("Six");
						break;
					case 7: System.out.print("Seven");
						break;
					case 8: System.out.print("Eight");
						break;
					case 9: System.out.print("Nine");
						break;
				}
			
		s.close();
	}			
}



