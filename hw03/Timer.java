//Zhiyi Chen
//HW03
//Sep 12
//Problem 1
import java.util.Scanner;// set scanner
public class Timer {  //define a class
    public static void main(String [] args) { //define a main method
       
        Scanner myScanner = new Scanner( System.in);//declare an instance of the scanner
        
        System.out.println("Enter the current time (in the form HHMM)");//prompt user to type in time
        int currenttime = myScanner.nextInt();//call method nextint
        
        System.out.println("Enter the time that you will be eating dinner (in the form of HHMM)");//prompt user to type in dinning time
        int dinningtime = myScanner.nextInt();//call method nextint
        
        double timeleft = dinningtime - currenttime;//calculate the time remian
        
        double hours;//define hours
        double minutes;//dfeine minutes
        
        hours = (int) (timeleft/100); //findout hours
        
        minutes = (int) ((timeleft/100-hours)*100); //findout minutes
        
        System.out.println("You have" + hours + "hours and" + minutes +"minutes until dinner");// print out remain time
    }
        
        
}