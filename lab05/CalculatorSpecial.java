// Zhiyi Chen
//lab05
//Sept 25

import java.util.Scanner;

public class CalculatorSpecial { // define a public class
    public static void main(String [] args) { // define a main method
    
        Scanner myScanner = new Scanner( System.in);//declare an instance
        
        boolean e = true;// initialize it's true
        while (e == true) { // while it's true, doing the calculation
       
       
        System.out.println("Enter an integer a"); //prompt user to imput a
        
        int a = myScanner.nextInt();//call method nextDouble
        
        
        System.out.println("Enter another inteter b"); //prompt user to imput b
        
        int b = myScanner.nextInt(); //call method nextDouble
        
        
        System.out.println("Enter an operation(*,/,+,-)"); //prompt user to imput calculation method
        
        String sign = myScanner.next(); //call method nextChar
        
        String n, N,i;// define data type
        
       
        
       switch (sign) { //call method Swith
           
           case "*": System.out.println("output is" + (a * b) ); //if hits *, print out multipulation result
           break; //return to buttom
           
           case "/": System.out.println("output is" + (a / b) ); //if hits /, print out divid result
           break; //return to buttom
           
           case "+": System.out.println("output is" + (a + b) ); //if hits +, print out addition result
           break; //return to buttom
           
           case "-": System.out.println("output is" + (a - b) ); //if hits -, print out subtraction result
           break; //return to buttom
           
           default: System.out.println("ilegal");// if not other, print out illegal
           break; //return to buttom
       }
       
       System.out.println("Type n or N to stop");
       
       i = myScanner.next();//call method next()
       
       if ( i.equals("n") || i.equals("N") ) {
           
            e = false;//turns false if n or N is imputed
       
        }
        }
    }
}
        
