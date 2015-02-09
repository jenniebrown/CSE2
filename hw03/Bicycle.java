//Jennifer Brown
//CSE2
//Homework 3
//2/10/15

//program takes user input for time and turns of bicycle wheel, computes and
//outputs distance traveled and average speed.

//import scanner class
import java.util.Scanner;


//define class
public class Bicycle {
    //define main method
    public static void main(String[] args){
        Scanner myScanner;  //declare scanner
        myScanner=new Scanner(System.in);   //will take input from STDIN
       System.out.print("Enter number of cycles as an integer:");  //prompt for number of cycles
        int cycles=myScanner.nextInt(); //accept number of cycles from user
        System.out.print("Enter time in seconds as an integer:");   //prompt user input
        int time=myScanner.nextInt();   //accept user input
        
        //perform calculations
        int D=27;       //wheel diameter in inches
        double pi=3.14159;  //pi
        double inDistance=pi*D*cycles;  //distance traveled in inches
        double miDistance=inDistance/(12*5280); //distance traveled in miles
        double totTime=time/60;     //time of trip in minutes
        double hrTime=totTime/60;   //time of trip in hours
        double avgSpeed=miDistance/hrTime;      //average speed in mph
        
        //output results
        System.out.printf("Total distance traveled was %.2f miles and took %.1f minutes. %n", miDistance,totTime);
        System.out.printf("Average speed was %.2f mph. %n",avgSpeed);
        
        
        
        
    }   //end main method
    
    
    
}   //end class