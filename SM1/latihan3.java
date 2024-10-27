import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while(lanjut) {
            System.out.println("Masukkan Gaji Pokok: ");
            double gapok = key.nextDouble();
            System.out.println("Masukkan Jumlah Hari Kerja: ");
            int hari = key.nextInt();
            System.out.println("Jumlah anak: ");
            int anak = key.nextInt();
            System.out.println("Uang Makan Per Hari: ");
            double makan = key.nextDouble();

            key.nextLine();

            double tomak = makan * hari;
            double tunjangan = 0;

            if (anak > 3) {
                tunjangan = 0.1 * gapok * 3;
            } else {
                tunjangan = 0.1 * gapok * anak;
            }

            double GajiPegawai = gapok + tunjangan + tomak;

            System.out.println("==================================");
            System.out.println(" ");
            System.out.println("Total Uang Makan: Rp." + tomak);
            System.out.println("Tunjangan Anak: Rp." + tunjangan);
            System.out.println("Gaji Pegawai: Rp." + GajiPegawai);
            System.out.println("==================================");
            System.out.println(" ");
            System.out.println("Apakah Anda Ingin Lanjut (Y/T)");
            String jawaban = key.nextLine();

            if (jawaban.equalsIgnoreCase("T")) {
                lanjut = false;
            }
        }
        key.close();
    }
}
