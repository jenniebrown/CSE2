//Jennifer Brown
//CSE 2
//30 Jan 2015
//Lab 02

//Program will calculate and output number of minutes, counts, and distance of bicycle trips for given inputs.

public class Cyclometer {
    
    public static void main(String[] args) {
        //trip info   
        int tTrip1=480;
        int tTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9037;
        //declare&assign conversion constants
        double wheelDiameter=27.0,  //inches
        pi=3.14159,
        feetPerMile=5280,           //ft/mi
        inchesPerFoot=12,           //in/ft
        secondsPerMinute=60;        //s/min
        //declare output variables
        double distanceTrip1, distanceTrip2, totalDistance;
        //print time and counts
        System.out.println("Trip 1 took "+(tTrip1/secondsPerMinute)+" minutes and had "+(countsTrip1)+" counts.");
        System.out.println("Trip 2 took "+(tTrip2/secondsPerMinute)+" minutes and had "+(countsTrip2)+" counts.");
        //calculate distance
        distanceTrip1=wheelDiameter*pi*countsTrip1/inchesPerFoot/feetPerMile;   //gives distance in miles
        distanceTrip2=wheelDiameter*pi*countsTrip2/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip2+distanceTrip1;
        //print distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total trip was "+totalDistance+" miles.");
        
    }   //end of main method
    
    
    
}   //end of class