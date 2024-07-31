package Searching;
public class SmallestLetter {
    public static char smallestLetter(char[] letters, char target) {
        // simple binary search algo
        int start = 0;
        int end = letters.length - 1;

        for (; start <= end;) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //check
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        
    }
}
