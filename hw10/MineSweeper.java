//Zhiyi Chen
//11/07
//hw10

import java.util.Scanner;

public class MineSweeper { // declare a class
   public static void main(String [] args) {
       
       Scanner myScanner =  new Scanner (System.in); 
       
       System.out.println("Enter the dimension of array"); //prompt user to input the dimension of array.
       int n = myScanner.nextInt(); // call method nextlnt
      
       System.out.println("Enter the number of mines to be placed on"); //prompt user to input the # of mines.
       int m = myScanner.nextInt(); // call method nextlnt
       
       String array [] [] = new String[n][n]; 
       int x =0;
       int y =0;
       for (int c=0; c<m; c++) {
            array [x] [y] = "";
             x = (int)(Math.random()*n);
             y = (int)(Math.random()*n);
            if (array [x] [y] =="") {
        array[x] [y] = "M"; 
            } 
       }
       int a = 0;
       for (int i=0;i<n;i++){
           for (int j=0;j<n;j++) {
               
               if (array [0][0] == "M") { // left upper corner
                   array [i+1][j] = Integer.toString(a+1);
                   array [i+1][j+1] = Integer.toString(a+1);
                   array [i] [j+1] = Integer.toString(a+1);
               }
               
               else if ( array [n-1][0] =="M") { // right upper corner
                   array [i] [j+1] = Integer.toString(a+1);
                   array [i-1] [j] = Integer.toString(a+1);
                   array [i-1] [j+1] =Integer.toString(a+1);
               }
               else if ( array [n-1][n-1] == "M") { // right bottom corner
                  array[i-1][j] = Integer.toString(a+1);
                  array[i-1][j-1] = Integer.toString(a+1);
                  array [i][j-1] = Integer.toString(a+1);
               }
               else if (array [0][n-1] =="M") { // left bottom corner
               array[i][j-1] = Integer.toString(a+1);
               array[i+1][j-1] = Integer.toString(a+1);
               array[i+1][j] = Integer.toString(a+1);
               }
               
               else if (array [i][0] == "M") { // upper edge
                  array [i+1][0] =Integer.toString(a+1);
                  array [i-1][0] =Integer.toString(a+1);
                  array [i][j+1] =Integer.toString(a+1);
               }
               else if (array [i][n-1]== "M") { // bottom edge
                   array [i][j-1] = Integer.toString(a+1);
                   array [i-1][j] = Integer.toString(a+1);
                   array [i+1][j] = Integer.toString(a+1);
               }
               else  if (array [0] [j] =="M") { // left edge
                   array [i+1][j] = Integer.toString(a+1);
                   array [i][j-1] = Integer.toString(a+1);
                   array [i][j+1] = Integer.toString(a+1);
               }
               else if (array [n-1][j] == "m") { // right edge
                   array [n-1][j+1] = Integer.toString(a+1);
                   array [n-1][j-1] = Integer.toString(a+1);
                   array [n-2][j] = Integer.toString(a+1);
               }
               
                   
               else  { // other places in matrix
                   array [i+1] [j] = Integer.toString(a+1);
                   array [i-1] [j] = Integer.toString(a+1);
                   array [i] [j+1] = Integer.toString(a+1);
                   array [i] [j-1] = Integer.toString(a+1);
                   array [i+1][j+1] =Integer.toString(a+1);
                   array [i-1][j-1] =Integer.toString(a+1);
                   array [i+1][j-1] =Integer.toString(a+1);
                   array [i-1][j-1] =Integer.toString(a+1);
                   
                   
               }
               
               
               
           }
       }
   }
}