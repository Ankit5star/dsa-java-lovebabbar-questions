package day30;

import java.util.HashSet;

public class FirstRepeatingNo {
    static int getRepeatingNo(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int num: arr) {
            if(set.contains(num)){
                return num;
            }
            else{
                set.add(num);
            }
        }
         return -1;
        }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,0};
        System.out.println(getRepeatingNo(arr));
    }
}
