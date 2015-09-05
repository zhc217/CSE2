//define a class
public class Arithmetic {
//define a method 
public static void main(String [] args) {
    //Number of pairs of socks
    int nSocks = 3;//define cost per pair of socks
    double sockCost$ = 2.58; //define Number of drinking glasses
    int nGlasses = 6; //define Cost per glass
    double glassCost$ = 2.29; //define Number of boxes of envelopes
    int nEnvelopes = 1; //define cost per box of envelopes
    double envelopeCost$ = 3.25; //define cost per envelopes
    double taxPercent = 0.06; //define tax persent
    double totalcostofsocks, totalcostofglasses, totalcostofenvelopes, tax;// define variables
    
    totalcostofsocks = (int) nSocks * sockCost$ *100;//calculate total cost of socks
    double total1 = totalcostofsocks/100; // round two digits
   
    totalcostofglasses = (int) nGlasses *glassCost$*100; //calculate total cost of glasses
    double total2 = totalcostofglasses/100; //round two digits
    
    totalcostofenvelopes = (int) nEnvelopes * envelopeCost$*100; //calculate total cost of envelopes
    double total3 = totalcostofenvelopes/100; // round two digits 
   
    System.out.println("Total cost of socks is $"+ (total1));//print cost of socks
    System.out.println("Total cost of glasses is $" + (total2));//print cost of glasses
    System.out.println("Total cost of envelopes is $" + (total3));//print cost of envelopes
    
    double tax1 = (int) total1 * taxPercent * 100;//tax of socks
    double socktax = tax1/100; //round to two digits
    
    double tax2 = (int) total2 * taxPercent * 100;//tax of glasses
    double glasstax =  tax2/100; //round to two digits
    
    double tax3 = (int) total3 * taxPercent * 100;//tax of envelopes
    double envelopetax = tax3/100;//round to two digits
    
    
    System.out.println("sale tax of socks is $" + socktax );//print tax of sock
    System.out.println("sale tax of glasses is $" + glasstax);//print tax of glasses
    System.out.println("sale tax of envelopes is $" + envelopetax);//print tax of envelopes
    double totalpurchases = (int) (total1 + total2 + total3)*100; //total cost of purchase
    double total4 = totalpurchases/100; //round to two digits
    System.out.println("total cost of purchase is $" + total4);//print total cost of purchase
    tax = (int) total4 * taxPercent*100;//total tax paid
    double taxpaid = tax/100;// round to two digits 
    System.out.println("acutal payment is $"+(total4 + taxpaid));//print out total actual payment
    
    
}
}
    