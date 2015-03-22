//Jennifer Brown
//CSE2
//Lab 8
//20 March 2015

import java.util.Scanner;   //import scanner 

public class Factorials{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);        //take input from STDIN
        System.out.println("Please enter an integer");      //ask user for input
        while(!scan.hasNextInt()){      //make sure input is an integer
            System.out.println("Input must be an integer");
            scan.next();
        }//end while
        int input=scan.nextInt();
        int sum=0;
        for(int i=1;i<=input;i++){
            sum+=factorial(i);
        }//end for
        
        print(input,sum);
    }//end main method
    
    public static int factorial(int in){
        int fact=1;
        for(int j=1;j<=in;j++){
            fact*=j;
        }//end for
        return fact;
    }//end method factorial
    
    public static void print(int num, int tot){
        System.out.println("The super factorial of "+num+" is "+tot);
    }//end method print
    
}//end class