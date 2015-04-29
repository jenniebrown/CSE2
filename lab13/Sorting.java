//Jennifer Brown
//lab 13
//24 April 2015

//ragged arrays and sorting


//imports
import java.util.Random;

public class Sorting{
    public static void main(String[] args){
        int[][] ragged=makeRagged();
        System.out.println("Original array is:");
        printArray(ragged);
        int[][] sorted=sort(ragged);
        System.out.println("Sorted array is:");
        printArray(sorted);
        int[][] squared=square(sorted);
        System.out.println("The rectangular sorted array is:");
        printArray(squared);
        
    }//main method
    
    
    public static int[][] makeRagged(){
        Random rand=new Random();
        int[][] result=new int[5][];
        int val=5;
        for(int i=0;i<5;i++){
            result[i]=new int[3*i+val];
            for(int j=0;j<result[i].length;j++){
                result[i][j]=rand.nextInt(40);
            }//for
        }//for
        return result;
    }//makeRagged
    
    public static void printArray(int[][] array){
        for(int i=0;i<array.length;i++){
            System.out.print("[ ");
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }//for
            System.out.println("]");
        }//for
    }//printArray
    
    public static int[][] sort(int[][] array){
        int temp=0;
        int key=0;
        int pos=0;
        for(int i=0;i<array.length;i++){
            for(int j=1;j<array[i].length;j++){
                key=array[i][j];
                pos=j;
                while(key<array[i][pos-1]&&pos>0){
                    temp=array[i][pos];
                    array[i][pos]=array[i][pos-1];
                    array[i][pos-1]=temp;
                    pos--;
                    if(pos==0){
                        break;
                    }
                }
            }//for
        }//for
        return array;
    }//sort
    
    public static int[][] square(int[][] array){
        int longest=0;
        for(int i=0;i<array.length;i++){
            if(array[i].length>longest){
                longest=array[i].length;
            }//if
        }//for
        int[][] result=new int[array.length][];
        for(int j=0;j<array.length;j++){
            result[j]=new int[longest];
            for(int k=0;k<longest;k++){
                if(k<array[j].length){
                    result[j][k]=array[j][k];
                }else{
                    result[j][k]=0;
                }//if-else
            }//for
        }//for
        return result;
    }//square
}//class