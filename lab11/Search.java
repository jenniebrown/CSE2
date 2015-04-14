//Jennifer Brown
//CSE2
//lab11
//10 April 2015

//create two arrays, use linear and binary searches to find values.

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Search{
    
    public static void main(String[] args){
        Random rand=new Random();               //initialize
        Scanner scan=new Scanner(System.in);
        int length=50;                          //length of arrays
        int[] array1=new int[length];           //initialize arrays
        int[] array2=new int[length];
        
        array1=randArray(array1,rand,length);   //make arrays
        array2=incArray(array2,rand,length);
        
        int[] extremes1=new int[2];             //find min and max values. min is extreme[0] and max is extreme[1]
        extremes1=minMax(array1,length,extremes1);
        System.out.println("Array 1 min is "+extremes1[0]);
        System.out.println("Array 1 max is "+extremes1[1]);
        int[] extremes2=new int[2];
        extremes2=minMax(array2,length,extremes2);
        System.out.println("Array 2 min is "+extremes2[0]);
        System.out.println("Array 2 max is "+extremes2[1]);
        
        System.out.println("Enter an int >= 0");    //ask for user input, must be int>=0
        int input=0;
        if(!scan.hasNextInt()){
            System.out.println("You suck");
            System.exit(0);
        } else{
            input=scan.nextInt();
        }//end else
        if(input<0){
            System.out.println("You suck");
            System.exit(0);
        }//end if
        
        findValue(array2,length,input);
        
    }//main method
    
    public static void findValue(int[] array, double length, int target){
        if(target<array[0]){
            System.out.println("Target value "+target+" not found.");
            System.out.println("The number above the target was "+array[0]+".");
            System.out.println("There were no numbers below target.");
            return;
        } else if(target>array[(int)length-1]){
            System.out.println("Target value "+target+" not found.");
            System.out.println("The number below the target was "+array[(int)length-1]+".");
            System.out.println("There were no numbers above target.");
            return;
        }//else if
        
        
        int begin=0,end=array.length;
        int mid=(int)((begin+end)/2);
        int value=array[mid];

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
        }//while
        if(value==target){
            System.out.println("Target "+target+" found.");
        }else if(array[mid]>target){
            System.out.println("Target "+target+" was not found in list.");
            System.out.println("The number above the target was "+array[mid]+".");
            System.out.println("The number below the target was "+array[mid-1]+".");
        }else if(array[mid]<target){
            System.out.println("Target "+target+" was not found in list.");
            System.out.println("The number above the target was "+array[mid+1]+".");
            System.out.println("The number below the target was "+array[mid]+".");
        }//elseif
        return;    
        
    }//findValue
    
    public static int[] minMax(int[] array,int l,int[] extremes){
        extremes[0]=array[0];
        extremes[1]=array[0];
        for(int i=0;i<l;i++){
            if(array[i]<extremes[0]){
                extremes[0]=array[i];  
            } else if(array[i]>extremes[1]){
                extremes[1]=array[i];
            }//end if
        }//for
        return extremes;
    }//minMax
    
    public static int[] randArray(int[] array1, Random rand,int num){
        for(int i=0;i<num;i++){
            array1[i]=rand.nextInt(101);
            //System.out.print(array1[i]+" ");
        }//for
        //System.out.println();
        return array1;
    }//randArray
    
    public static int[] incArray(int[] array2, Random rand, int l){
        array2[0]=rand.nextInt(101);
        //System.out.print(array2[0]+" ");
        for(int i=1;i<l;i++){
            array2[i]=array2[i-1]+rand.nextInt(101);
            //System.out.print(array2[i]+" ");
        }//for
        //System.out.println();
        return array2;
    }//incArray
}//class