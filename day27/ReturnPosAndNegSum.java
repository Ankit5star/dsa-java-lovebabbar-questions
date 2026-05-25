package day27;

public class ReturnPosAndNegSum {
    static int[] returnPosNegSum(int[]arr,int[] retn){
        //index 0 is for negative index 1 is for positive



    for(int i:arr) {
        if (i >= 0) {
            retn[1] += i;
        } else {
            retn[0] += i;
        }
    }
        return retn;
    }

    public static void main(String[] args) {
        int[] retn={0,0};
        int[] arr={-1,3,-7,8,-32,22};
        returnPosNegSum(arr,retn);
        System.out.println("sum of negative number is "+retn[0]);
        System.out.println("sum of positive number is "+retn[1]);
    }
}


