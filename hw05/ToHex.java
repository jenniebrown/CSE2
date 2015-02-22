//Jennifer Brown
//CSE2
//Homework 5
//21 Feb 2015

//create a program that converts user entered decimal RGB numbers to hexadecimal

import java.util.Scanner;       //import scanner

public class ToHex{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);    //accept input from STDIN
        System.out.println("Please enter three numbers representing RGB values:");  //ask user for three input values
        int R,G,B;      //declare user input decimal RGB values
        if(!scan.hasNextInt()){ //check if first input is integer
            System.out.println("Value must be an integer.");
            return;//terminate program
        } else {
            R=scan.nextInt();   //assign decimal R
        }
        if(R<0||R>255){
            System.out.println("Value must be between 0 and 255."); //check range
            return;
        }
         if(!scan.hasNextInt()){    //check if second input is integer
            System.out.println("Value must be an integer.");
            return;//terminate program
        } else {
            G=scan.nextInt();   //assign decimal G
        }
        if(G<0||G>255){
            System.out.println("Value must be between 0 and 255."); //check range
            return;
        }
         if(!scan.hasNextInt()){    //check if third input is integer
             System.out.println("Value must be an integer.");
             return;    //terminate program
         } else {
             B=scan.nextInt();  //assign decimal B
         }
         if(B<0||B>255){    //check range
             System.out.println("Value must be between 0 and 255");
             return;    //terminate program
         }
        int R1=(int)(R/16); //calculate first R character
        int R2=R%16;    //calcualte second R character
        int B1=(int)(B/16); //calculate first B character
        int B2=B%16;        //calculate second B character
        int G1=(int)(G/16); //calculate first G character
        int G2=G%16;        //calculate second G character
        String hex=" ";
        if(R1<10){
            hex=Integer.toString(R1);
        } else {
            switch(R1){
            case 10:
                hex="A";
                break;
            case 11:
                hex="B";
                break;
            case 12:
                hex="C";
                break;
            case 13:
                hex="D";
                break;
            case 14:
                hex="E";
                break;
            case 15:
                hex="F";
                break;
            default:
                break;
            }//end switch
        }//end else
        if(R2<10){
            hex=hex+Integer.toString(R2);
        } else {
            switch(R2){
            case 10:
                hex=hex+"A";
                break;
            case 11:
                hex=hex+"B";
                break;
            case 12:
                hex=hex+"C";
                break;
            case 13:
                hex=hex+"D";
                break;
            case 14:
                hex=hex+"E";
                break;
            case 15:
                hex=hex+"F";
                break;
            default:
                break;
            }//end switch
        }//end else
        if(G1<10){
            hex=hex+Integer.toString(G1);
        } else {
            switch(G1){
            case 10:
                hex=hex+"A";
                break;
            case 11:
                hex=hex+"B";
                break;
            case 12:
                hex=hex+"C";
                break;
            case 13:
                hex=hex+"D";
                break;
            case 14:
                hex=hex+"E";
                break;
            case 15:
                hex=hex+"F";
                break;
            default:
                break;
            }//end switch
        }//end else
        if(G2<10){
            hex=hex+Integer.toString(G2);
        } else {
            switch(G2){
            case 10:
                hex=hex+"A";
                break;
            case 11:
                hex=hex+"B";
                break;
            case 12:
                hex=hex+"C";
                break;
            case 13:
                hex=hex+"D";
                break;
            case 14:
                hex=hex+"E";
                break;
            case 15:
                hex=hex+"F";
                break;
            default:
                break;
            }//end switch
        }//end else
        if(B1<10){
            hex=hex+Integer.toString(B1);
        } else {
            switch(B1){
            case 10:
                hex=hex+"A";
                break;
            case 11:
                hex=hex+"B";
                break;
            case 12:
                hex=hex+"C";
                break;
            case 13:
                hex=hex+"D";
                break;
            case 14:
                hex=hex+"E";
                break;
            case 15:
                hex=hex+"F";
                break;
            default:
                break;
            }//end switch
        }//end else
        if(B2<10){
            hex=hex+Integer.toString(B2);
        } else {
            switch(B2){
            case 10:
                hex=hex+"A";
                break;
            case 11:
                hex=hex+"B";
                break;
            case 12:
                hex=hex+"C";
                break;
            case 13:
                hex=hex+"D";
                break;
            case 14:
                hex=hex+"E";
                break;
            case 15:
                hex=hex+"F";
                break;
            default:
                break;
            }//end switch
        }//end else
       System.out.println("The decimal numbers R:"+R+" G:"+G+" B:"+B+" are represented by the hexidecimal number "+hex);
        
        
        
    }//end main method
    
    
    
}//end class