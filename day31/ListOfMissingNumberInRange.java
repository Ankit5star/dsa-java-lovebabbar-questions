package day31;

import java.util.ArrayList;

public class ListOfMissingNumberInRange {
    /*
      Given an integer array arr of size n where each element lies in the range 1 to n, and some elements may appear
      twice while others are missing, return all the missing numbers in the array.

      Requirements:

     Time Complexity: O(n)
      Space Complexity: O(1) (excluding output list)
     */


    static ArrayList<Integer> getMissingList(int[] arr){
        ArrayList<Integer> missing= new ArrayList<>();
        for(int i=0;i< arr.length;i++ ){
            int index=Math.abs(arr[i])-1;
            arr[index] =-Math.abs(arr[index]);


        }
     for(int j=0;j< arr.length;j++){
         if(arr[j]>0){
             missing.add(j+1);
         }
     }
    return missing;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,4,3,7};

        System.out.println(getMissingList(arr));
    }
}
