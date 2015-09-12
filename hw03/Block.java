//Zhiyi Chen
//HW03
//Sep 12
//Problem2

import java.util.Scanner;

public class Block { //define class 

   public static void main(String [] args) {
      
      Scanner myScanner = new Scanner( System.in);// declare an instance for Scanner
       
      System.out.println("Enter the length of the block:"); //prompt the user to enter length of block
      double length = myScanner.nextDouble();//call method nextDouble
      
      System.out.println("Enter the width of the block:");//prompt the user to enter width
      double width = myScanner.nextDouble();// call method nextDouble
      
      System.out.println("Enter the height of the block:");//prompt the user to enter height
      double height = myScanner.nextDouble();// call method nextDouble
      
      double volume;//define data type of volume
      double surfacearea;// defina data type of surfacearea
      
      volume = length * width * height;//calculate the volume
      
      System.out.println("The volume of block of dimension" + length + "x"+ width + "x"+ height + "x"+ volume );
      //print out volume under certain values of dimensions
      
      surfacearea = length*width*2 + length*height*2 +width*height*2;//calculate surfacearea
      
      System.out.println("The surface area of the block is"+ surfacearea);//print out surfacearea
      
   }
}