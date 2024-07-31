public class BSIn2DArray {

    public static boolean search(int[][] arr, int target) {
        //search every row for the target element
        for (int row = 0; row < arr.length;) {

            //checking if the target element is present in the row
            if (arr[row][binarySearch(arr[row], target)] == target) {
                //if yes then return an array of the index of the target element in the matrix
                return true;
            } else {
                //if no increament the row index
                row++;
            }
        }
        return false;
    }

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
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50},
            {35, 39, 42, 66}
        };
        int target = 42;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }
}
