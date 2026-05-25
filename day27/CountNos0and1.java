package day27;

public class CountNos0and1 {
 static void countZeroOne(int[] arr,int[] count){
     for(int i :arr){
         if(i==1){
             count[1]=count[1]+1;
         }
         else if(i==0)
         {
             count[0]=count[0]+1;
         }
     }

 }

    public static void main(String[] args) {
        int[] count={0,0};
        int[] arr= {1,0,1,0,1,2,3,1,1,0};
        //zeroth index is for zero count and 1nth is for 1's count
        countZeroOne(arr,count);
        System.out.println("count of 0's "+count[0]);
        System.out.println("count of 1's "+count[1]);
    }
}
