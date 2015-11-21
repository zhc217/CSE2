//Zhiyi Chen
//lab13
//11/20
import java.util.Scanner;
public class Rectangle { // define a class
    double width;// initialize width
    double height;// initialzie height
    public static void main(String [] args) { // declare a main method
        Rectangle r1 = new Rectangle();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter width and height"); // prompts user to input values
        double x = myScanner.nextDouble(); // call mehtod nextDouble
        double y = myScanner.nextDouble(); // call method nextDouble
        r1.setHeight(y); // call method setHeight
        r1.setWidth(x); // call method setWidth
        System.out.println(r1.getArea());// print out area
            
        }
        public void setWidth(double x) {width=x;} // method setWidth
        public void setHeight(double y) {height =y;} // methd setHeight
        public double getArea() { // getArea 
            return (width*height);} // return area
        }

