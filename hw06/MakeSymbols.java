//Jennifer Brown
//CSE2
//hw 06
//28 Feb 2015

//use random number generator to make integer between 1-10, use do-while loop to generate symbol output

import java.util.Random;

public class MakeSymbols{
    public static void main(String[] args){
        Random randGen=new Random();
        int value=randGen.nextInt(101);
        System.out.println("Random number = "+value);
        System.out.print("The output pattern: ");
        if(value%2==0){
            do{
                System.out.print("*");
                value--;
            } while(value>0);
            
        } else {
            do{
                System.out.print("&");
                value--;
            } while(value>0);
        }//end else
        System.out.printf("\n");
        
    }//end main method
    
}//end class