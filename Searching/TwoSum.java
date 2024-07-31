package Searching;
import java.util.Arrays;

//https://leetcode.com/problems/two-sum/description/

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        /* int a = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > a){
                if ()
                a += nums[i];
            }
        } */

        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] ans = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
    }
}
