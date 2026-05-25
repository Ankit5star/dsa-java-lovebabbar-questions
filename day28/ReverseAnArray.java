package day28;

public class ReverseAnArray {
    static void reverseArray(int[] arr){
        int end= arr.length-1;
        for (int start=0;start< arr.length/2;start++){
         arr[start]=arr[start]^arr[end];// int temp=arr[end]; or arr[start]= arr[start]+ arr[end]
         arr[end]=arr[start]^arr[end];//arr[end]=arr[start]; or arr[end]= arr[start]- arr[end]
         arr[start]=arr[start]^arr[end];// arr[start] = temp; or arr[start]= arr[start]- arr[end]
         end--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        reverseArray(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
