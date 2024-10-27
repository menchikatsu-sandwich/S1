import java.util.Scanner;

public class AnakAyamTurunN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int N = input.nextInt();
        
        System.out.println("Anak Ayam Turun " + N);
        
        for (int i = N; i >= 1; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati satu tinggal 1.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
        
        input.close();
    }
}
