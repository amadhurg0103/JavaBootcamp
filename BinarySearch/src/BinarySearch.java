public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,8,9,10};
        int target=9;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1
    static int binarysearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int mid=(start+end)/2;
             if(arr[mid]>target){
                 end=mid-1;
            }else if(arr[mid]<target){
                 start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}