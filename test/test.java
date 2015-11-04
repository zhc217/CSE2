public class test {

public static void main(String args []) {

int [] array1 = new int[10];
int [] array2 = new int[5];

for (int i=0; i<10; i++) {

array1[i]=(int)(Math.random() *22);
System.out.println(array1[i]);
}
for (int n=0;n<=4;n++) {
array2[n]=array1[2*n];
System.out.println(array2[n]);
}


}
}