package Searching;
public class RotatedCount {

    public static int rotatedCount(int[] arr) {
        int pivot = findPivot(arr);
        /* if (pivot == -1) {
            //Array is not rotated
            return 0;
        } */
        return pivot + 1;
    }
    
    //use this for non-duplicates
    public static int findPivot(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        for (; start <= end;) {
            
            //find mid element
            int mid = start + (end - start) / 2;

            //check for 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    //use this for duplicates
    public static int findPivotWithDuplicates(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        for (; start <= end;) {
            
            //find mid element
            int mid = start + (end - start) / 2;

            //check for 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //if elements at mid, start and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //NOTE: what if these elements at start and were the pivots
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, pivot is in right side
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        // int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int ans = rotatedCount(arr);
        System.out.println(ans);
    }
}
