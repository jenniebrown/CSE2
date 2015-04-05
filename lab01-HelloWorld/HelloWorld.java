//Jennie Brown
//Lab 01
//Hello World Java Program
//
//  define a class
import java.util.Scanner;
public class HelloWorld{
    
//  add main method
    public static void main(String[] args){
        
//         int day=4;
// //  print the statement with box around it
//         System.out.println("######################");
//         System.out.println("######################");
//         System.out.println("#                    #");
//         System.out.println("# Hello World 2014!! #");
//         System.out.println("#                    #"+(1+1)+day);
//         System.out.println("######################");
//         System.out.println("######################");

Scanner scan=new Scanner(System.in);

for(int i=0;i<10;i++){
    if(i<5){
    for(int j=0;j<=i;j++){
        System.out.print(i);
    }
    }else{
        for(int k=10-i;k>0;k--){
            System.out.print(i);
        }
    }
    System.out.println("");
}

}//end main method

    
}//end class
