//Zhiyi Chen
//Sept 4
//lab 2

//define a class
public class Cyclometer {
public static void main(String [] args) {
    int secsTrip1 = 480; // store the number of minutes in trip one
    int secsTrip2 = 3220; //store the number of minutes in trip two
    int countsTrip1 = 1561; //number of rotations in trip one
    int countsTrip2 = 9037; //number of rotations in trip two
    double wheelDiameter = 27.0;//the diameter of bicycle wheel
    double PI = 3.14159; //define a PI
    int feetPerMile = 12;// convertion between feet and foot2
    int inchesPerFoot = 12;//convertion between inche and foot
    int secondsPerMinute = 60; //convertion between seconds and minutes
    double distanceTrip1, distanceTrip2, totalDistance;//define total distance
    
    System.out.println("Trip 1 took" + (secsTrip1/secondsPerMinute) + "minutes and had "+countsTrip1 +"counts.");// print out info of trip 1
    System.out.println("trip 2 took" + (secsTrip2/secondsPerMinute) + "minutes and had "+countsTrip2 +"counts.");// print out info of trip 2
    distanceTrip1 = countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //Above gives distance in inches
    distanceTrip2 = countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // distance in miles for trip 2
    //print out the output data
    totalDistance = distanceTrip1 + distanceTrip2; //total distance is sum of 1 and 2
    System.out.println ("Trip 1 was" +distanceTrip1 + "miles"); //print out trip one miles
    System.out.println ("Trip 2 was" +distanceTrip2 + "miles"); //print out trip two miles
    System.out.println ("The total distance was" +totalDistance +"miles"); //print out total distance
    }
}