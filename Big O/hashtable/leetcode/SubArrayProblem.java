package hashtable.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubArrayProblem {

    // WRITE SUBARAYSUM METHOD HERE //
    public static int[] subarraySum(int[] arr, int target){
        Map<Integer,Integer> sumIndex = new HashMap<>();
        sumIndex.put(0,-1);
        int currentSum = 0;
//        int[] nums1 = {1, 2, 3, 4, 5};
//        int target1 = 9;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(sumIndex.containsKey(currentSum-target)){
                return new int[]{sumIndex.get(currentSum-target)+1,i};
            }else{
                sumIndex.put(currentSum,i);
            }
        }
        return new int[]{0,0};
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println("[]");

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

        */

    }

}
