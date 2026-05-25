package day30;

import java.util.Arrays;

public class ThreeSum {

    static int[] getTriplet(int[] arr,int target){
        int[] result={-1,-1,-1};
        //outer loop
        for (int i = 0; i < arr.length-2 ; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                for (int k = j+1; k <arr.length  ; k++) {
                    int sum=arr[i]+arr[j]+arr[k];
//                    System.out.print(arr[i]+" + "+arr[j] +" + "+arr[k]+"="+ sum+ " ,");
                    if( sum==target)
                    {
                       result[0]=arr[i];
                        result[1]=arr[j];
                        result[2]=arr[k];
                    }

                }
//                System.out.println();
            }

        }
         return result;
    }

    public static void main(String[] args) {
        int[] arr={2,-1,5,7,9,8,3};
        int[] result=getTriplet(arr,6);
        System.out.println(Arrays.toString(result));
    }
}
