import java.math.BigInteger;

/***
 * Problem: Factorial of a number
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 * 0! = 1 (by definition)
 */

public class Factorial {
    //Using for loop
    public static void fact(int x){
        int res = 1;
        for(int i=x;i>0;i--) {
           res = res * i;
        }
        System.out.println(res);
    }

    // Recursive Approach
    public static int recFact(int x){
        if(x==0){ // Base Case
            return 1;
        }else{
            return x*recFact(x-1); //Recursive case
        }
    }

    public static void factLargeNumbers(int x){
        BigInteger fact = BigInteger.ONE;
        for(int i = 2;i<=x;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        int x = 10;
        fact(x);
        int y = 100;
        factLargeNumbers(y);
    }

}
