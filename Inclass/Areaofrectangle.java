
public class Interest {
//define a public class
public static void main(String [] args) {
    //define a main method
    
    int p =3, q = 1, sum =0;
    while (p <= 10)
    {
        sum += p%q;
        p++;
        q++;
    }
}
}