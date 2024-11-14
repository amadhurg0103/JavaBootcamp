public class Pattern3 {
    public static void main(String[] args) {
        pattern3(4);
    }

//    static void pattern3(int n) {
//        for (int row = 1; row <= n; row++) {
//            //for every row,run col
//            for (int col = n; col >= row; col--) {
//                System.out.print("* ");
//            }
//            // when one row is printed we need a newline.
//            System.out.println();
//        }
static void pattern3(int n) {
    for (int row = 1; row <= n; row++) {
        //for every row,run col
        for (int col = 1; col <= n-row+1; col++) {
            System.out.print("* ");
        }
        // when one row is printed we need a newline.
        System.out.println();
    }
    }
}
