package day27;

public class AverageOfArr {
    static double getAverage(int[] arr){
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
     double avg= (double)sum/ arr.length;
    return avg;
    }

    public static void main(String[] args) {

    int[] arr={5,255,6,7,9};
        System.out.println(getAverage(arr));
    }
}
