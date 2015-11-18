//Zhiyi Chen
//lab12
// Nov 13
import java.util.Scanner;

public class move_array {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] list;
        int n = myScanner.nextInt(); // call method nextInt()
        
        try { double e = 5/n; // catch 0
        }
        catch (ArithmeticException e ) { 
            System.out.println("invalid input");
            System.exit(0);
        }
        
        try {list=new int[n]; // catch negative value
        }
        catch (RuntimeException e) {
            System.out.println("invalid input");
            System.exit(0);
        }
        list=new int[n];
    for (int i=0;i<n;i++) {
       list[i] = (int)(Math.random()*100); // generate number
       System.out.print(list[i] +" "); // print out array
    }
   
    System.out.println("Enter the value of index");
    int index = myScanner.nextInt(); // call method nextInt
   
    try {
       int tem = list[index]; // check negative value
        }
    catch ( RuntimeException e) {
        System.out.println("invalid input");
        System.exit(0);
    }
    int tem = list[index];  // store number at position of index
    for (int j=index;j<list.length-1;j++)
    {
    list[j]=list[j+1]; // increament number
    }
    list[list.length-1]=tem; // place number indexed at the end of array
    for (int a=0; a<list.length; a++) {
        System.out.print(list[a] + " "); // print out array
    }
}
}
    
    