//Jennifer Brown
//CSE2
//Homework 3
//2/10/15

//Estimate cubed root of user given integer

//import scanner
import java.util.Scanner;

//define class
public class Root {
    //define main method
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);   //take input from STDIN
        System.out.print("Enter double to find cubed root:");   //prompt user for value
        double value=myScanner.nextInt();   //accept user input
        
        //begin calculations
        //guess cubed root = value/3
        double guess1=value/3;
        double guess2=(2*guess1*guess1*guess1+value)/(3*guess1*guess1);   //improve guess
        double guess3=(2*guess2*guess2*guess2+value)/(3*guess2*guess2);
        double guess4=(2*guess3*guess3*guess3+value)/(3*guess3*guess3);
        double guess5=(2*guess4*guess4*guess4+value)/(3*guess4*guess4);
        double est=(2*guess5*guess5*guess5+value)/(3*guess5*guess5);
        //calculate estimate cubed
        double cubed=est*est*est;
        
        //print output
        System.out.println("The estimated cubed root is "+est);
        System.out.println(est+"*"+est+"*"+est+"="+cubed);
    }   //end main method
    
}   //end class