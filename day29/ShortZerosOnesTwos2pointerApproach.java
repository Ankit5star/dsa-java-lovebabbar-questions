package day29;

public class ShortZerosOnesTwos2pointerApproach {
    static int[] shortArr(int[] arr){
       int low=0;
       int mid=0;
       int high= arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0){
                arr[low]=arr[mid]^arr[low];
                arr[mid]=arr[mid]^arr[low];
                arr[low]=arr[mid]^arr[low];
                low++;
                mid++;
                System.out.println(" executed");
            }
           else if(arr[mid]==1){
               mid++;
            }
           else{
                arr[mid]=arr[mid]^arr[high];
                arr[high]=arr[mid]^arr[high];
                arr[mid]=arr[mid]^arr[high];
                high--;
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,1,0,2,0,1,0};
        shortArr(arr);
        for(int num: arr){
            System.out.print(num+" ,");
        }
    }
}
