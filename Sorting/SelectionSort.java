package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int largest = 0;    // this largest is NOT the value of the largest element in the arr but the INDEX of it

            //getting the index of the largest element in the array
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] > arr[largest]) {
                    largest = j;
                }

            }

            //basic swap program
            int temp = arr[largest];
            arr[largest] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;


        }
    }
}
