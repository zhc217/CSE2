
import java.util.Scanner;

public class timeSheets { // define a class
    public static void main(String [] args) { // define a main method
        
      Scanner myScanner = new Scanner( System.in);//declare an instance
      
      System.out.println("Enter the total number of employees");
      
      int employee = myScanner.nextInt(); // call method nextLn()
      
      int counter = 0; // initialize the counter to zero
     
      double totalpayroll = 0; // initialize totalpayroll
      
      while ( counter = employee ) { // keep asking inputs when counter is less than employee
          
          System.out.println("Enter pay per hour"); 
          double pay = myScanner.nextDouble(); // call method nexDouble
          
          System.out.println("Enter working hours on Monday");// prompt user input hours on monday
          int m = myScanner.nextInt(); // call method nextInt()
          
         
          System.out.println("Enter working hours on Tuesday");// prompt user input hours on Tuesday
          int t = myScanner.nextInt(); // call method nextInt()
          
          
          System.out.println("Enter working hours on Wednesday");// prompt user input hours on Wednesday
          int w = myScanner.nextInt(); // call method nextInt()
          
          
          System.out.println("Enter working hours on Thursday");// prompt user input hours on Thursday
          int r = myScanner.nextInt(); // call method nextInt()
          
          
          System.out.println("Enter working hours on Friday");// prompt user input hours on Friday
          int f = myScanner.nextInt(); // call method nextInt()
          
          totalpayroll = totalpayroll + (m+t+w+r+f)*pay; // calculate the total pay roll
          
          counter =  counter + 1; // decrease the counter
          
      }
       
       System.out.println("The total payroll is" + totalpayroll); // print out total payroll
       
     
    }
}