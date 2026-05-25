package day27;

public class SwapAltElement {
    /*
      let suppose we are give one array arr= {1,2,3,4,5,6}
      what we need to do  newArr={2,1,4,3,6,5}
      what if the length of arr is odd
      eg arr= {3,4,5,6,7}
      newArr={4,3,6,5,7}


     */
   static int[] getSwapAltElement(int[] arr){

       int nextPos=0;
       while(nextPos<=arr.length-2){

           arr[nextPos]=arr[nextPos+1]^arr[nextPos];
           arr[nextPos+1]=arr[nextPos]^arr[nextPos+1];
           arr[nextPos]=arr[nextPos]^arr[nextPos+1];
           //upade next post
           nextPos+=2;

       }
    return arr;
   }

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6};
       getSwapAltElement(arr);
       for(int num:arr)
       {
           System.out.println(num);
       }
    }

}
