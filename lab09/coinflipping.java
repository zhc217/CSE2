//Zhiyi Chen
//lab09
//10/23
import java.util.Random; //define a path
import java.util.Scanner; // define a path

public class coinflipping { // define a class
     int h=0; // initialize h
     int t=0; // initialize t
     
     
     public static void  flip() { // define a flip method
       
        Random randomGenerator = new Random(); // call new Random
        int randomInt = randomGenerator.nextInt(2);//call method nextInt
        
        if (randomInt == 1) { // determine the head or tail
        
            System.out.println("Tail"+randomInt);// print out tail
            
        }
        
        else { 
           
            System.out.println("Head"+randomInt); //print our head
          
    }
 }
    
    
    
    public static void flip(int n) { // define a method
        Random randomGenerator = new Random(); // generate random number
        int c=0; // initialize counter
        for (int i=1; i<n; i++) {
            int randomInt = randomGenerator.nextInt(2);// call method nextInt(2)
            if (randomInt == 1) {c++;} //count heads
        
        
        }
        System.out.println("The number of head is" + c); //print out number of heads
        System.out.println("The number of tail is" + (n-c));//print out number of tails
        
    }
        
    
    
    public static void main(String [] args) { // define a main method
        Scanner myScanner = new Scanner(System.in); 
        System.out.println("Enter a number between 0 and 100");//prompt user to input
        int n = myScanner.nextInt(); // call method nextInt()
        
        if (n==0){
            flip(); // call method
        }
        if (n>100){
            System.exit(0); // end the program
        }
        
        else { 
            flip(n) ; // call method flip()
        }
    }

    
}
