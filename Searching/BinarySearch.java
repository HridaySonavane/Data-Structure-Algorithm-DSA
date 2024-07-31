package Searching;
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        
        //define the "start" and "end" pointers
        int start = 0;
        int end = arr.length - 1;

        for (; start <= end;) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //answer found
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ans = binarySearch(arr, 7);
        System.out.println(ans);
    }
}
