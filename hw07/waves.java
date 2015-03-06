//Jennifer Brown
//CSE 2
//hw 07
//6 Mar 2015

//use loops to make waves of form
//1
//2
//22
//333
//33
//3
//4...
//based on user input 

import java.util.Scanner;

public class waves{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);    //take input from STDIN
        int input,i,j,k;  //declare variable input
        do{     //do-while loop to accept input from user and make sure input is an integer between 1 and 30 inclusive
            System.out.print("Enter an integer between 1 and 30 inclusive: ");
            while(!scan.hasNextInt()){
                System.out.println("Input must be an integer.");    //ask again if not an integer
                scan.next();
            }//end while
            input=scan.nextInt();
        } while(input<1||input>30); //ask user for input, make sure it is an integer between 1 and 30 inclusive
        System.out.printf("\nFOR LOOP:\n");
        //use for loop to create pattern based on user input

        for(i=1;i<=input;i++){   //runs for each integer up until input
            for(j=0;j<i;j++){   //creates number of lines for each value of i
                if(i%2==0){
                    for(k=0;k<=j;k++){   //creates output for each line
                        System.out.print(i);
                     }//end nested nested for
                } else {
                    for(k=i-j;k>0;k--){
                        System.out.print(i);
                    }//end for
                }//end else
                System.out.println("");
            }//end nested for
        }//end outside for
        System.out.printf("\nWHILE LOOP:\n");
        //use while loop to create wave
        i=1;
        while(i<=input){   //runs for each integer up until input
            j=0;
            while(j<i){   //creates number of lines for each value of i
                if(i%2==0){
                    k=0;
                    while(k<=j){   //creates output for each line
                        System.out.print(i);
                        k++;    //increment k
                     }//end nested nested while
                } else {
                    k=i-j;
                    while(k>0){
                        System.out.print(i);
                        k--;    //decrement k
                    }//end while
                }//end else
                System.out.println("");
                j++;    //increment j
            }//end nested while
            i++;    //increment i
        }//end outside while
        
        //use do-while loops to create wave
        System.out.printf("\nDO-WHILE LOOPS:\n");   //label output as do-while
        i=1;
        do{                 //runs for each integer up until input value
            j=0;
            do{ //creates number of lines for each value of i
               if(i%2==0){  //if i is even, start from 1 and increase to i by adding 1 printed value to each line
                    k=0;
                    do{     //creates output for each line
                        System.out.print(i);    //output for one line
                        k++;    //increment k  
                    }while(k<=j);//end do while
                } else {    //if i is odd, we start with the number of values printed at i and decrease
                    k=i-j;  //subtract one from k for each line that is printed
                    do{
                        System.out.print(i);    //output for one line
                        k--;    //decrement k
                    }while(k>0);
                }//end else
                System.out.println("");//new line
                j++;    //increment j 
            }while(j<i);//end first nested do-while loop
            i++;    //increment i
        }while(i<=input);   //runs for each integer up until input value
            
            
        
    }//end main method
}//end class