package Searching;
public class SearchInRotatedArray {
    public static int search(int[] arr, int target) {

        //find the pivot of the rotated array
        int peak = peakIndexInMountainArray(arr);

        int searchRight = binarySearch(arr, target, 0, peak);
        
        if (searchRight != -1) {
            return searchRight;
        }
        
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {

        //simple BinarySearch code
        int start = 0;
        int end = arr.length - 1;

        for (; start <= end;) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check
            //if the middle value is greater than its next value, change the end value to mid
            if (arr[mid + 1] < arr[mid]) {
                end = mid;
            } else if (arr[mid + 1] > arr[mid]) {   //if the mid value is less than its next value, change the start value to that next value
                start = mid + 1;
            }
            if (start == end) {    //if the start and end value becomes the same we've found our answer
                //answer found
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

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
        int[] arr = {7, 21, 54, 98, 0, 1, 2, 3, 4, 5, 6,};
        int target = 1;
        int ans = search(arr, target);
        System.out.println(ans);
    }
}
