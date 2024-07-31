package Searching;
public class FindMin {

    // public static int max(int[] arr) {
    //     int max = arr[0];

    // }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {19, 10, 78, -6, 45, 6, 79, 12};
        int min = min(arr);
        int max = max(arr);
        System.out.println(min);
        System.out.println(max);
    }
}
