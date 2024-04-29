public class MountainArray {
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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 4, 3, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
