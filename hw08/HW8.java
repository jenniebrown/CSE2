//Jennifer Brown
//CSE2
//Homework 8
//20 March 2015

//design a game. Write methods to be called within the main method.

import java.util.Scanner;       //import scanner
import java.util.Random;        //import random

public class HW8{

public static void main(String[] args) {
        char option;    //declare variable option as a character
        Scanner scan = new Scanner(System.in);      //take input from STDIN
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");    //Prompt user for input
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }//end main method
    
    public static String getInput(Scanner scan, String string){//use user input to decide whether to continue the game
        
        string=scan.next(); //scan for user input
        String out;     //declare string variable out
        switch(string){
            case "C":       //if user inputs C or c, exit switch statement and continue the game. 
            case "c":
                out="y";
                break;
            default:
                System.out.println("Yea right LOSER!");     //if user enters anything else, print this line
                out="n";
                System.exit(0);                             //exit the game
                break;
        }//end 
        return out;     //return String 'out' 
    }//end getInput method
    
    public static String getInput(Scanner scan, String string, int trial){  //user will either attack or escape
        
        Random randGen=new Random();    //declare random
        String out2="";                 //declare string 'out2'
        int hit, esc;                   //declare ints hit and escape
        while(trial>0){                 //trial starts at a value of 10. user must continue this process until trial = 0 
            string=scan.next();         //ask user if they want to attack or escape
            switch(string){
                case "A":
                case "a":
                    hit=randGen.nextInt(2);     //for attack, random int generated (0 or 1). 
                    if(hit==1){                 //if 1, trial counter decreases by 1
                        trial-=1;
                        System.out.println("Critical hit!");    
                    } else {
                        System.out.println("How could you have missed that!");      //if 0, trial stays at previous value
                    }//end else
                    if(trial!=0){
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");}
                    break;
                case "E":
                case "e":
                    esc=randGen.nextInt(10)+1;  //for escape, random number generated 1-10 inclusive
                    if(esc==10){                //if 10, successful escape
                        System.out.println("You escaped the giant!");
                        trial=0;                //trial is set to 0 and system exits the while loop
                    } else {    //if not 10, make user repeat process
                        System.out.println("The giant blocked your exit! Press 'A' or 'a' to attack, 'E' or 'e' to escape, ANYTHING else to YIELD");
                    }//end else
                    break;
                default:
                    System.out.println("Executed by giant! Game over!");    //if incorrect input is entered, exit game
                    out2="n";
                    System.exit(0);
                    break;
            }//end switch
        }//end while
        return out2;
    }//end method getInput
    
    public static String getInput(Scanner scan){
        String reward=scan.next();  //use scanner to tell user which prize they win
        switch(reward){
            case "1":
                System.out.println("Congratulations! You win a year's subscription to Netflix!");
                break;
            case "2": 
                System.out.println("Congratulations! You've won a brand new car!");
                break;
            case "3":
                System.out.println("Congratulations! You've won an all-expense paid trip to Narnia!");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                break;
        }//end switch
        return "";
    }
    
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//end cave method
     public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//end giant method
     public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }//end box method



    
}//end class