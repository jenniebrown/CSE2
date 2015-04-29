//Jennifer Brown
//CSE 2
//hw 13
//25 April 2015

//ragged 4D array sorting


//imports
import java.util.Scanner;
import java.util.Random;

public class FourDwin{
    public static void main(String[] args){
        
        //declare scanner
        Scanner scan=new Scanner(System.in);
        //---------------------------------------------------------//
        //get two user input values to decide length of arrays
        //value 1
        System.out.println("Enter an integer X: ");
        int X;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Invalid input. Enter an integer X:");
                scan.next();
            }//while
            X=scan.nextInt();
            if(X<=0){
                System.out.println("Invalid input. Enter an integer X:");
            }//if
        }while(X<=0);
        //value 2
        System.out.println("Enter an integer Y>X: ");
        int Y;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Invalid input. Enter an integer Y>X:");
                scan.next();
            }//while
            Y=scan.nextInt();
            if(Y<=X){
                System.out.println("Invalid input. Enter an integer Y>X:");
            }//if
        }while(Y<=X);
        //---------------------------------------------------------//
        //fill multidimensional array 
        double[][][][] fourD=new double[3][][][];
        int length2,length3,length1,length;
        //outer matrix of 3D matrices
        for(int i=0;i<fourD.length;i++){
            length3=(int)(Math.random()*(Y-X)+X);
            fourD[i]=new double[length3][][];
            //matrix of 2D matrices
            for(int j=0;j<fourD[i].length;j++){
                length2=(int)(Math.random()*(Y-X)+X);
                fourD[i][j]=new double[length2][];
                //matrix of 1D matrices
                for(int k=0;k<fourD[i][j].length;k++){
                    length1=(int)(Math.random()*(Y-X)+X);
                    fourD[i][j][k]=new double[length1];
                    //fill lowest level array with random doubles 0-30
                    fourD[i][j][k]=makeArray(length1);
                }//for3
            }//for2
        }//for1
        //---------------------------------------------------------//
        //print original 4D 
        System.out.println("The original array is:");
        print4D(fourD);
        //---------------------------------------------------------//
        //sort fourD
        double[][][][] sort4D=sort4DArray(fourD);
        //---------------------------------------------------------//
        //print sorted 4D 
        System.out.println("The sorted array is:");
        print4D(sort4D);
        //---------------------------------------------------------//
        //print statistics for multiArray
        statArray(fourD);
        
    }//end main method
    
    //print 4D array in nested bracket format
    public static void print4D(double[][][][] array){
        System.out.print("{ ");
        for(int i=0;i<array.length;i++){
            System.out.print("{ ");
            for(int j=0;j<array[i].length;j++){
                System.out.print("{ ");
                for(int k=0;k<array[i][j].length;k++){
                    System.out.print("{ ");
                    for(int m=0;m<array[i][j][k].length;m++){
                        System.out.print(array[i][j][k][m]+", ");    
                    }//for4
                    System.out.print("}, ");
                }//for3
                System.out.print("},");
            }//for2
            System.out.print("}, ");
        }//for1
        System.out.println("} ");
    }//print4D
    
    //sort 3D array from lowest to highest.
    public static double[][][] sort3DArray(double[][][] array){
        int index;
        double min,temp;
        for(int j=0;j<array.length;j++){
            for(int k=0;k<array[j].length;k++){
                for(int m=0;m<array[j][k].length;m++){
                index=m;
                min=array[j][k][m];
                for(int n=m+1;n<array[j][k].length;n++){
                    if(array[j][k][n]<min){
                        min=array[j][k][n];
                        index=n;
                    }//if
                }//for4
                temp=array[j][k][m];
                array[j][k][m]=min;
                array[j][k][index]=temp;
                }//for3
            }//for2
        }//for1
        return array;
    }//sort3D
    
    //sort 4D array based size of 3D arrays. Ties are broken by lowest integer of 3D array
    public static double[][][][] sort4DArray(double[][][][] array){
        //sort 3D arrays
        for(int i=0;i<array.length;i++){
            array[i]=sort3DArray(array[i]);
        }//for
        //find size of each 3D array and min
        int[] size=new int[array.length];
        double min[]=new double[array.length];
        for(int j=0;j<array.length;j++){
            min[j]=array[j][0][0][0];
            for(int k=0;k<array[j].length;k++){
                for(int m=0;m<array[j][k].length;m++){
                size[j]+=array[j][k][m].length;
                if(array[j][k][m][0]<min[j]){
                    min[j]=array[j][k][m][0];
                }//if
                }
            }//for2
        }//for1
        //sort 3D arrays based on length. ties are broken by lowest member
        double[][][] temp;
        int index;
        for(int i=1;i<array.length;i++){
            index=i;
            while(size[index]<size[index-1]||size[index]==size[index-1]){
                if(size[index]<size[index-1]){
                    temp=array[index];
                    array[index]=array[index-1];
                    array[index-1]=temp;
                    index--;
                }else if(size[index]==size[index-1]){
                    if(min[index]<min[index-1]){
                        temp=array[index];
                        array[index]=array[index-1];
                        array[index-1]=temp;
                        index--;
                    }else{
                        break;
                    }
                    if(index==0){
                        break;
                    }
                }//else if
            }//while
        }//for
        return array;
    }//sort4D
    
    
    //print out sum, mean, and number of elements in 4D array
    public static void statArray(double[][][][] array){
        double sum=0;
        int num=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                for(int k=0;k<array[i][j].length;k++){
                    for(int m=0;m<array[i][j][k].length;m++){
                    sum+=array[i][j][k][m];
                    num++;
                    }//for4
                }//for3
            }//for2
        }//for1
        double mean=sum/num;
        System.out.printf("Members: %d \n",num);
        System.out.printf("Sum: %.1f \n",sum);
        System.out.printf("Mean: %.1f \n",mean);
    }//statArray
    
    //make 2D array of random length between min and max
    public static double[] makeArray(int length){
        double[] result=new double[length];
        for(int i=0;i<length;i++){
            result[i]=((int)(Math.random()*301))/10.0;
        }
        return result;
    }//makeArray
}//end class