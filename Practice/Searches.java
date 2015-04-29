//practice for exam 

//doing searches
//hw 11

//imports
import java.util.Scanner;
import java.util.Random;

public class Searches{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 15 ints");
    int[] array1= new int[15];
    int val=2;
    for(int i=0;i<15;i++){
        array1[i]=val;
        
    }    
    //prompt user to input sorted array of length 15
    // int i=0;
    // int val=0;
    // while(i<15){
    
    // do{ //input:  m
    //     while(!scan.hasNextInt()){
    //         System.out.println("You must enter an int");
    //         scan.next();
    //     }//end while
    //     array1[i]=scan.nextInt();
    //     if(array1[i]<val){
    //         System.out.println("You must enter ints in increasing order.");
    //     }//end if
    // }while(array1[i]<val);
    // val=array1[i];
    // i++;
    // }//end while
    
    //print out array
    printArray(array1);
    
    //prompt user to input value to search for
    System.out.println("Enter target grade to search for");
    int target=-1;
    do{
        while(!scan.hasNextInt()){
            System.out.println("You must enter an int");
            scan.next();
        }//end while
        target=scan.nextInt();
        if(target<0||target>100){
            System.out.println("Target must be between 0-100");
        }
    }while(target<0||target>100);
    
    
    int[] single=noReps(array1);
    printArray(single);
    // boolean bool=search(array1,target, 9, 7);
    // System.out.println(bool);
    // //search for target using binary search
    // binarySearch(array1,target);
    
    // //randomize list
    // int[] random=mixer(array1);
    
    // //print randomized list
    // printArray(random);
    
    // //search for target using linear search
    // linearSearch(random,target);
    
    }//end main method
    
    
    
    
    
    
    
    
public static int[] noReps(int[] myArray){
	int[] result=new int[myArray.length];
	int target,min,max;
	int counter=0;
	for(int i=0;i<result.length;i++){
		target=myArray[i];
		max=myArray.length;
		min=i+1;
	    if(!search(myArray,target,min,max)){
			result[counter]=myArray[i];
			counter++;
	    }
	 
	}
	result=resize(result,counter);
	return result;
}
    
    
    public static int[] resize(int []myArray, int newSize){
	int[] newArray=new int[newSize];
	for(int i=0;i<newSize;i++){
		if(i<myArray.length){
			newArray[i]=myArray[i];
		}else{
			newArray[i]=0;
		}
	
	}
	return newArray;
    }
    
    
    public static boolean search(int[] array, int target, int minRange, int maxRange){
	int length=array.length;
	if(minRange<0||minRange>maxRange||minRange>length){
		System.out.println("Invalid Range.");
		return false;
	}else if(maxRange<0||maxRange>length){
		System.out.println("Invalid range.");
		return false;
	}
	int val=0;
	for(int i=minRange;i<maxRange;i++){
		val=array[i];
		if(val==target){
			return true;
		}
	}
	return false;
}

    
    //prints out input array on one line
    public static void printArray(int[] array){
        int length=array.length;
        System.out.print("[ ");
        for(int j=0;j<length;j++){
            System.out.print(array[j]+" ");
        }//end for
        System.out.println("]");
    }//end printArray
    
    //searches input array for target value using binary search
    public static void binarySearch(int[] array, int target){
        int begin,end,mid,val,counter;
        begin=0;
        end=array.length;
        counter=0;
        val=0;
        while(begin<end){
            counter++;
            mid=(int)((end+begin)/2);
            val=array[mid];
            if(val==target){
                begin=end;
                System.out.println("Grade found in "+counter+" iterations.");
            }else if(val<target){
                begin=mid+1;
            }else if(val>target){
                end=mid;
            }
        }//end while
        if(val!=target){
            System.out.println("Grade not found in "+counter+" iterations.");
        }//end if
    }//end binarySearch
    
    public static int[] mixer(int[] array){
        Random rand=new Random();
        int temp,index;
        for(int j=0;j<array.length;j++){
            index=rand.nextInt(array.length);
            temp=array[j];
            
            array[j]=array[index];
            array[index]=temp;
        }//end for
        return array;
    }//end mixer
    
    public static void linearSearch(int[] array, int target){
        int counter=0;
        int val=0;
        for(int j=0;j<array.length;j++){
            counter++;
            val=array[j];
            if(val==target){
                System.out.println("Target grade found in "+counter+" iterations.");
                break;
        }

    }
            if(val!=target){
            System.out.println("Target grade not found in "+counter+" iterations.");
        }
    }//end linearSearch
}//end class