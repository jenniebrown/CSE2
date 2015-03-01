//Jennifer Brown
//CSE2
//Lab 6
//2/27/15

//make smile generator, use loops

public class SmileGenerator{    //class
    public static void main(String[] args){     //main method
        for(int i=0; i<5; i++){     //print 5 smiley faces using for loop
                System.out.print(":) ");
        }//end for
        System.out.printf("\n");
        
        int j=0;
        while(j<5){ //print 5 smiley faces using while loop
            System.out.print(":) ");
            j++;
        }//end while
        System.out.printf("\n");
        
        int k=0;
        do{     //print 5 smiley faces using do-while loop
            System.out.print(":) ");
            k++;
        } while(k<5);
        System.out.printf("\n");
        
        int smile=(int)(Math.random()*101);     //make random number of smiley faces
        System.out.println(smile);
        for(int m=0;m<(smile);m++){
            System.out.print(":) ");
        }//end for
        System.out.printf("\n");
        
        for(int n=0;n<smile;n++){       //use same random number of smiley faces; print only 30 per line
            if(n==30||n==60||n==90){
                System.out.printf("\n");
            }//end if
            System.out.print(":) ");
        }//end for
        System.out.printf("\n");
        
        int x=0;
        int line=1;
        while(x<smile){
            for(int y=0;y<line;y++){
                System.out.print(":) ");
                if(y+x==(smile-1)){
                    return;
                }//end if
            }//end for
            System.out.printf("\n");
            x=x+line;
            line++;
        }//end while
        System.out.printf("\n");
    }//end main method
    
}//end class