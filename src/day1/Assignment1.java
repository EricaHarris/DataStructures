package day1;

import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {
        int[] integers = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(integers);
    }

    public static void reverseArray(int[] arr){

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
