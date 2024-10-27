public class RekursifFibonacci {
    public static void main(String[] args) {
        int n = 2; // Ganti dengan jumlah angka Fibonacci yang ingin Anda hitung
        System.out.println("Deret Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}