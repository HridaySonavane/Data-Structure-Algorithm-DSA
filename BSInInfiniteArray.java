public class BSInInfiniteArray {

    public static int ans(int[] arr, int target) {
        //first find the range
        //start with a box size of 2
        int start = 0;
        int end = 1;

        //check if the target lies in the range
        //if lies in range apply Binary Search
        //otherwise increase the box size
        for (; target > arr[end];) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return infiniteSortedArray(arr, target, start, end);
    }
    
    public static int infiniteSortedArray(int[] arr, int target, int start, int end) {

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
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int ans = ans(arr, 23);
        System.out.println("your target lies the " + ans + " " + "index");
    }
}
