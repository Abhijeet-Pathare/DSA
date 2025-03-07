/**
 * Problem: Palindrome number
 * ip: n = 78987
 * op: yes
 * ip: n = 8668
 * op: yes
 * ip: n = 8
 * op: yes
 */

public class Palindrome {
    public static void isPalindrome(int x){
        int temp = x;
        int rev = 0;
        while(temp>0){
            int lastDigit = temp % 10;// Get the last digit
            rev = (rev * 10) + lastDigit;// Append digit to reversed
            temp = temp/10; // Remove the last digit
        }
        if(rev == x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int x = 757;
        isPalindrome(x);
    }
}

/**
 Steps:
 Reverse the number by extracting digits.
 Compare the reversed number with the original.
 If both are the same, it’s a palindrome
 */