//Jennifer Brown
//CSE2
//Homework 4
//13 Feb 2015

//use switch statements to allow users to complete various banking transactions

//import scanner
import java.util.Scanner;

//define class
public class Banking{
    //define main method
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);   //accept input from STDIN
        double account=1000+(Math.random()*4001);   //generate random number for initial account balance between 1000-5000
        //prompt user input for desired action
        System.out.printf("What would you like to do?\n 1- Make a deposit \n 2- Make a withdrawal \n 3- View balance \n");
        int option; //declare variable option
        if( myScanner.hasNextInt() ){   //make sure option entered is an integer
            option=myScanner.nextInt();
        } else {    //quit program if option is not an integer
            System.out.println("Invalid input");
            return;
        }//end else
        double deposit, withdraw, acctBalance;  //declare variables
        switch ( option ){
            case 1:
                //prompt user for deposit amount
                System.out.print("Enter desired deposit amount: ");
                if( myScanner.hasNextDouble() ){    //make sure deposit is of type double
                    deposit=myScanner.nextDouble(); //assign scanner value to deposit   
                } else {
                    System.out.println("Invalid input");    //exit program if not double
                    return;
                }
                if( deposit >= 0 ){
                    acctBalance=account+deposit;    //calculate new account balance if deposit >0
                    System.out.printf("Your new balance is $ %6.2f \n",acctBalance);
                } else {
                    System.out.println("Deposit must be greater than 0.");  //exit program if deposit <0
                    return;
                }//end else
                break;
            case 2:
                //prompt user for desired withdrawal
                System.out.print("Enter desired withdrawal amount: ");
                if( myScanner.hasNextDouble() ){    //check withdraw is double
                    withdraw=myScanner.nextDouble();    //assign withdraw
                } else {
                    System.out.println("Invalid input");    //exit program if not double
                    return;
                }//end else
                if( withdraw>=0 && withdraw<account ){   //make sure withdraw amount is between 0 and account
                    acctBalance=account-withdraw;   //assign balance
                    System.out.printf("Your new balance is $ %6.2f \n",acctBalance);    //print balance
                } else if(withdraw<0){
                    System.out.println("Withdrawal must be a positive number.");    //print if less than 0
                    return;
                } else {
                    System.out.println("Cannot withdraw more than current account balance.");   //print if greater than account balance
                    return;
                }
                break;
            case 3:
                System.out.printf("Your balance is $ %6.2f \n",account);    //print balance
                break;
            default:
                System.out.println("Invalid input");    //print and exit program if input not 
                break;
        }//end switch
        
        
        
    }//end method
    
    
    
}//end class