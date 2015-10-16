//Zhiyi Chen
// Oct 16
//lab08

import java.util.Scanner; 

public class Method { // declare a class

    public static void main(String [] args) {// declare a main method

    
        Scanner myScanner = new Scanner(System.in);
    
        double x = 0; //initialize x
        int n = 0; // initialize counter

        
        double median1 = 0;// initialize median1 =0
        double median2 = 0; //initialize median2 =0
        double sum = 0;// initialize sum=0
        
        System.out.println("Enter 10 numbers"); //prompt user to input number
        
        for(int i = 0; i < 10; i++){ // count 10 times
            
            x = myScanner.nextDouble();// call method nexDouble
            sum += x;// add x to sum itself
            
            if ( i ==4 ) {median1 = x;} //find median1
        
           if (i ==5) {median2 = x;}// find median2

        }
        
        double mean = mean(sum); //define method(sum)
        
        double median = median(median1, median2);// define method(median1,median2)
        
        print(mean, median);// call method print

    }
    
    public static double mean(double sum) { // declare mean method
        double m = (sum/10); // calculate mean
        return m; //return on m
    }
    
    public static double median( double m1, double m2) {// declare median method
        double median = ((m1 +m2)/2);// calculate median 
        return median;// return on median
    }
    
    public static void print(double mean, double median) { // declare print method
        System.out.println("The mean is" + mean + "."+ "The median is" +median);
        //print out mean and median
    }
    
    
}