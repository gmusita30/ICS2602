import java.util.Scanner;

public class LE5prac {
	

	public static void main(String[] args){
		/*
		Create a program that will ask the user
		to enter a number from 1 to 999
		*/

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number from -999 to 999: ");
		int num = s.nextInt();

		int hund = num/100;
		int tens = num%100/10;
		int ones = num%10;
		

		if(num == 0){
			System.out.print("Zero");
		}else if(num < 0){
			System.out.print("Negative ");
				num = num*-1;
				hund = num/100;
				tens = num%100/10;
				ones = num%10;

				switch(hund){
			case 1:
				System.out.print("One Hundred ");
				break;
			case 2:
				System.out.print("Two Hundred ");
				break;
			case 3:
				System.out.print("Three Hundred ");
				break;
			case 4:
				System.out.print("Four Hundred ");
				break;
			case 5:
				System.out.print("Five Hundred ");
				break;
			case 6:
				System.out.print("Six Hundred ");
				break;
			case 7:
				System.out.print("Seven Hundred ");
				break;
			case 8:
				System.out.print("Eight Hundred ");
				break;
			case 9:
				System.out.print("Nine Hundred ");
				break;
		} 
		

		switch(tens){
			case 1:
				if(tens == 1 && ones == 0){
					System.out.println("Ten");
				}else if(tens == 1 && ones == 1){
					System.out.println("Eleven");
				}else if(tens == 1 && ones == 2){
					System.out.println("Twelve");
				}else if(tens == 1 && ones == 3){
					System.out.println("Thirteen");
				}else if(tens == 1 && ones == 4){
					System.out.println("Fourteen");
				}else if(tens == 1 && ones == 5){
					System.out.println("Fifteen");
				}else if(tens == 1 && ones == 6){
					System.out.println("Sixteen");
				}else if(tens == 1 && ones == 7){
					System.out.println("Seventeen");
				}else if(tens == 1 && ones == 8){
					System.out.println("Eighteen");
				}else if(tens == 1 && ones == 9){
					System.out.println("Nineteen");
				}
				break;
			case 2:
				System.out.print("Twenty");
				break;
			case 3:
				System.out.print("Thirty");
				break;
			case 4:
				System.out.print("Forty");
				break;
			case 5:
				System.out.print("Fifty");
				break;
			case 6:
				System.out.print("Sixty");
				break;
			case 7:
				System.out.print("Seventy");
				break;
			case 8:
				System.out.print("Eighty");
				break;
			case 9:
				System.out.print("Ninety");
				break;
		}


		switch(ones){
			case 1:
				System.out.print(" One");
				break;
			case 2:
				System.out.print(" Two");
				break;
			case 3:
				System.out.print(" Three");
				break;
			case 4:
				System.out.print(" Four");
				break;
			case 5:
				System.out.print(" Five");
				break;
			case 6:
				System.out.print(" Six");
				break;
			case 7:
				System.out.print(" Seven");
				break;
			case 8:
				System.out.print(" Eight");
				break;
			case 9:
				System.out.print(" Nine");
				break;
		}
		} else if(num>0){
			switch(hund){
			case 1:
				System.out.print("One Hundred ");
				break;
			case 2:
				System.out.print("Two Hundred ");
				break;
			case 3:
				System.out.print("Three Hundred ");
				break;
			case 4:
				System.out.print("Four Hundred ");
				break;
			case 5:
				System.out.print("Five Hundred ");
				break;
			case 6:
				System.out.print("Six Hundred ");
				break;
			case 7:
				System.out.print("Seven Hundred ");
				break;
			case 8:
				System.out.print("Eight Hundred ");
				break;
			case 9:
				System.out.print("Nine Hundred ");
				break;
		} 
		

		switch(tens){
			case 1:
				if(tens == 1 && ones == 0){
					System.out.println("Ten");
				}else if(tens == 1 && ones == 1){
					System.out.println("Eleven");
				}else if(tens == 1 && ones == 2){
					System.out.println("Twelve");
				}else if(tens == 1 && ones == 3){
					System.out.println("Thirteen");
				}else if(tens == 1 && ones == 4){
					System.out.println("Fourteen");
				}else if(tens == 1 && ones == 5){
					System.out.println("Fifteen");
				}else if(tens == 1 && ones == 6){
					System.out.println("Sixteen");
				}else if(tens == 1 && ones == 7){
					System.out.println("Seventeen");
				}else if(tens == 1 && ones == 8){
					System.out.println("Eighteen");
				}else if(tens == 1 && ones == 9){
					System.out.println("Nineteen");
				}
				break;
			case 2:
				System.out.print("Twenty");
				break;
			case 3:
				System.out.print("Thirty");
				break;
			case 4:
				System.out.print("Forty");
				break;
			case 5:
				System.out.print("Fifty");
				break;
			case 6:
				System.out.print("Sixty");
				break;
			case 7:
				System.out.print("Seventy");
				break;
			case 8:
				System.out.print("Eighty");
				break;
			case 9:
				System.out.print("Ninety");
				break;
		}


		switch(ones){
			case 1:
				System.out.print(" One");
				break;
			case 2:
				System.out.print(" Two");
				break;
			case 3:
				System.out.print(" Three");
				break;
			case 4:
				System.out.print(" Four");
				break;
			case 5:
				System.out.print(" Five");
				break;
			case 6:
				System.out.print(" Six");
				break;
			case 7:
				System.out.print(" Seven");
				break;
			case 8:
				System.out.print(" Eight");
				break;
			case 9:
				System.out.print(" Nine");
				break;
		}
		}

		
		s.close();
	}	
}