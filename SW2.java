import java.util.Scanner;
public class SW2
{
	public static void main(String args []) 
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Welcome! Please enter a one, two or three digit numbers");
		int go = r.nextInt();
		int num;
		     int u = (go / 100) ; 
		     int s = (go %  100 / 10 * 10); 
			 int t = (go % 100);
			 int e = (go % 10);
			 
			 
			 if(go == 0)
			 {
			     System.out.print("Zero");
			 }
			else if(go < 0)
			 {
			     System.out.print("Negative ");
				   go = go * -1;
				   u =go / 100;
				   s = go % 100 / 10 * 10;
				   t = go % 100;
				   e = go % 10;
			 
			 switch (u) 
			 {
				 case 1: System.out.print("One Hundred "); break;
				 case 2: System.out.print("Two Hundred "); break;
				 case 3: System.out.print("Three Hundred "); break;
				 case 4: System.out.print("Four Hundred "); break;
				 case 5: System.out.print("Five Hundred "); break;
				 case 6: System.out.print("Six Hundred "); break;
				 case 7: System.out.print("Seven Hundred "); break;
				 case 8: System.out.print("Eight Hundred "); break;
				 case 9: System.out.print("Nine Hundred "); break;	 
			 }
			 
			 if (t > 10 && t < 20)
			 {
				 switch (t)
				 {
				 case 11: System.out.print("Eleven"); break;
				 case 12: System.out.print("Twelve"); break;
				 case 13: System.out.print("Thirteen"); break;
				 case 14: System.out.print("Fourteen"); break;
				 case 15: System.out.print("Fifthteen"); break;
				 case 16: System.out.print("Sixteen"); break;
				 case 17: System.out.print("Seventeen"); break;
				 case 18: System.out.print("Eighteen"); break;
				 case 19: System.out.print("Nineteen"); break;
				 }
			 }
			 else
			 {
				 switch (s)
				 {
				 case 10: System.out.print("Ten "); break;
				 case 20: System.out.print("Twenty "); break;
				 case 30: System.out.print("Thirty "); break;
				 case 40: System.out.print("Fourty "); break;
				 case 50: System.out.print("Fifty "); break;
				 case 60: System.out.print("Sixty "); break;
				 case 70: System.out.print("Seventy "); break;
				 case 80: System.out.print("Eighty "); break;
				 case 90: System.out.print("Ninety "); break;
				 }
			 }
			 
			 switch (go)
			 {
				 case 1: System.out.print("One"); break; 
				 case 2: System.out.print("Two"); break;
				 case 3: System.out.print("Three"); break;
				 case 4: System.out.print("Four"); break;
				 case 5: System.out.print("Five"); break;
				 case 6: System.out.print("Six"); break;
				 case 7: System.out.print("Seven"); break;
				 case 8: System.out.print("Eight"); break;
				 case 9: System.out.print("Nine"); break;
				 
			 }
			 }
			 else if (go > 0)
			 {
				 switch (u) 
			 {
				 case 1: System.out.print("One Hundred "); break;
				 case 2: System.out.print("Two Hundred "); break;
				 case 3: System.out.print("Three Hundred "); break;
				 case 4: System.out.print("Four Hundred "); break;
				 case 5: System.out.print("Five Hundred "); break;
				 case 6: System.out.print("Six Hundred "); break;
				 case 7: System.out.print("Seven Hundred "); break;
				 case 8: System.out.print("Eight Hundred "); break;
				 case 9: System.out.print("Nine Hundred "); break;	 
			 }
			 
			 if (t > 10 && t < 20)
			 {
				 switch (t)
				 {
				 case 11: System.out.print("Eleven"); break;
				 case 12: System.out.print("Twelve"); break;
				 case 13: System.out.print("Thirteen"); break;
				 case 14: System.out.print("Fourteen"); break;
				 case 15: System.out.print("Fifthteen"); break;
				 case 16: System.out.print("Sixteen"); break;
				 case 17: System.out.print("Seventeen"); break;
				 case 18: System.out.print("Eighteen"); break;
				 case 19: System.out.print("Nineteen"); break;
				 }
			 }
			 else
			 {
				 switch (s)
				 {
				 case 10: System.out.print("Ten "); break;
				 case 20: System.out.print("Twenty "); break;
				 case 30: System.out.print("Thirty "); break;
				 case 40: System.out.print("Fourty "); break;
				 case 50: System.out.print("Fifty "); break;
				 case 60: System.out.print("Sixty "); break;
				 case 70: System.out.print("Seventy "); break;
				 case 80: System.out.print("Eighty "); break;
				 case 90: System.out.print("Ninety "); break;
				 }
			 }
			 
			 switch (go)
			 {
				 case 1: System.out.print("One"); break; 
				 case 2: System.out.print("Two"); break;
				 case 3: System.out.print("Three"); break;
				 case 4: System.out.print("Four"); break;
				 case 5: System.out.print("Five"); break;
				 case 6: System.out.print("Six"); break;
				 case 7: System.out.print("Seven"); break;
				 case 8: System.out.print("Eight"); break;
				 case 9: System.out.print("Nine"); break;
			
			 }
			 }
			 r.close();
	} 
}
