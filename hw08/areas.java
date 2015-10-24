//Zhiyi Chen
//10/24
//HW08
import java.util.Scanner; 
public class areas { // declare a class

public static void area(double radius) {
  
  double Acircle =  (radius*radius*3.14); // calculate the area of circle
  System.out.println("The area of circle is" +Acircle); // print out the area of circle
  
}

public static void area(double height, double width) {
  double Arectangle = (height* width); // calculate the area of circle
  System.out.println("The area of rectangle is" + Arectangle); //  print out the area of rectangle
  
}

public static void area(double base1, double base2, double length) {
  double Atrapezoid = ((base1+base2)*length*0.5); // calculate the area of trapezoid
  System.out.println("The area of trapezoid is" + Atrapezoid); // print out the area of trapezoid

  
}
  
  public static void main(String [] args) { // declare a main method
      
      boolean e = true; // initialize e is true
      while (e == true) { // keep looping it when e is true
      
      Scanner myScanner = new Scanner(System.in); 
      System.out.println("Enter a shape(circle, rectangle or trapezoid. Enter STOP to exit"); //prompt user to input a shape
      String shape = myScanner.next(); // call method next()
      switch (shape) {
        
      case "circle":
     
          System.out.println("Enter radius of the circle to be computed"); //prompt user to input the radius of circle
          double radius = myScanner.nextDouble(); // call method nextdouble
          area(radius); // call method area(radius)
          break;
          
      case "rectangle":
      
          System.out.println("Enter the width and height of the rectangle to be computed"); //prompt user to input the height and width of the rectangle
          double height = myScanner.nextDouble(); // call method nextdouble
          double width = myScanner.nextDouble(); // call method nextdouble
          area(height, width); // call method area(height, width)
          break;
          
      case "trapezoid":
       
        System.out.println("Enter the base1, base2 and height of the trapezoid to be computed"); // prompt user to input the parameters of trapezoid
        double base1 = myScanner.nextDouble(); // call method nextdouble
        double base2 = myScanner.nextDouble(); // call method nextdouble
        double length = myScanner.nextDouble(); // call method nextdouble
        area(base1,base2,length); // call method area(base1,base2,height)
        break;
      case "STOP":
        System.exit(0); //exit the program
        
        default: e = true; // re run the program
      }
      }
    
      }
}
