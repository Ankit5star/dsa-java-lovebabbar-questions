package day27;

public class MaxElementInArray {
    static int maxElement(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(max<i)
            {
                max=i;
            }

        }return max;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,55,78,99,62,12,113215};
        System.out.println(maxElement(arr));
    }
}
