package day29;

import java.util.Arrays;
import java.util.TreeSet;

/*
given series [0,n],---> total number of entries n+1
 */
public class FindMissingFromTheSeries {
    static int getMissingNumber(int[] arr,int n){
        Arrays.sort(arr);
         for(int i=0;i<=n;i++){
           if(arr[i]!=i){
               return i;
           }

        }

       return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5,6};

        System.out.println(getMissingNumber(arr,7));
    }
}
