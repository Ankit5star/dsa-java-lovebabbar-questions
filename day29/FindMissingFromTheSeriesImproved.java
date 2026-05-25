package day29;

public class FindMissingFromTheSeriesImproved {
    // as one number is missing that and the initial array size is n and in and one element is missing
    //we can use XORSUM >> same elemet cancel out only the unique element left
    static int findMissingUsingXOR(int[] arr){
        int n= arr.length;
        int xorSum=0;
        for(int num:arr){
            xorSum=xorSum^num;
        }
        for(int i=0;i<=n;i++){
            xorSum=xorSum^i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};

        System.out.println(findMissingUsingXOR(arr));
    }
}
