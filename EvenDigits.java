public class EvenDigits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {11, 45, 64, 88, 43, 65, 98};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
}
