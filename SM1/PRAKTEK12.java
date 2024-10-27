import java.util.Scanner;

public class PRAKTEK12 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Masukkan Kode Produk: ");
            String koprod = key.nextLine();

            System.out.println("Pilih (A),(B),(C)");
            System.out.print("Masukkan Tipe Produk: ");
            String tiprod = key.nextLine();

            System.out.println("Masukkan Harga Produk:");
            double haprod = key.nextDouble();

            System.out.println("Masukkan Jumlah Produk:");
            int jumprod = key.nextInt();

            key.nextLine();  

            double tot = jumprod * haprod;
            double disc = 0;

            if ("A".equals(tiprod)){
                disc = 0.1 * tot;
            } else if ("B".equals(tiprod)){
                disc = 0.2 * tot;
            } else if ("C".equals(tiprod)){
                disc = 0.25 * tot;
            } else {
                disc = 0 * tot;
                System.out.println("Tipe Produk Salah. Diskon 0% diterapkan.");
            }

            double totalhabisdiskon = tot - disc;

            System.out.println("========== SELAMAT DATANG ==========");
            System.out.println("|          KASIR VERSI 01          |");
            System.out.println("====================================");
            System.out.println(" ");
            System.out.println("Kode Produk: " + koprod);
            System.out.println("Tipe Produk: " + tiprod);
            System.out.println("Harga Produk: " + haprod);
            System.out.println("Jumlah Produk: " + jumprod);
            System.out.println("Total Harga: " + tot);
            System.out.println("Total Diskon: " + disc);
            System.out.println("Total Habis Diskon: " + totalhabisdiskon);
            System.out.println("====================================");
            System.out.println(" ");
            System.out.println("Apakah Anda Ingin Lanjut (Y/T)");
            String Jawaban = key.nextLine();

            if (Jawaban.equalsIgnoreCase("T")) {
                lanjut = false;
            }
        }
        key.close();
    }
}