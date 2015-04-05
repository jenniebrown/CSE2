//Jennifer Brown
//CSE2
//lab08
//27 Mar 2015

//use several methods to generate random words using random number generator and switch statements

import java.util.Random;
import java.util.Scanner;

public class MadLibs{
    public static void main(String[] args){
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        int r;
        do{
        String sentence="The ";
        for(int i=0;i<6;i++){
            switch(i){
                case 0:
                    sentence=sentence+adj(rand);
                    break;
                case 1:
                    sentence=sentence+adj(rand);
                    break;
                case 2:
                    sentence=sentence+subj(rand);
                    break;
                case 3:
                    sentence+=verb(rand);
                    break;
                case 4:
                    sentence=sentence+"the "+adj(rand);
                    break;
                case 5:
                    sentence+=obj(rand);
                    break;
            }
            
        }
        System.out.println(sentence);
        System.out.println("Would you like another sentence? Enter 'y' or 'Y' for yes, anything else to exit.");
        String repeat=scan.next();
        
        switch(repeat){
            case "Y":
            case "y":
                r=1;
                break;
            default:
                r=0;
                break;
        }
        }while(r==1);
    }//end main method
    public static String adj(Random rand){
        int a=rand.nextInt(10);
        String adjective="";
        switch(a){
            case 0:
                adjective="random ";
                break;
            case 1:
                adjective="crazy ";
                break;
            case 2:
                adjective="silly ";
                break;
            case 3:
                adjective="talented ";
                break;
            case 4:
                adjective="misguided ";
                break;
            case 5:
                adjective="purple ";
                break;
            case 6:
                adjective="yummy ";
                break;
            case 7:
                adjective="lonely ";
                break;
            case 8:
                adjective="ugly ";
                break;
            case 9:
                adjective="rich ";
                break;
        }//end switch
        return adjective;
    }//end adj
    
    public static String subj(Random rand){
        int a=rand.nextInt(10);
        String noun="";
        switch(a){
            case 0:
                noun="witch ";
                break;
            case 1:
                noun="sandwich ";
                break;
            case 2:
                noun="toaster ";
                break;
            case 3:
                noun="platypus ";
                break;
            case 4:
                noun="scarecrow ";
                break;
            case 5:
                noun="freshman ";
                break;
            case 6:
                noun="method ";
                break;
            case 7:
                noun="exam ";
                break;
            case 8:
                noun="child ";
                break;
            case 9:
                noun="llama ";
                break;
        }//end switch
        return noun;
    }//end subj
    
    public static String verb(Random rand){
        int a=rand.nextInt(10);
        String verb="";
        switch(a){
            case 0:
                verb="entered ";
                break;
            case 1:
                verb="left ";
                break;
            case 2:
                verb="insulted ";
                break;
            case 3:
                verb="mimicked ";
                break;
            case 4:
                verb="irritated ";
                break;
            case 5:
                verb="hazed ";
                break;
            case 6:
                verb="drowned ";
                break;
            case 7:
                verb="encouraged ";
                break;
            case 8:
                verb="consoled ";
                break;
            case 9:
                verb="ridiculed ";
                break;
        }//end switch
        return verb;
    }//end verb
    
    public static String obj(Random rand){
        int a=rand.nextInt(10);
        String n="";
        switch(a){
            case 0:
                n="artist.";
                break;
            case 1:
                n="hipster.";
                break;
            case 2:
                n="giraffe.";
                break;
            case 3:
                n="sushi.";
                break;
            case 4:
                n="grandpa.";
                break;
            case 5:
                n="pickle.";
                break;
            case 6:
                n="fox.";
                break;
            case 7:
                n="teenager";
                break;
            case 8:
                n="magazine";
                break;
            case 9:
                n="reptile";
                break;
        }//end switch
        return n;
    }
}//end class