//Jennifer Brown
//CSE2
//Lab 4
//Feb 13, 2015

//Use selection statements to tell user whether they have enough cookies for an 
//event and whether the number of cookies is divisible by the number of people.

//import Scanner class
import java.util.Scanner;

//define class
public class Cookies{
    //define main method
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);   //get input from STDIN
        //prompt user for number of people
        System.out.print("Enter number of people: ");
        int people, nCookies, cookies;
        //make sure user has entered an int
        if( myScanner.hasNextInt() ) {
            people=myScanner.nextInt();
        } else {
            System.out.println("You did not enter an integer.");
            return; //terminates the program
        }   //end else statement
        //make sure number of people is greater than 0
        if( people < 0 ){  
            System.out.println("You entered an integer less than 0.");
            return; //terminate program
        } //end if statement
        //prompt user for number of total cookies
        System.out.print("How many cookies do you plan on buying? ");
        //make sure user entered integer
        if( myScanner.hasNextInt() ) {
            nCookies=myScanner.nextInt();   //assign variable nCookies
        } else {
            System.out.println("You did not enter an integer");
            return; //exit program
        }
        //make sure nCookes >0
        if( nCookies < 0 ){
            System.out.println("You entered an integer less than 0.");
            return; //exit program
        }
        //prompt user for desired number of cookies per person
        System.out.print("How many cookies should each person get? ");    
        //make sure user entered integer
        if( myScanner.hasNextInt()) {
            cookies=myScanner.nextInt();    //assign variable cookies
        } else {
            System.out.println("You did not enter an integer.");
            return; //exit program
        }
        //make sure cookies is > 0 
        if( cookies < 0 ){
            System.out.println("You entered an integer less than 0.");
            return;
        }
   
        //calculate whether there will be enough cookies
        
        int perPerson;  //declare variable perPerson
        switch( people ) {
            case 0:
                System.out.println("Trust me, you have enough cookies.");
                break;
            default: 
                perPerson=nCookies/people;  //calculate max number of cookies per person
                if( perPerson >= cookies ) { //check if there are enough cookies per person
                    if( nCookies%people==0 ) {//check if number of cookies is divisible by number of people
                        System.out.println("You will have enough cookies and they will divide evenly.");
                    } else { System.out.println("You will have enough cookies, but they won't divide evenly.");
                    }   //end else statement
                }   //end outer if statement
                else{       //tell user if there are not enough cookies per person
                    int needed=cookies*people-nCookies;  //calculate number of cookies needed
                    System.out.println("You don't have enough cookies. You need at least "+needed+" more.");
                }   //end else statement
        }   //end switch statement
    
    }//end main method
    
    
    
}//end class