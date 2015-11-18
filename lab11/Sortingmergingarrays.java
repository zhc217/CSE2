//Zhiyi Chen
//lab11
//11/6
public class Sortingmergingarrays { // define a class
    
    public static void main(String [] args) { // define a main method
    
    int [] array1 = new int[20]; // create an array that has length of 20
    int [] array2 = new int[10];// create an array that has length of 10
    
    for(int i = 0; i<20; i++) { 
        array1[i] = (int)(Math.random()*100); // fill out number into each position of array
    
     }
     System.out.println("START Array 1: ");
     sort(array1);// call method sort
     System.out.println("END Array 1: ");
    
    
    
    for(int j = 0; j<10;j++) {
        array2[j] = (int)(Math.random()*100); // fill out number into each position of array
    }
    System.out.println("START Array 2: ");
    sort(array2);
    System.out.println("END Array 2: ");
    
    
    int [] array3 = new int[30];// create arrays of length 30
    for (int h = 0; h<20; h++) {
        array3[h] = array1[h];
    }
    for (int k =20; k<30; k++) {
        array3[k] = array2[k-20];
    }
    System.out.println("Start of array3");
    sort(array3);// sort array3
    System.out.println("End of array3");
    }
    
    
   
    public static void sort(int[] array) {
        //public static void sort(int[] array) {
     for (int z=array.length; z>1; z--) {
         int max =0; int index = 0; int sub = 0; // define max, index and sub
         for (int x = 0; x<z; x++) {
             if (array[x]>max) { 
                 max =array[x];
                 index = x;
         }
         sub = array[z-1];
         array[z-1]=max;
         array[index]=sub;
         }
         for (int y = 0; y<array.length; y++ ) {
             System.out.println(array[y]+ ""); // print out fixed array.
         }
    }
    }
}
    