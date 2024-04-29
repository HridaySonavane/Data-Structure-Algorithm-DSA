import java.util.Arrays;

public class searchIn2DArray {

    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {11, 12, 13, 14, 15},
            {21, 22, 23, 24, 25}
        };

        int target = 24;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
