//Jennifer Brown
//CSE 2
//hw 11
//10 April 2015

//binary and linear searches, switching

import java.util.Random;
import java.util.Scanner;

public class CSE2Linear{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Please enter 15 increasing integers");      //request user grades input
        int[] grades=new int[15];
        do{                                                             //make sure input is increasing positive integers only
            while(!scan.hasNextInt()){                                  //first value
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            grades[0]=scan.nextInt();
            if(grades[0]<0||grades[0]>100){
                System.out.println("You must enter integers between 0-100");
            }//else if
        }while(grades[0]<0||grades[0]>100);
        
        for(int i=1;i<15;i++){                                          //all other values
        do{
            while(!scan.hasNextInt()){
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            grades[i]=scan.nextInt();
            if(grades[i]<0||grades[i]>100){
                System.out.println("You must enter integers between 0-100");
            }else if(grades[i]<grades[i-1]){
                System.out.println("Grade entered must be greater than or equal to previous value.");
            }//else if
        }while(grades[i]<0||grades[i]>100||grades[i]<grades[i-1]);
        }//for
        System.out.println("The array is:");        //print out array
        for(int i=0;i<15;i++){
            System.out.print(grades[i]+" ");
        }//print for
        System.out.println();
        
        System.out.println("Please enter a target grade to search for:");       //ask user for target grade to search for
        int find=0;
        do{
            while(!scan.hasNextInt()){
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            find=scan.nextInt();
            if(find<0||find>100){
                System.out.println("You must enter an integer between 0-100");
            }//else if
        }while(find<0||find>100);
        
        binarySearch(grades, find);                 //use binary search to find input value
        
        int[] gradesScram=new int[15];              //scrable list randomly
        gradesScram=Randomize(grades,rand);
        
        System.out.println("The scrambled list is:");       //print out scrambled list
        for(int j=0;j<gradesScram.length;j++){      
            System.out.print(gradesScram[j]+" ");
        }//for
        System.out.println();
        
        
        System.out.println("Please enter a target grade to search for:");       //ask user for input grade to search for
        int find2=0;
        do{                                                             
            while(!scan.hasNextInt()){
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            find2=scan.nextInt();
            if(find2<0||find2>100){
                System.out.println("You must enter an integer between 0-100");
            }//else if
        }while(find2<0||find2>100);
        
        linearSearch(grades, find2);                        //use linear search to find target value
        
    }//main method
    
    public static int[] Randomize(int[] array, Random rand){        //randomize array
        int temp=0,index=0;
        for(int i=0;i<array.length;i++){
            index=rand.nextInt(15);
            temp=array[index];
            array[index]=array[i];
            array[i]=temp;
        }//for
        return array;
        
        
    }//Randomize
    
    public static void linearSearch(int[] array, int target){       //linear search to find target grade
        int counter=0;
        int value=0;
        while(counter<array.length){
            value=array[counter];
            counter++;              //increment counter to determine number of iterations
            if(value==target){
                System.out.println("Grade "+target+" was found in "+counter+" iterations.");
                break;
            }//if
        }//while
        if(value!=target){      //if value after finishing loop does not equal target, output grade not found & number of iterations
            System.out.println("Grade "+target+" was not found in "+counter+" iterations.");
        }//if
        return;
    }//linearSearch
    
    public static void binarySearch(int[] array, int target){       //implement binary search to find target grade
        int begin=0,end=array.length;       //initialize beginning and end counters
        int mid=(int)((begin+end)/2);       //mid counter is at average between begin and end      
        int value=array[mid];
        int counter=1;
        while(begin<end){       
            if(value<target){
                begin=mid+1;
            } else if(value>target){
                end=mid;
            } else{
                break;
            }//if
            mid=(int)((begin+end)/2);
            value=array[mid];
            counter++;              //iteration counter
        }//while
        if(value==target){
            System.out.println("Target "+target+" found in "+counter+" iterations.");
        }else{
            System.out.println("Target "+target+" was not found in "+counter+" iterations.");
        }//if-else
        
        return;
    }//binarySearch
    
}//class