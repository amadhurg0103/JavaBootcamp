public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = {101, 100, 95, 78, 56, 45, 12, 2, -8};
        int target = 78;
        int ans = OrderAgnosticB(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticB(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}