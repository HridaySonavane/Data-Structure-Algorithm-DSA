package Searching;
public class FloorNumber {
    //ceiling number means the number greater than or equal to the target
    public static int floor(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }
        
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
        return end;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
}
