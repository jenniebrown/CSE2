//Jennifer Brown
//CSE2
//Homework 3
//2/10/15

//print out four digits to right of decimal place of user input double

//import scanner
import java.util.Scanner;

//define class
public class FourDigits{
    //define main method
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in); //declare scanner
        System.out.print("Enter double and I will display four digits to the right of the decimal point:"); //prompt user input
        double val=myScanner.nextDouble(); //accept user input
        
        //recast val into int, multiply by 10000
        int intVal=(int)val*10000; 
        double bigVal=val*10000; //multiply val by 10000;
        int intBigVal=(int)bigVal; //recast bigVal to int
        int tenth=(int)(intBigVal/1000)-intVal/1000;    //find tenth
        int hund=(int)(intBigVal/100)-(int)(intBigVal/1000)*10; //find hundredth
        int thou=(int)(intBigVal/10)-(int)(intBigVal/100)*10;   //find thousandth
        int tthou=intBigVal-(int)(intBigVal/10)*10;     //find ten thousandth
        //print output
        System.out.println("The first four digits are "+tenth+hund+thou+tthou);
        
        
    }   //end main method
    
}   //end class