package day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ListMissingFromArrayOfDuplicate {
    /*
    we are given a array of integers and each element is in the range [1,n] and some elements are duplicates
    we need to list missing integer list
    and the space complexity is O(1)
    and time complexity is O(n);
    */
    static ArrayList<Integer> getMissing(int[] arr) {
        ArrayList<Integer> missing = new ArrayList<>();
//        Arrays.sort(arr);
//        int actualElement = 1;
//        for (int num : arr) {
//            if ((actualElement != num)) {
//                missing.add(actualElement);
//
//                actualElement++;
//            } else {
//                actualElement++;
//
//            }
//        }

        //method 2
//        HashSet<Integer> actualList= new HashSet<>();
//        for(int num:arr){
//            actualList.add(num);
//        }
//        for (int i=1; i<= arr.length;i++) {
//            if(!actualList.contains(i)){
//                missing.add(i);
//            }
//
//        }

        // actual logic for any number from 1 to n the ideal postion is n-1
        // so if we mark each element negative
        // when we loop those index which is no negative is missing wo we simply return their postion+1 as output of missing

        //visited
        for(int i=0;i< arr.length;i++)
        {
            int index= Math.abs(arr[i])-1;
             arr[index]=-Math.abs(arr[index]);
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
        System.out.println(getMissing(arr));
    }
}
