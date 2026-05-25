package day27;

public class ReturnFirstUnsortedElement {
    // lets suppose we are given one array and they have given
    // the order of the array in our case lets take acending order
    static int getFirstUnsortedElement(int[] arr){
        int prevElement=arr[0];
        for(int num: arr)
        {
            if(num<prevElement )
            {
                return num;
            }
            else{
                prevElement=num;
            }

        }
        return -1;// if no element is breaking the ordr
    }

    public static void main(String[] args) {
        int[] arr={2,2,2,1};
        System.out.println(getFirstUnsortedElement(arr));
    }


}
