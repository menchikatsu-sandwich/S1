import java.util.Scanner;

public class fibonacchi {
public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Masukkan jumlah bilangan Fibonacci yang ingin ditampilkan: ");
    int count = key.nextInt();

    int num1 = 0, num2 = 1;
    System.out.print("Deret Fibonacci: ");

    for (int i = 1; i <= count; ++i) {
        System.out.print(num1 + " ");

        int tambahsblm = num1 + num2;
        num1 = num2;
        num2 = tambahsblm;
    }
    }
}
