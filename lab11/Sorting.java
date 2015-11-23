 public class Sorting { // define a class
    
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
  
    
    public static void sort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
           
        }
         printNumbers(array);
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("");
}
}