package day30;

import java.util.Arrays;

public class RemoveDuplicateUsingPointerMethod {

    static int getUniqueElements(int[] arr) {

        if (arr.length == 0)
            return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4};

        int length = getUniqueElements(arr);

        System.out.println("Unique Length: " + length);

        System.out.print("Unique Elements: ");

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}