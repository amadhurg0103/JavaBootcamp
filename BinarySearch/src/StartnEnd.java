import java.util.Arrays;

public class StartnEnd {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int target=8;
        int [] ans=bstsne(arr,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] bstsne(int[] arr, int target) {
         int[] index = new int[2];
         index[0]=-1;
         index[1]=-1;
         int start = 0;
         int end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (arr[mid] < target) {
                 start = mid + 1;
             } else if (arr[mid] > target) {
                 end = mid - 1;
             } else {
                 if (arr[start] == arr[mid]) {
                     index[0] = start;
                     index[1] = mid;
                 } else if (arr[end] == arr[mid]) {
                     index[0] = mid;
                     index[1] = end;
                 } else {
                     index[0] = start;
                     index[1] = mid;
                     index[2] = end;
                 }
                 return index;
             }
             
         }
         return index;
     }
}
