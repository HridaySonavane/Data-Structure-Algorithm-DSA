public class OrderAgnosticBS {

    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[end] > arr[start]) {
            for (; start <= end;) {
                //find the middle element
                int mid = start + (end - start) / 2;
    
                //check
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid - 1;
                } else {
                    //answer found
                    return mid;
                }
            }
        }

        if (arr[end] < arr[start]) {
            for (; start <= end;) {
                //find the middle element
                int mid = start + (end - start) / 2;
    
                //check
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid - 1;
                } else {
                    //answer found
                    return mid;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {90, 88, 45, 34, 23, 22, 9, 3, 2, 1};
        int target = 9;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
}
