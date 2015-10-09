//Zhiyi Chen
// 10/9
//lab07

import java.util.Scanner; 

public class encrypeted_x { // define a class
    public static void main(String [] args) { // define a main method
        
        Scanner myScanner = new Scanner(System.in );
        System.out.println("enter the size of side"); // prompt user to input size
        int input = myScanner.nextInt(); // call method nextLnt
        if (input<0 || input >100){ // check the range
            System.exit(-1); // if not in the range of 0-100 exit program
        }
            else{
                int i,j,k;// declare variable
                
                for (i=1;i<=input; i++) { // determines how many lines will be printed out
                
                for (j=1; j<=input; j++) { // printing out input-i number of space
                
                if(j==i || j == input-i+1) {// when at position i and input-1+1
               System.out.print(" ");// print out spaces
                }
                else{
                System.out.print("*"); // print out stars
                }
                
                }
               
                System.out.println("");// start new line
            }
            
    }
}
}
