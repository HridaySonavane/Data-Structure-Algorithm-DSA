public class searchInRange {

    public static int range(int[] arr, int target) {
        for (int i = 1; i <= 4; i++) {  //instead of manually inputing the range we can also use "2-pointer"
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {19, 10, 78, -6, 45, 6, 79, 12};
        int target = 45;
        int ans = range(arr, target);
        System.out.println(ans);

    }
}
