package day30;

import java.util.Arrays;

public class TwoSum {
    /*
    Given an array of integer and integer target we need to return those pair whose sum is equal to the target
    and the there only one pair exist
     */

    static int[] getPairs(int[] arr, int target) {
        int[] pairs = {-1, -1};// default value if the traget is not found;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    pairs[0] = arr[i];
                    pairs[1] = arr[j];
                }
            }

        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, -5};

        int[] result = getPairs(arr, -8);


        if (result[0] == -1 && result[1] == -1) {
            System.out.println("No pairs exists");
        }
        else{
            System.out.println(Arrays.toString(result));
        }
    }
}