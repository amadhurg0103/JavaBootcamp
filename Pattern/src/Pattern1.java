public class Pattern1 {
    public static void main(String[] args) {
      pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            //for every row,run col
            for (int col = 0; col <=row; col++) {
                System.out.print("* " );
            }
            // when one row is printed we need a newline.
            System.out.println();
        }
    }
}