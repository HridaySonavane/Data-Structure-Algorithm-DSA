public class CeilingNumber {
    //ceiling number means the number greater than or equal to the target
    public static int ceilingNumber(int[] arr, int target) {

        //what if the target number is greater than the largest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        
        // simple binary search algo
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
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceilingNumber(arr, target);
        System.out.println(ans);
    }
}
