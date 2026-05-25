package day28;

public class ShiftElementByNPosition {
    /*
     problem statement :
     lets suppose you have given a array where you need to shift element by n postion

     if n is negative that means left shift if
     and if n is positve that means right shift


     */
    static void shiftElements(int[] arr, int n) {

        // if n is positive right shift
        if(n>0)
        {
            for (int turn = 0; turn <n% arr.length; turn++) {
                int imdNext = arr[arr.length - 1];
                for (int i = 0; i < arr.length; i++) {

                    arr[i] = imdNext^arr[i];
                    imdNext= imdNext^arr[i];
                    arr[i] = imdNext^arr[i];

                }

            }
         }
        else  {

                for (int turn = 0; turn < Math.abs(n)% arr.length ; turn++) {
                int imdNext = arr[0];
                for (int i = arr.length-1; i >= 0; i--) {
                    arr[i] = imdNext^arr[i];
                    imdNext= imdNext^arr[i];
                    arr[i] = imdNext^arr[i];

                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 8, 9};
        shiftElements(arr,2);
        for (int i : arr) {
            System.out.println(i);

        }
    }
}