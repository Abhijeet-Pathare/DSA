/**
 * Problem: Count digits
 * ip: 9235
 * op: 4
 *
 * ip: 42
 * op 2
 *
 * ip: 7
 * op: 1
 */

public class CountDIgits {
    public static void count(int x){
        int res = 0;
        while(x>0){
            x/=10; // Remove the last digit
            res++; // Increment result by 1
        }
        System.out.println("Number of digits are "+res);
    }

    //Second approach: faster and good for large numbers
    public static void countUsingLog10(int x){
        int count = (int)Math.log10(x)+1;
        System.out.println("Number of digits are "+count);
    }
    public static void main(String[] args) {
        int x = 9235;
        count(x);
        countUsingLog10(x);
    }
}
