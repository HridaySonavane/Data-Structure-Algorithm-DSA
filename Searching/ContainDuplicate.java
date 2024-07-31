package Searching;
//https://leetcode.com/problems/contains-duplicate/

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
