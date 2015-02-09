//Jennifer Brown
//CSE2
//Lab 03
//2-6-15

//program computes cost of buying Big Macs using Scanner class for input

//import scanner class
import java.util.Scanner;

//define class
public class BigMac {
    //define main method
    public static void main(String[] args) {
        Scanner myScanner;  //declare scanner
        myScanner=new Scanner(System.in);   //take input from STDIN 
        System.out.print("Enter number of Big Macs (integer >0):"); //prompt for user input
        int nBigMacs=myScanner.nextInt();   //accept user input
        System.out.print("Enter the cost per Big Mac as a double in the form xx.xx: ");
        double bigMac$=myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        taxRate/=100;   //convert percentage to proportion
        
        double cost$;
        int dollars, dimes, pennies;    //variables for storing digits of cost$
        cost$=nBigMacs*bigMac$*(1+taxRate);
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" Big Macs at $"
        +bigMac$+" per big Mac with a sales tax of "+(int)(taxRate*100)+"% is $"
        +dollars+'.'+dimes+pennies);
        
        
        
        
        
    }   //end main method
    
    
    
}   //end class