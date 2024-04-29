public class FindInMountainArray {
    public static int findInMountainArray(int[] arr, int target) {

        //first find peak index
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
            if (start == end) {    //if the start and end value becomes the same we've found our peak index

                int newMid = mid;
                
                for (start = 0, end = newMid; start <= end;) {    //first perform binary search in the left hand side of the peak index
                    newMid = start + (end - start) / 2;

                    if (target < arr[newMid]) {
                        end = newMid - 1;
                    } else if (target > arr[newMid]) {
                        start = newMid + 1;
                    } else {
                        //answer found
                        return newMid;
                    }
                }

                for (start = mid, end = arr.length - 1; start <= end;) {    //if not found in the left hand side, then perform binary search in the right hand side
                    mid = start + (end - start) / 2;
                    
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    } else {
                        //answer found
                        return mid;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 11, 23, 24, 25, 13, 10, 9, 7, 6, 3, 1};
        int target = 9;
        int ans = findInMountainArray(arr, target);
        System.out.println(ans);
    }
}
