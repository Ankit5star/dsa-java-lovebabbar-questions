package day27;
import java.util.HashSet;

public class ArrayIntersectionElementHW {
 static HashSet<Integer> getIntersection(int[] arrOne, int[] arrTwo) {
    HashSet<Integer> intersectionElements=new HashSet<>();
    HashSet<Integer> set=new HashSet<>();

    //wea re storing the intersection and if it fail then we are storing in intersectionElement
    for (int num:arrOne)
    {
       set.add(num);
    }
    for (int num:arrTwo){
       if(set.contains(num)){
        intersectionElements.add(num);
       }
    }


    return  intersectionElements;
    }

    public static void main(String[] args) {
       int[] arrOne ={1,2,3,4,5,9};
       int[] arrTwo ={7,8};

       System.out.println( getIntersection(arrOne,arrTwo));
    }


}
