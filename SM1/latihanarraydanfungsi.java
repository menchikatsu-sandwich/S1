import java.util.Scanner;

public class latihanarraydanfungsi {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan jumlah data array: ");
            int jumlahData = key.nextInt();
            Karyawan[] karyawan = new Karyawan[jumlahData];

            for (int i = 0; i < jumlahData; i++) {
                karyawan[i] = new Karyawan();
                System.out.print("Masukkan nama: ");
                karyawan[i].inpNama(key.next());
                System.out.print("Masukkan jabatan: ");
                karyawan[i].inpJabatan(key.next());
                System.out.print("Masukkan jumlah hari kerja: ");
                karyawan[i].inpJumlahHariKerja(key.nextInt());
                System.out.print("Masukkan upah per hari: ");
                karyawan[i].inpUpahPerHari(key.nextInt());
                System.out.print("Masukkan gaji pokok: ");
                karyawan[i].inpGajiPokok(key.nextDouble());
            }

            System.out.println("\nData Karyawan:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + karyawan[i].toString());
            }

            System.out.print("Apakah Anda ingin melanjutkan? (true/false): ");
            lanjut = key.nextBoolean();
        }

        key.close();
    }

    public static class Karyawan {
        private String nama;
        private String jabatan;
        private int jumlahHariKerja;
        private int upahPerHari;
        private double gajiPokok;

        public void inpNama(String nama) {
            this.nama = nama;
        }

        public void inpJabatan(String jabatan) {
            this.jabatan = jabatan;
        }

        public void inpJumlahHariKerja(int jumlahHariKerja) {
            this.jumlahHariKerja = jumlahHariKerja;
        }

        public void inpUpahPerHari(int upahPerHari) {
            this.upahPerHari = upahPerHari;
        }

        public void inpGajiPokok(double gajiPokok) {
            this.gajiPokok = gajiPokok;
        }

        public double takeHomePay(String jabatan, int jumlahHariKerja, int upahPerHari, double gajiPokok) {
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

        public String toString() {
            return nama + ", " + jabatan + ", " + jumlahHariKerja + ", " + upahPerHari + ", " + gajiPokok + ", " +
                    takeHomePay(jabatan, jumlahHariKerja, upahPerHari, gajiPokok);
        }
    }
}
