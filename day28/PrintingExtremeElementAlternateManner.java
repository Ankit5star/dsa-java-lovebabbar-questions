package day28;

public class PrintingExtremeElementAlternateManner {
    static void printExtAltElement(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            // swap
            System.out.print(arr[left]+" ");
            System.out.print(arr[right]+" ");
            left++;
            right--;
        }
        if(left == right) {
            System.out.print(arr[left]);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        printExtAltElement(arr);
    }
}
