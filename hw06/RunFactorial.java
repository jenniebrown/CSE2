//Jennifer Brown
//CSE2
//hw 06
//28 Feb 2015

//make factorial calculator using user input and while loops.

import java.util.Scanner;   //import scanner class

public class RunFactorial{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int fact;       //initialize variable fact
        do{
            System.out.println("Please enter an integer between 9 and 16"); //prompt for user input
            while(!scan.hasNextInt()){  //make sure input is an integer
                System.out.println("Not an integer, please try again.");
                scan.next();
            }//end while
            fact=scan.nextInt();    //assign variable fact
        } while(fact<9||fact>16);   //repeat loop until integer between 9 and 16 is entered
        
        double ans=fact;   //declare variable ans
        while(fact>1){  //compute factorial
            fact--;
            ans=ans*fact;   //decrement fact, multiply by ans
        }//end while
        System.out.printf("Factorial = %.0f \n",ans); //output factorial of user input
        
    }//end main method
    
}//end class
