//Jennifer Brown
//CSE2
//Homework 10
//3 April 2015

//practice using methods and array manipulation

import java.util.Scanner;
import java.util.Random;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);    //declare scanner
int num[]=new int[10];                      //declare & allocate int array num
int newArray1[];                            //declare int arrays
int newArray2[];
int index,target;                           //declare ints
	String answer="";                       //declare & initialize string answer
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	System.out.println();
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index: ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
 public static int[] randomInput(){
    Random rand=new Random();           //fill array with 10 random ints between 0 and 9 inclusive
     int[] randArray=new int[10];
     
     for(int i=1;i<10;i++){
         randArray[i]=rand.nextInt(10);
     }//end for
     return randArray;
     
 }//end randomInput
 
 public static int[] delete(int list[], int pos){       //delete value of array at position indicated by user
     
     int end=list.length;
     if(pos<0||pos>end){                                //check that position is within bounds
         System.out.println("Position index is invalid.");
         return list;                                   //if not, return original list
     }//end if
     int[] finList=new int[end-1];                      //declare& allocate new array with one less value than original list
     for(int j=0;j<end-1;j++){                          //assign finList
     if(j<pos){   
        finList[j]=list[j];
     }else{
         finList[j]=list[j+1];
     }//end else-if
     }//end for
     return finList;                                    //return finList
     
 }//end delete
 
 public static int[] remove(int list[],int target){     //remove all values from array that match target value
     int end=list.length;
     int count=0;                                       //initialize counter
     for(int n=0;n<end;n++){                            //determine number of values in array that match target
         if(list[n]==target){
             count++;
         }//end if
     }//end for
     int[] listOut=new int[end-count];                  //use count to allocate new array
     int m=0;
     if(count==0){                                      
         System.out.println("Target not found.");
         return list;
     }else{
         System.out.println("Target "+target+" has been found.");
     for(int k=0;k<end;k++){                            //assign new array
        if(list[k]==target){
            continue;
        }//end if
        listOut[m]=list[k];     
        m++;
     }//end for
      return listOut;   
     }//end else if
     
 }//end remove
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
}
