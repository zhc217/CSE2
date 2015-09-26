// Zhiyi Chen
//hw05 
//sept 26

import java.util.Scanner; 

public class averageGrade { //define a public class
    public static void main(String [] args) { // define a main method
        
        Scanner myScanner = new Scanner (System.in); // declare an instance
        
        boolean e = true; // initialize true
        double grade = 0; // initialize grade to be zero
        int i = 1; // set counter
        double b; // define statement 999
        while ( e == true ) { // keep prompting user to improt number if true
           System.out.println("Enter a grade"); // prompt user to enter a grade
           double g = myScanner.nextDouble(); // call method nextDouble
           if (0 < g && g < 100) { // check if the number imported is eligible
               grade = grade + g; // cumulating grade entered
           i = i + 1; // decrease counter
           }
           else {
               System.out.println("Invaid grade has been imported");// print out invaid
               
           }
          
          System.out.println("Enter 999 to exit"); // print out statement of exit
          b = myScanner.nextDouble(); // define a method nexDouble
          
          if (b == 999 ) { e = false;} // turns false if 999 is presented
        }
           
          double Avegrade = grade / i; // calculating average grade
           System.out.println("Average grade is" + Avegrade); //print out average grade
          
    }
}