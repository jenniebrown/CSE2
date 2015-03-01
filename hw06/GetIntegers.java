//Jennifer Brown
//CSE2
//27 Feb 2015
//hw 6

//print sum of 5 user input integers. use loops to determine acceptability of input

import java.util.Scanner;

public class GetIntegers{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter five non-negative integers");  //ask user input
        double input;   //initialize variable input
        int total=0;    //initialize & declare variable total
        for(int i=0;i<5;i++){   //for loop to collect 5 integers from user
            int j=0;    //initialize & declare variable j
           do{          //do-while loop to make sure integer is positive
               if(j!=0){        //make sure error message doesn't display on first run of loop
                   System.out.println("Please enter positive integer.");    //prompt user for non negative integer
               }//end if
            while(!scan.hasNextInt()){  //while loop to make sure input is integer
                System.out.println("Not an integer, please try again.");
                scan.next();
            }//end while
            input=scan.nextInt();   //assign variable input
            j++;            //increment j so error message prints on next run of loop
        } while(input<0);   //implement do-while loop until positive integer is entered
            total=total+(int)input; //total is running sum of user input. add each new int to total in each run of for loop
          
            
        }//end for
        System.out.println("Sum is "+total);        //output total sum
        
    }//end main method
    
}//end class