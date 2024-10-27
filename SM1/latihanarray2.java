import java.util.Scanner;

public class latihanarray2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan jumlah data array: ");
            int jumlahData = key.nextInt();
            String[] nama = new String[jumlahData];
            String[] jabatan = new String[jumlahData];
            int[] jumlahHariKerja = new int[jumlahData];
            int[] upahPerHari = new int[jumlahData];
            double[] gajiPokok = new double[jumlahData];
            double[] takeHomePay = new double[jumlahData];

            for (int i = 0; i < jumlahData; i++) {
                System.out.print("Masukkan nama: ");
                nama[i] = key.next();
                System.out.print("Masukkan jabatan: ");
                jabatan[i] = key.next();
                System.out.print("Masukkan jumlah hari kerja: ");
                jumlahHariKerja[i] = key.nextInt();
                System.out.print("Masukkan upah per hari: ");
                upahPerHari[i] = key.nextInt();
                System.out.print("Masukkan gaji pokok: ");
                gajiPokok[i] = key.nextDouble();

                takeHomePay[i] = calculateTakeHomePay(jabatan[i], jumlahHariKerja[i], upahPerHari[i], gajiPokok[i]);
            }

            System.out.println("\nData Karyawan:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + nama[i] + ", " + jabatan[i] + ", " +
                        jumlahHariKerja[i] + ", " + upahPerHari[i] + ", " +
                        gajiPokok[i] + ", " + takeHomePay[i]);
            }

            System.out.print("Apakah Anda ingin melanjutkan? (true/false): ");
            lanjut = key.nextBoolean();
        }

        key.close();
    }

    public static double calculateTakeHomePay(String jabatan, int jumlahHariKerja, int upahPerHari, double gajiPokok) {
        int tunjanganJabatan;
        if (jabatan.equalsIgnoreCase("Manajer")) {
            tunjanganJabatan = 200000;
        } else if (jabatan.equalsIgnoreCase("Supervisor")) {
            tunjanganJabatan = 50000;
        } else {
            tunjanganJabatan = 20000;
        }
        return tunjanganJabatan + gajiPokok + (jumlahHariKerja * upahPerHari);
    }
}
