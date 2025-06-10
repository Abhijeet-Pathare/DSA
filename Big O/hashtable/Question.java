package hashtable;

import java.sql.Time;
import java.util.HashMap;
import java.util.Timer;

public class Question {

    public static boolean  itemInCommon(int[] array1,int[] array2){
        for(int i : array1){
            for(int j : array2){
                if(i == j) return true;
            }
        }
        return false;
    }

    public static boolean  itemInCommon1(int[] array1,int[] array2) {
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();
        for(int i : array1){
            myHashMap.put(i,true);
        }

        for(int j : array2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,5};
        System.out.println(itemInCommon(arr1,arr2));
        System.out.println(itemInCommon1(arr1,arr2));
    }
}
