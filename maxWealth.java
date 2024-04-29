public class maxWealth {

    public static int maximumWealth(int[][] arr) {

        int ans = Integer.MIN_VALUE;
        
        //iterate over every element in a 2D array
        for (int row = 0; row < arr.length; row++) {

            int sum = 0;

            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {3, 2, 1}
        };

        int wealth = maximumWealth(arr);
        System.out.println(wealth);
    }
}
