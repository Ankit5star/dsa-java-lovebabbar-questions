package day32;

public class KadanesAlgorithm {
    /*
    Maximum sub array
     Given an integer of array nums find the subarray with the largest sum
     and return its sum.

    */
 // bruteforce approach

//    static int getLargestSum(int[] arr)
//    {
//        int maxSum=Integer.MIN_VALUE;
//        for(int i=0;i< arr.length;i++){
//            int sum=0;
//            for (int j = i; j < arr.length; j++) {
//
//                sum+=arr[j];
//                maxSum= Math.max(maxSum,sum);
//
//
//            }
//            System.out.println(" Max sum:"+maxSum);
//        }
//        return maxSum;
//    }

//kadanes algo>>
    // we have two variable sum and maxSum sum calculate the sum of current subArray and maxSum stores the max sum of the array
    // if the sum become negative we will reset to zero because we want maxSum only and +ve value plus (+) positive value gives maxSum


 static int getLargestSum(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            //reset sum
            if(sum<0){
            sum=0;
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getLargestSum(arr));
    }

}
