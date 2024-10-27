import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Masukkan Kuantitas Barang=");
        int kuantitas = key.nextInt();

        System.out.println("Masukkan Harga Barang=");
        int harga = key.nextInt();

        System.out.println("Tipe Pembeli (umum/member/owner)=");
        String tipe = key.next();

        int totalbayar = kuantitas * harga;
        int diskon = 0;

        if ("member".equals(tipe)){
            diskon = (int)(0.1 * totalbayar);
        } else if ("owner".equals(tipe)){
            diskon = (int)(0.2 * totalbayar);
        }

        int totalsetelahdiskon = totalbayar - diskon;

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Rincian Total Bayar");
        System.out.println("");
        System.out.println("TOTAL BAYAR: Rp." + totalbayar);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Total Setelah Diskon: Rp." + totalsetelahdiskon);
        System.out.println("");
        // System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++");

        key.close();
    }
}
