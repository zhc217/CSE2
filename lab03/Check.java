// Zhiyi Chen
// Lab03
// Sep 11
// define a class

import java.util.Scanner;

public class Check { // define public class

    public static void main(String [] args) {  //define a main method
        
        
        Scanner myScanner = new Scanner( System.in );//declare an instance of the Scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx:");// prompt user to key in money
        double checkCost = myScanner.nextDouble();//call method nextDouble
        
        System.out.print("Enter the percenttage tip that you wish to pay as a whole number (in the form xx)");//prompt user to key in tip percentage
        double tipPercent = myScanner.nextDouble();//call method nextDouble
        
        tipPercent /= 100;//convert percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner");//prompt user to key in number of people having dinner
        
        int numPeople = myScanner.nextInt();//define number inputed int
        double totalCost;//define data type of totalCost
        double costPerPerson;//define data type of costPerPerson
        int dollars; //whole dollar amount of cost
        
        double dimes;//for defining dimes data type
        double pennies;//for storing digits
        totalCost = checkCost * (1+tipPercent);//find out total Cost after tip
        costPerPerson = totalCost/ numPeople;//cost per person is total cost divided by number of people
        dollars = (int) costPerPerson;//get integer of dollars
        dimes = (int)(costPerPerson *10) %10;//find out dimes
        pennies = (int) (costPerPerson *100)%10;//find out pennies
        
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        //print out the cost per person in dollar, dime and penney
        
        
    
    
    }
}