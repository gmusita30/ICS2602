import java.util.Scanner;
 
public class pota {
 
    //Main Method
    public static void main(String[] args) {
 
    //Create a Scanner
    Scanner input = new Scanner(System.in);
 
    //Create an instance for Name class
    Name names = new Name();
 
    //Enter Customer's First Name
    System.out.print("Enter Customer's first name: ");
    names.setFirstName = input.next();
 
    //Enter Customer's Last Name
    System.out.print("Enter Customer's last name: ");
    names.setLastName = input.next();
 
    //Create an instance for Item class
    Item items = new Item();
 
    //Enter Item Number
    System.out.print("Enter Item Number: ");
    items.setItemNum = input.nextInt();
 
    //Enter Item Cost
    System.out.print("Enter Item's Cost: ");
    items.setCost = input.nextFloat();
 
    //Enter Manufacturer's Name
    System.out.print("Enter Manufacturer's Name: ");
    items.setMfgName = input.next();
}
}
