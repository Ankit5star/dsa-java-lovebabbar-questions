package day27;

public class LinearSearch {
    static boolean isFound(int[] arr,int target){
        for(int i: arr) {
            if (i == target) {
                return true;
            }
        } return false;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6,7,8,9};
        System.out.println(isFound(arr,2));
    }

}
