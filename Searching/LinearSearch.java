package Searching;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        // int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // ans = arr[i];
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 88, 89, 6, 71, 49, 87, 64};
        int arr = linearSearch(a, 6);
        System.out.println(arr);
    }
}
