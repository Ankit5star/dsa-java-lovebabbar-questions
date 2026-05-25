package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LowestHighestFrequencyInArray {
    static void lowHighFq(int[] arr){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println(map);
        System.out.println("high");
        int max=Integer.MIN_VALUE;
        for(int key: map.keySet())
        {
            max= Math.max(max,map.get(key));

        }
        System.out.println(max);


    }

    public static void main(String[] args) {
        int[] arr={2,2,3,3,3,4,4,5,3,7,7,5};
        System.out.println(getHigLowFreq(arr));
    }
    static  HashMap<Integer,Integer> getHigLowFreq(int[] arr){
        HashMap<Integer,Integer> map =new HashMap<>();
        HashMap<Integer,Integer> highLow=new  HashMap<>();
         for(int i=0;i< arr.length;i++)
          {
               if(map.containsKey(arr[i]))
               {
                map.put(arr[i], map.get(arr[i])+1) ;
               }
               else{
                   map.put(arr[i],1);
               }
          }
        System.out.println(map);
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         int faceMin=-1;
         int faceMax=-1;
         for(Map.Entry<Integer,Integer>entry:map.entrySet())
         {
             int key=entry.getKey();
             int value= entry.getValue();
             if(value>max){
                 max=value;
                 faceMax=key;

             }
             if(value<min){
                 min=value;
                 faceMin=key;

             }
         }
         highLow.put(faceMax,max);
         highLow.put(faceMin,min);
         return highLow;
    }


}


