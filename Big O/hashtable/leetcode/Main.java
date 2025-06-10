package hashtable.leetcode;

import java.util.*;


public class Main {

    static List<List<String>> groupAnagrams(String[] strings){
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strings){
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);
            if(map.containsKey(sortedString)){
                List<String> values = map.get(sortedString);
                values.add(str);
                map.put(sortedString,values);
            }else{
                List<String> values = new ArrayList<>();
                values.add(str);
                map.put(sortedString,values);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            List<String> values = entry.getValue();
            result.add(values);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

}
