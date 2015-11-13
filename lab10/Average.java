// Zhiyi Chen
// Oct30
//lab10

import java.util.Scanner;
import java.util.Random;

public class Average { // declare a class

public static void main(String [] args) {
    Scanner myScanner = new Scanner (System.in);
    System.out.println("Enter n of values that are to be stored in an array"); //prompt user to enter n numbers to be stored
    
    int n =  Scanner.nextInt(); // call method nextInt()
    
    int [] mylist = new int[n]; // create an array that has length of n
    
    for (int i = 0; i<n; i++) { 
        mylist[i] = (int)(Math.random()*100); // fill out number into n positions of array
        System.out.println(mylist[i]); // print out each value at corresponding slot of mylist.
        
    }
    int sum =0; //initialize sum equal 0
    for (int a = 0; a<n; a++) {
        sum = sum + mylist[a];
        }
        System.out.println("The sum of the array is "+ sum);// print out the sum of the array
        double average = sum/n; // calculate average of array
        
        for (int b = 0; b<n; b++) {
            if (mylist[b]>= average)
        {
            System.out.println("The numbers that are greater or equal to average are" +mylist[b]);
        }
        }
    
}
}
