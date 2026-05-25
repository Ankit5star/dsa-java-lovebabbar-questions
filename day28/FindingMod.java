package day28;

import java.util.HashMap;
import java.util.Map;

public class FindingMod {
    // arr= {1,1,1,1,2,2,3,3,4,4,5,6,7,7,8.8}
    // highest occouring element become mode
    static int getMod(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int num:arr){
//            if(map.containsKey(num))
//            {
//                map.put(num,map.get(num)+1);
//            }
//            else{
//                map.put(num,1);
//            }
//        }

        //simple way to do the above thing

        for(int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        int mode=0;
        int frequency=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            int key=entry.getKey();
            int value=entry.getValue();
            if(frequency<value){
                frequency=value;
                mode=key;
            }

        }

        return mode;
    }

    public static void main(String[] args) {
       int[] arr= {1,1,1,1,2,2,3,3,4,4,5,6,7,7,8,8};
        System.out.println("Mode =  "+getMod(arr));
       

    }


}
