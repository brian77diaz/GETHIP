//Scanner imported for user input
import java.util.Scanner;

public class SimpleATM {
 
    public static void main(String[] args) {
        //Variables needed
        int correctPIN = 3005;
       int PIN;
       double balance = 0.00;
        double finalBalance;
        int selection;
        int selection1 = 1, selection2 = 2, selection3 = 3;
        double withdraw;
        double deposit;
       
       //Scanner built to get the correct PIN
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Please enter your pin: ");
       PIN = keyboard.nextInt();
       
       if (PIN == correctPIN)  { 
                         
       }
       // Ask user to enter correct PIN
       else do {
           System.out.println("Incorrect PIN");
            System.out.print("Please enter your PIN: ");
            PIN = keyboard.nextInt();
       }
       while (PIN != correctPIN);
       // Greet user, announce balance, and give 3 options(Menu).
       System.out.println("Weclome to Huge Bank Inc.\nYour balance: $0.00" ); 
                System.out.println("1. Make a deposit\n2. Make a withdrawl\n3. Exit");
       System.out.println("Please make a selection.");
                selection = keyboard.nextInt();
             //If user selects the 1st option.  
 if (selection == 1) {
     //If user selects 1st option
     //Display deposit screen.
     //Then display menu again.
                    System.out.println("Your selction is 1.");
                    System.out.println("How much would you like to deposit?");
               deposit = keyboard.nextInt();
               balance = deposit;
               System.out.println("Deposit successful");
               System.out.println("Your balance is $" + balance);
               finalBalance = balance + deposit;
         //Give user the menu again.
                System.out.println("1. Make a deposit\n2. Make a withdrawl\n3. Exit");
       System.out.println("Please make a selection.");
                selection = keyboard.nextInt();
                if (selection == 2) {
                        System.out.println("Your selction is 2.");
        System.out.println("How much would you like to withdraw?");
        withdraw = keyboard.nextInt();
        finalBalance = deposit - withdraw;
        if (finalBalance > withdraw) 
            System.out.println("Your balance is " + finalBalance);
        if (withdraw > finalBalance) 
            System.out.println("Error not enough funds.");
         System.out.println("1. Make a deposit\n2. Make a withdrawl\n3. Exit");
       System.out.println("Please make a selection.");
                selection = keyboard.nextInt();                 
                
                }
 }
 //If user selects 2nd option.
 //Display withdraw screen
//Then display menu again.
 if (selection == 2) {
       System.out.println("Your selction is 2.");
        System.out.println("How much would you like to withdraw?");
        withdraw = keyboard.nextInt();
        finalBalance = balance - withdraw;
        System.out.println("Error not enough funds.");
        System.out.println("1. Make a deposit\n2. Make a withdrawl\n3. Exit");
       System.out.println("Please make a selection.");
                selection = keyboard.nextInt();
                if (selection == 1) {
                    System.out.println("Your selction is 1.");
                    System.out.println("How much would you like to deposit?");
               deposit = keyboard.nextInt();
               balance = deposit;
               System.out.println("Your balance is $" + balance);
               finalBalance = balance + deposit;
         //Display menu
                System.out.println("1. Make a deposit\n2. Make a withdrawl\n3. Exit");
       System.out.println("Please make a selection.");
                selection = keyboard.nextInt();
         if (selection == 2) {
                        System.out.println("Your selction is 2.");
        System.out.println("How much would you like to withdraw?");
        withdraw = keyboard.nextInt();
        finalBalance = deposit - withdraw;
        System.out.println("Your balance is " + finalBalance);
        if (withdraw > finalBalance) 
            System.out.println("Error not enough funds.");
                    }
         System.out.println("1. Make a deposit\n2. Make a withdrawl\n3. Exit");
       System.out.println("Please make a selection.");
                selection = keyboard.nextInt();
                             
   }     
    }
 //If user selects 3rd option.
//Thank user and end program.
 if(selection == 3) {
     System.out.println("Thank you for your business!");
 }
}
}




