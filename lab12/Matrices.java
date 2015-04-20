//Jennifer Brown
//CSE2
//lab 12
//17 April 2015

//practice using column- and row- major matrices


import java.util.Random;

public class Matrices{
    public static void main(String[] args){
        Random rand=new Random();
        int length1=rand.nextInt(5)+1;
        int width1=rand.nextInt(5)+1;
        int length2=rand.nextInt(5)+1;
        int width2=rand.nextInt(5)+1;
        
        boolean formatA=true;
        boolean formatB=false;
        boolean formatC=true;
        
        int[][] A,B,C;
        A=increasingMatrix(length1,width1,formatA);
        B=increasingMatrix(length1,width1,formatB);
        C=increasingMatrix(length2,width2,formatC);
        
        System.out.println("Generating matrix A with length "+length1+" and width "+width1+":");
        printMatrix(A,formatA);
        System.out.println("Generating matrix B with length "+length1+" and width "+width1+":");
        printMatrix(B,formatB);
        System.out.println("Generating matrix C with length "+length2+" and width "+width2+":");
        printMatrix(C,formatC);
        
        System.out.println("Adding matrices A and B:");
        int[][] sum1=addMatrix(A,formatA,B,formatB);
        if(sum1!=null){
        printMatrix(A,formatA);
        System.out.println("plus");
        printMatrix(B,formatB);
        System.out.println("equals");
        printMatrix(sum1,formatA);
        }//if
        
        System.out.println("Adding matrices A and C:");
        int[][] sum2=addMatrix(A,formatA,C,formatC);
        if(sum2!=null){
        printMatrix(A,formatA);
        System.out.println("plus");
        printMatrix(C,formatC);
        System.out.println("equals");
        printMatrix(sum2,formatA);
        }//if
    }//main method
    
    public static int[][] increasingMatrix(int rows, int cols, boolean format){
            int[][] matrix;
            int val=1;
            if(format){
                 matrix=new int[rows][];
                 for(int i=0;i<rows;i++){
                     matrix[i]=new int[cols];
                     for(int j=0;j<cols;j++){
                        matrix[i][j]=val;
                        val++;
                     }//inner for
                 }//outer for
            }else{
                matrix=new int[cols][];
                 for(int i=0;i<rows;i++){
                     for(int j=0;j<cols;j++){
                         if(i==0){
                         matrix[j]=new int[rows];
                         }
                         matrix[j][i]=val;
                         val++;
                     }//inner for
                 }//outer for
            }// if-else
            return matrix;
    }//increasingMatrix
    
    public static void printMatrix(int[][] array, boolean format){
        int rows,cols;
        if(format==true){
            rows=array.length;
            cols=array[0].length;
            for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
                   System.out.print(array[i][j]+" ");
               } //inner for
                System.out.println();
            }//outer for
        }else{
            cols=array.length;
            rows=array[0].length;
            for(int i=0;i<rows;i++){
              for(int j=0;j<cols;j++){
                  System.out.print(array[j][i]+" ");
              } //inner for
                System.out.println();
            }//outer for 
        }//if-else
    }//printMatrix
    
    public static int[][] translate(int array[][]){
        int[][] transArray;
        int cols=array.length;
        int rows=array[0].length;
        transArray=new int[rows][];
        for(int r=0;r<rows;r++){
            transArray[r]=new int[cols];
            for(int c=0;c<cols;c++){
                transArray[r][c]=array[c][r];
            }//inner for
        }//for
        return transArray;
    }
    
    public static int[][] addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb){
        int lengtha,widtha,lengthb,widthb;
        lengtha=a.length;
        widtha=a[0].length;
        lengthb=b.length;
        widthb=b[0].length;
        boolean lengthReq,widthReq;
        if(formata==formatb){
             lengthReq=lengtha==lengthb;
             widthReq=widtha==widthb;
        }else{
            lengthReq=lengtha==widthb;
            widthReq=lengthb==widtha;
        }//if-else
        int[][] bTrans;
        if(!lengthReq||!widthReq){
            System.out.println("Matrices cannot be added.");
            return null;
        }else if(formata && !formatb){
            bTrans=translate(b);
        }else{
            bTrans=b;
        }//else if
        int[][] sum=new int[lengtha][];
        for(int r=0;r<lengtha;r++){
            sum[r]=new int[widtha];
            for(int c=0;c<widtha;c++){
                sum[r][c]=a[r][c]+bTrans[r][c];
            }//inner for
        }//outer for
        return sum;
    }//addMatrix
    
}//class