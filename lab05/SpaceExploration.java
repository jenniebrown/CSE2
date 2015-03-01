//Jennifer Brown
//CSE2
//2/27/15
//lab 5

//make program that uses fallthrough of switch statements to output history of space exploration between 2000 and a random year

//import java.util.random();  //import random


public class SpaceExploration{  //class
    public static void main(String [] args){        //main method
    int year=(int)(Math.random()*11)+2000;  //make random year between 2000 and 2010
    switch(year){   //use switch to print out what happened in year. 
        case 2010:
            System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");    //fall through so it prints everything after case
        case 2009:
            System.out.println("2009: N/A");
        case 2008:
            System.out.println("2008: Kepler launched to study deep space");
        case 2007:
            System.out.println("2007: N/A");
        case 2006:
            System.out.println("2006: Spacecraft returns with collections from a comet");
        case 2005:
            System.out.println("2005: Spacecraft collies with comet");
        case 2004:
            System.out.println("2004: N/A");
        case 2003:
            System.out.println("2003: Largest infrared telescope released");
        case 2002:
            System.out.println("2002: N/A");
        case 2001:
            System.out.println("2001: First spacecraft lands on asteroid");
        case 2000:
            System.out.println("2000: First spacecraft orbits an asteroid");
            break;
    }//end switch
        
        
    }//end main method
    
}//end class