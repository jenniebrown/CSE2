//Jennifer Brown
//CSE2
//lab 07
//6 Mar 2015

//use nested while loop and break statements to output a desired format

import java.util.Scanner;

public class zigzag{
    public static void main(String[] args){
        //create while loop to output number of stars in variable nStars
        Scanner scan=new Scanner(System.in);
        while(true){
        int nStars;
        do{
            System.out.println("Please enter an integer between 3 and 33");
            while(!scan.hasNextInt()){
                System.out.println("Please enter an integer");
                scan.next(); 
            }//end while
            nStars=scan.nextInt();
        } while(nStars>33||nStars<3);
        
        int k=1;
        while(k<nStars){
            System.out.print("*");
            k++;
        }//end while
        
        int i=0;
        while(i<nStars-1){
            String slant="";
            int j=0;
            while(j<i){
                slant=slant+" ";
                j++;
            }//end nested while
            System.out.println(slant+"*");
            i++;
        }//end while
        
        int m=0;
        while(m<nStars){
            System.out.print("*");
            m++;
        }
        System.out.println("");
        
        System.out.println("Try again? Enter 'Y' or 'y' for yes.");
        String yes;
        yes=scan.next();
            switch(yes){
                case "Y":
                case "y":
                    break;
                default:
                    return;
            }//end switch
        }//end infinite while
        
        
        
    }//end main method
    
}//end class