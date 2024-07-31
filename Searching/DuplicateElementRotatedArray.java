public class DuplicateElementRotatedArray {
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
        int[] arr = {2, 2, 9, 2, 2, 2, 2, 2, 2};
        int ans = findPivotWithDuplicates(arr);
        System.out.println(ans);
    }
}
