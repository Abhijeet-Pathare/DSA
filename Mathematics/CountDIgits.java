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
    public static void main(String[] args) {
        int x = 9235;
        count(x);
    }
}
