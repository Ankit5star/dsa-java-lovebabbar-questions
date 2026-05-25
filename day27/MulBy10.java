package day27;

public class MulBy10 {
    //Muliply each element of array by 10
    static void mulBy10(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]=arr[i]*10;
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        mulBy10(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
