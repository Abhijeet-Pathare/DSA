package hashtable.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2{

    // WRITE THE TWOSUM MEHTOD HERE //
    public static int[]twoSum(int[] nums , int target){
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int num = nums[i];
            int complement = target - num;
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement),i};
            }
            numMap.put(num,i);
        }
        return new int[]{};
    }


    //NAIVE APPROACH
//    public static int[] twoSum(int[] nums,int target){
//        int[] result = new int[2];
//        for(int i=0;i< nums.length;i++){
//            int sum = 0;
//            for(int j = i+1;j< nums.length;j++){
//                sum = nums[i]+nums[j];
//                if(sum==target){
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

}
