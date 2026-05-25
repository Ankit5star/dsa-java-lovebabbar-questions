package day30;

public class PiviotIndex {
    /*
       we need to find that index  from the given integer arr whose leftSum== rightSum and if not found return -1;
     */
    static int getPiviot(int[] arr) {
        int arraySum = 0;
        int leftSum = arr[0];
        for (int num : arr) {

            arraySum += num;


        }
        for (int piviot = 1; piviot < arr.length - 1; piviot++) {
            int rightSum = arraySum - arr[piviot] - leftSum;
            if (rightSum == leftSum) {
//                System.out.println("LEFT SUM= "+leftSum+ " Right Sum= "+rightSum);
                return piviot;
            } else {
                leftSum += arr[piviot];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12,19,2,-20,6,14,-1};
        System.out.println("Piviot element at index"+getPiviot(arr));
    }
}



