//Zhiyi Chen
//lab04
//Calculator
//9/18/2015

import java.util.Scanner;

public class Calculator { //define a public class
    
    public static void main(String [] args) { //define a main method
        
        Scanner myScanner = new Scanner( System.in);//declare an instance
        
        System.out.print("Enter an integer a"); //prompt user to imput a
        
        int a = myScanner.nextInt();//call method nextDouble
        
        
        System.out.print("Enter another inteter b"); //prompt user to imput b
        
        int b = myScanner.nextInt(); //call method nextDouble
        
        
        System.out.print("Enter an operation(*,/,+,-)"); //prompt user to imput calculation method
        
        String sign = myScanner.next(); //call method nextChar
        
       switch (sign) { //call method Swith
           
           case "*": System.out.println("output is" + (a * b) ); //if hits *, print out multipulation result
           break; //return to buttom
           
           case "/": System.out.println("output is" + (a / b) ); //if hits /, print out divid result
           break; //return to buttom
           
           case "+": System.out.println("output is" + (a + b) ); //if hits +, print out addition result
           break; //return to buttom
           
           case "-": System.out.println("output is" + (a - b) ); //if hits -, print out subtraction result
           break; //return to buttom
           
           default: System.out.println("ilegal");
           break; //return to buttom
       }
 
      
   
    }
}