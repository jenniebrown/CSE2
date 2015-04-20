//Jennifer Brown
//CSE 2
//hw12
//19 April 2015

//matrix multiplication

import java.util.Random;
import java.util.Scanner;

public class Multiply{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int width1,length1,width2,length2;
        
        do{
        do{                                                            
            System.out.println("Enter number of columns in matrix A");
            while(!scan.hasNextInt()){                                 
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            width1=scan.nextInt();
            if(width1<0){
                System.out.println("You must enter integers greater than 1. Try again.");
            }//else if
        }while(width1<0);
        
        System.out.println("Enter number of rows in Matrix A");
        do{                                                            
            while(!scan.hasNextInt()){                                 
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            length1=scan.nextInt();
            if(length1<0){
                System.out.println("You must enter integers greater than 1. Try again.");
            }//else if
        }while(length1<0);
        
        System.out.println("Enter number of columns in Matrix B");
        do{                                                            
            while(!scan.hasNextInt()){                                 
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            width2=scan.nextInt();
            if(width2<0){
                System.out.println("You must enter integers greater than 1. Try again.");
            }//else if
        }while(width2<0);
        
        System.out.println("Enter number of rows in Matrix B");
        do{                                                            
            while(!scan.hasNextInt()){                                 
                System.out.println("You must enter only integers. Please try again.");
                scan.next();
            }//while
            length2=scan.nextInt();
            if(length2<0){
                System.out.println("You must enter integers greater than 1. Try again.");
            }//else if
        }while(length2<0);
        if(length2!=width1){
            System.out.println("Error: inner matrix dimensions must agree. Please enter again.");
        }//if
        }while(length2!=width1);
        
        
        int[][] matrix1=randomMatrix(width1,length1);
        System.out.println("Matrix A is:");
        printMatrix(matrix1);
        
        int[][] matrix2=randomMatrix(width2,length2);
        System.out.println("Matrix B is:");
        printMatrix(matrix2);
        
        int[][] product=matrixMultiply(matrix1,matrix2);
        System.out.println("The product of A*B is:");
        printMatrix(product);
        
    }//main method
    
    public static int[][] randomMatrix(int cols,int rows){
        Random rand=new Random();
        int[][] matrix=new int[rows][];
        for(int r=0;r<rows;r++){
            matrix[r]=new int[cols];
            for(int c=0;c<cols;c++){
                matrix[r][c]=rand.nextInt(21)-10;
            }//inner for
        }//outer for
        return matrix;
    }//randomMatrix
    
    public static void printMatrix(int[][] array){
        int rows,cols;
        rows=array.length;
        cols=array[0].length;
            for(int i=0;i<rows;i++){
                System.out.printf("[   ");
               for(int j=0;j<cols;j++){
                   if(array[i][j]<0&&array[i][j]>-10||array[i][j]>9&&array[i][j]<100){
                       System.out.printf("\b%d     ",array[i][j]);
                    }else if(array[i][j]>99||array[i][j]<-9&&array[i][j]>-100){
                       System.out.printf("\b\b%d     ",array[i][j]);
                    }else if(array[i][j]<-99){
                       System.out.printf("\b\b\b%d     ",array[i][j]);
                    }else{
                       System.out.printf("%d     ",array[i][j]);
                    }
               } //inner for
               System.out.println("\b\b]");
            }//outer for
    }//printMatrix
    
    public static int[][] matrixMultiply(int[][] A, int[][] B){
        int rows1=A.length;
        int cols1=A[0].length;
        int rows2=B.length;
        int cols2=B[0].length;
        if(cols1!=rows2){
            System.out.println("Matrix dimensions do not match. Cannot Multiply.");
            return null;
        }//end if
        int prodRow=rows1;
        int prodCol=cols2;
        int[][] prod=new int[prodRow][];
        int val;
        for(int r=0;r<prodRow;r++){
            prod[r]=new int[prodCol];
            for(int c=0;c<prodCol;c++){
                int i=0;
                val=0;
                while(i<cols1){
                    val+=A[r][i]*B[i][c];
                    i++;
                }//while
                prod[r][c]=val;
            }//inner for
        }//outer for
        return prod;
    }//matrixMultiply
    
}//end class