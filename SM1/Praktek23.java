import java.util.Scanner;

public class Praktek23 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Mobil / Motor");
            System.out.print("Type Kendaraan yang ingin disewa:");
            String TipeKendaraan = key.nextLine();
            String Pilihan = ""; 

            if ("Mobil".equals(TipeKendaraan)) {
                System.out.println("Avanza / Zenia / Innova");
                System.out.print("Merek Kendaraan:");
                Pilihan = key.nextLine();
            } else if ("Motor".equals(TipeKendaraan)) {
                System.out.println("Vario / Supra X125 / Fazio / Scoopy");
                System.out.println("Merek Kendaraan:");
                Pilihan = key.nextLine();
            } else {
                System.out.println("Merek yang anda masukkan tidak valid");
                return;
            }

            System.out.println("Jumlah Kendaraan Yang Dipesan:");
            double Jumlah = key.nextDouble();

            System.out.println("Jumlah Jam Sewa:");
            double Jam = key.nextDouble();

            double perjam = 0;
            double totsewa = 0;

            if ("Avanza".equals(Pilihan)) {
                perjam = 600000;
            } else if ("Zenia".equals(Pilihan)) {
                perjam = 500000;
            } else if ("Innova".equals(Pilihan)) {
                perjam = 800000;
            } else if ("Vario".equals(Pilihan)) {
                perjam = 300000;
            } else if ("Supra X125".equals(Pilihan)) {
                perjam = 150000;
            } else if ("Fazio".equals(Pilihan)) {
                perjam = 200000;
            } else if ("Scoopy".equals(Pilihan)) {
                perjam = 100000;
            } else {
                return;
            }

            totsewa = Jumlah * Jam * perjam;

            double disc = 0;

            if (Jumlah >= 4) {
                disc = 0.1 * totsewa;
            } else {
                System.out.println("Jumlah Unit Yang dipinjam kurang dari 4 tidak mendapat diskon");
            }

            double tot = totsewa - disc;

            System.out.println("======================================");
            System.out.println(" ");
            System.out.println("Harga sewa perjam: Rp." + perjam);
            System.out.println("Total Sewa: Rp." + totsewa);
            System.out.println("Diskon: Rp." + disc);
            System.out.println("Total Bayar: Rp." + tot);
            System.out.println(" ");
            System.out.println("======================================");
            System.out.println(" ");
            System.out.print("Apakah anda ingin Lanjut (Y/T): ");
            key.nextLine(); // Membersihkan buffer sebelum membaca input jawaban
            String Jawaban = key.nextLine();

            if (Jawaban.equalsIgnoreCase("T")) {
                lanjut = false;
            }
        }
        key.close();
    }
}
