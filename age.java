import java.io.*;
import java.util.Scanner;

public class age{
    public static void main(String[] args) throws IOException{
            // TODO code application logic here
            int age = 0;
            char ans;
           
            //BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            Scanner x = new Scanner(System.in);

           do{  //program will run as long as the input is an integer and ans is yes
                try{ //check if input is an integer or it will handle the exception. will also prompt to try again
                    do{  //program will run as long as the input is an integer and ans is yes                                     
                        System.out.print("\nInput age: ");
                           age = Integer.parseInt(x.next());

                        if(age > 0 && age < 18){
                            System.out.println("Minor");
                        }else if(age >= 18 && age < 60){
                            System.out.println("Adult");
                        }else if(age >= 60){
                            System.out.println("Senior");
                        }else{
                            System.out.println("Invalid Input");
                        }
                        
                        System.out.print("Would you like to try again [Y/N]? "); //ask to try again after program run
                            ans = x.next().charAt(0);
                    }while(ans == 'Y' || ans == 'y');
                        System.out.println("Program will end here..."); //program ends when answer is no
                        System.exit(0); 
               
                }catch(NumberFormatException e){
                    System.out.println("Invalid Input! Enter an Integer."); //prompts when input is not an integer
                } //end of exception handling

                System.out.print("Would you like to try again [Y/N]? "); //ask to try again when invalid input
                    ans = x.next().charAt(0);

                    if(ans == 'N' || ans == 'n'){ //program ends when answer is no
                        System.out.println("Program will end here..."); 
                        System.exit(0); 
                    }
               
           }while(ans == 'Y' || ans == 'y');
           
            

            
    }
}