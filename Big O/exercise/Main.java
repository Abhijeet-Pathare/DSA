package exercise;

import java.util.*;


public class Main {

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    public static String firstNonRepeatingChar(String str){
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : chars){
            if(map.get(ch)<2){
                return String.valueOf(ch);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

}