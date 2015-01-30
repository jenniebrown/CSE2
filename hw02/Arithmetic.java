//Jennifer Brown
//CSE 2
//30 Jan 2015
//Homework 2

//Create calculator for tax and total cost of purchases

public class Arithmetic {
    
    public static void main(String[] args) {
        //input number of items purchased
        int nSock=3;
        int nGlass=6;
        int nEnvelope=1;
        //input cost of items
        double sockCost$=2.58;
        double glassCost$=2.29;
        double envCost$=3.25;
        //sales tax
        double tax=.06;
        //calculate cost of each item type before tax
        double totSockCost$=sockCost$*nSock;
        double totGlassCost$=glassCost$*nGlass;
        double totEnvCost$=envCost$*nEnvelope;
        //calculate total tax on each item type
        double taxSock$=totSockCost$*tax;
        double taxGlass$=totGlassCost$*tax;
        double taxEnv$=totEnvCost$*tax;
        //calculate purchase totals
        double totPurchase=totSockCost$+totGlassCost$+totEnvCost$;  //purchase total before tax
        double totTax=taxSock$+taxGlass$+taxEnv$;   //total tax on purchase
        double grandTotal=totPurchase+totTax;       //total cost of items plus tax
        
        //print purchase total
        System.out.println(+nSock+" pairs of socks at $"+sockCost$+" each");    //output number and cost of socks
        System.out.println("Sock total before tax = $"+totSockCost$);           //print sock total on separate line
        System.out.printf("Tax on socks = $%.2f \n",taxSock$);                 //print sock tax rounded to two decimal places
        System.out.println(+nGlass+" glasses at $"+glassCost$+" each");         //output number and cost of classes
        System.out.println("Glasses total before tax = $"+totGlassCost$);       //output glasses total
        System.out.printf("Tax on Glasses = $%.2f \n",taxGlass$);              //print glasses tax rounded to two decimal places
        System.out.println(+nEnvelope+" box of envelopes at $"+envCost$+" each");   //output number and cost of envelopes
        System.out.println("Envelope total before tax = $"+totEnvCost$);            //print envelope total
        System.out.printf("Tax on Envelopes = $%.2f \n",taxEnv$);                   //print tax on envelopes rounded to two decimal places
        System.out.println("Purchase total before tax = $"+totPurchase);            //print purchase total before tax
        System.out.printf("Total tax = $%.2f \n",totTax);                           //print total tax rounded to two decimal places
        System.out.printf("Purchase total including tax = $%.2f \n",grandTotal);    //print grand total rounded to two decimal places
        
        
        
    }   //end main method
    
    
    
}   //end class