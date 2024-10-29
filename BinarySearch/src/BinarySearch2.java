public class BinarySearch2 {
    public static void main(String[] args) {
        int [] arr={101,100,95,78,56,45,12,2,-8};
        int target=12;
        int ans=binarysearch2(arr,target);
        System.out.println(ans);
    }

     static int binarysearch2(int[] arr, int target) {
         int start=0;
         int end=arr.length-1;
         while (start<=end){
             int mid=start+(end-start)/2;
             if (arr[mid]<target){
                 end=mid-1;
             }else if (arr[mid]>target){
                 start=mid+1;
             }else {
                 return mid;
             }

         }
         return -1;
    }
}
