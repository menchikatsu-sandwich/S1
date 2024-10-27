import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int JumDat = key.nextInt();

        int sum = 0;
        int Terkecil = Integer.MAX_VALUE;
        int indeks = 0;

        for (int i = 0; i < JumDat; i++) {
            System.out.println("Masukkan data ke-" + (i + 1));
            int data = key.nextInt();

            sum += data;

            if (data < Terkecil) {
                Terkecil = data;
                indeks = i;
            }
        }
        System.out.println("========================");
        System.out.println("");
        System.out.println("Jumlah data : " + sum);
        System.out.println("Data Terkecil : " + Terkecil);
        System.out.println("Indeks Data : " + indeks);
        System.out.println("");
        System.out.println("========================");

        key.close();
    }
}
