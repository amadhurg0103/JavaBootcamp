import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        boolean swapped;
        //run the steps n-1 times;
        for (int i = 0; i < arr.length; i++) {
            // for each step,the max item will come at the respective index
            for (int j = 1; j < arr.length-i; j++) {
                swapped=false;
                // swap if the previous element is smaller
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}