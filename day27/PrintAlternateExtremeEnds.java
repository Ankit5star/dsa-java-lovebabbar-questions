package day27;

public class PrintAlternateExtremeEnds {
    static void printAlternateExtreme(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            System.out.print(arr[left] +" ");
            System.out.print(arr[right]+" ");
            left++;
            right--;
        }
      if(left==right)
      {
          System.out.print(arr[left]+" ");
      }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        printAlternateExtreme(arr);
    }

}
