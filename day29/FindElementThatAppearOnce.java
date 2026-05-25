package day29;

public class FindElementThatAppearOnce {
    static int getElement(int[] arr){
        int element=0;
        for(int num:arr){
            element=element^num;
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4};
        System.out.println(getElement(arr));
    }

}
