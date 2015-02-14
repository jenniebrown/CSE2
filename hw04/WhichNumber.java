//Jennifer Brown
//CSE2
//Homework 4
//13 Feb 2015

//use program to guess number between 1 and 10 inclusive chosen by user

//import Scanner class
import java.util.Scanner;

//define class
public class WhichNumber {
    //define main method
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);//accept input from STDIN
        //ask user to think of a number between 1 and 10
        char input1, input2, input3, input4;    //declare variables
        System.out.println("Think of an integer 1-10.");    
        System.out.print("Is your number divisible by 2? (y/n)");   //prompt user input
        input1=myScanner.next().charAt(0);  //assign input1
        
        switch (input1) {   //first criteria path
            case 'y':   //y=Y, so fall through
            case 'Y':
                System.out.print("Is your number divisible by 3? (y/n)");   //ask second criteria
                input2=myScanner.next().charAt(0);  //assign input2
                switch (input2) {
                    case 'y':
                    case 'Y':
                        System.out.println("Your number is 6.");//if divisible by 3
                        break;
                    case 'n':
                    case 'N':
                        System.out.print("Is your number greater than 5? (y/n)");//if not divisible by 3
                        input3=myScanner.next().charAt(0);//assign input3
                        switch (input3){
                            case 'y':
                            case 'Y':
                                System.out.print("Is your number divisible by 4? (y/n)");   //if greater than 5
                                input4=myScanner.next().charAt(0);//assign input4
                                switch (input4) {
                                    case 'y':
                                    case 'Y':
                                        System.out.println("Your number is 8.");    //if divisible by 4
                                        break;
                                    case 'n':
                                    case 'N':
                                        System.out.println("Your number is 10.");   //if not divisible by 4
                                        break;
                                    default:
                                        System.out.println("Invalid input");    //exit program if no y or n input
                                        break;
                                }
                                break;
                            case 'n':
                            case 'N':
                                System.out.print("Is your number divisible by 4? (y/n)");   //if not divisible by 3
                                input4=myScanner.next().charAt(0);//assign input4
                                switch (input4){
                                    case 'y':
                                    case 'Y':
                                        System.out.println("Your number is 4.");    //if divisible by 4
                                        break;
                                    case 'n':
                                    case 'N':
                                        System.out.println("Your number is 2.");    //if not divisible by 4
                                        break;
                                    default:
                                        System.out.println("Invalid input");    //exit program if no y or n input
                                        break;
                                }
                                break;
                            default:
                                System.out.print("Invalid input");
                                break;
                        }//end switch
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }//end switch
                break;
            case 'n':
            case 'N':
                System.out.print("Is your number greater than 4? (y/n)");   //if not even
                input2=myScanner.next().charAt(0);
                switch (input2){
                    case 'y':
                    case 'Y':
                        System.out.print("Is your number divisible by 3? (y/n)");   //if greater than 4
                        input3=myScanner.next().charAt(0);
                        switch (input3){
                            case 'y':
                            case 'Y':
                                System.out.println("Your number is 9.");    //if divisible by 3
                                break;
                            case 'n':
                            case 'N':
                                System.out.print("Is 10 divisible by your number?");    //if not divisible by 3
                                input4=myScanner.next().charAt(0);
                                switch (input4){
                                    case 'y':
                                    case 'Y':
                                        System.out.println("Your number is 5.");    //if multiplies to 10
                                        break;
                                    case 'n':
                                    case 'N':
                                        System.out.println("Your number is 7.");    //if doesnt multiply to 10
                                        break;
                                    default:
                                        System.out.println("Invalid input");    //if bad input
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }//end switch
                        break;
                    case 'n':
                    case 'N':
                        System.out.print("Is your number divisible by 3? (y/n)");   //if less than 4
                        input3=myScanner.next().charAt(0);  //assign input3
                        switch (input3){
                            case 'y':
                            case 'Y':
                                System.out.println("Your number is 3.");    //if divisible by 3
                                break;
                            case 'n':
                            case 'N':
                                System.out.println("Your number is 1.");    //if not divisible by 3
                                break;
                            default:
                                System.out.println("Invalid input");    //if bad input
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }//end switch
                break;
            default:
                System.out.println("Invalid input");
                break;
        }//end switch
        
      }   //end main method
    
    
}   //end class