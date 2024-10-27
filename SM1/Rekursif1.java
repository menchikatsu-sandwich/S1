import java.util.Scanner;

public class Rekursif1 {
    public static void main(String[]args) {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();

        System.out.println(faktorial(n));
    }

    public static int faktorial(int n) {
        if (n < 1) {
            return 1;
        } else if (n >= 1) {
            System.out.println(n + "*" + (n - 1) + "=");
            return n * faktorial(n - 1);
        } else {
            return 1;
        }
    }
}
