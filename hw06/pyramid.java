//Zhiyi Chen
//hw06
//10/3

import java.util.Scanner;

public class pyramid {
    public static void main(String [] args) { // declare a main method
       Scanner myScanner = new Scanner(System. in ); // declare an instance
       
       System.out.println("What is the size of pyramid ?"); // prompt user to import size of pyramid
       
       int s = myScanner.nextInt(); // call method nextInt
      
       int i,j; //define variable i(line counter),j
      
       for (i = 1; i<=s; i++) { // looping it when 1 < i < s
           for (j=1; j<=s-i; j++) { // printing out s-i number of space
               System.out.print(" ");// print out spaces
            
           }
           
           for (j=1; j<=2*i-1; j++){ //printing out 2i-1 number of stars
               System.out.print("*"); //print out stars
           }
           
           System.out.println(""); // return 
           
       }
      
    }
}