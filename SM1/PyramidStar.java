public class PyramidStar {
    public static void main(String[] args) {

        // for (int i = 0; i <= 10; i++) {

        //     for (int k = 0; k <= 1 * i - 1; k++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
