public class Binarysearch1 {
    public static void main(String[] args) {
        int [] arr={-56,-19,12,15,22,56,98,101};
        int target=12;
        int ans=binarysearch1(arr,target);
        System.out.println(ans);
    }

     static int binarysearch1(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            }else if (arr[mid]>target){
                end=mid-1;
            }else {
                return mid;
            }

        }
            return -1;
    }
}
