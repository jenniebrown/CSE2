//Jennifer Brown
//CSE2
//lab10
//3 April 2015

//practice with using arrays. ask user for input, save as one dimensional array

import java.util.Scanner;   //import scanner

public class ArrayInputs{
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int arSize;
        boolean count=false;
        System.out.print("Please enter array size: ");
        System.out.println();
        do{
            if(count){ 
            System.out.print("Please enter a positive array size: ");
            System.out.println();
            };
            while(!scan.hasNextInt()){
                System.out.println("You must enter an integer: ");
                scan.next();
            }//end while
            arSize=scan.nextInt();
            count=true;
        }while(arSize<=0);
        System.out.println(arSize);
        System.out.print("Please enter "+arSize+" positive integers: ");
        int[] arInput;
        arInput=new int[arSize];
        
        do{
            count=true;
            for(int i=0;i<arSize;i++){
                arInput[i]=scan.nextInt();
                if(arInput[i]<0){
                    count=false;
                }//end if
            }//end for
            if(!count){
                System.out.println("You must enter positive integers. Please try again.");
            }//end if
        }while(!count);
        
        System.out.println("The array is ");
        for(int j=0;j<arSize;j++){
            System.out.println(arInput[j]);
        }//end for
        
        
        
    }//end main method
}//end class