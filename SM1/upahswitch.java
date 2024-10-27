import java.util.Scanner;

public class upahswitch {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mendeklarasikan upah per jam berdasarkan golongan
        int upahPerJamA = 4000;
        int upahPerJamB = 5000;
        int upahPerJamC = 6000;
        int upahPerJamD = 7000;

        // Mendeklarasikan upah lembur per jam
        int upahLembur = 3000;

        // Meminta pengguna memasukkan golongan karyawan
        System.out.print("Masukkan golongan karyawan (A, B, C, atau D): ");
        String golongan = scanner.next().toUpperCase(); // Mengonversi input ke huruf besar

        // Meminta pengguna memasukkan jumlah jam kerja
        System.out.print("Masukkan jumlah jam kerja dalam satu minggu: ");
        int jamKerja = scanner.nextInt();

        // Menghitung upah mingguan
        int upahMingguan;

        if (jamKerja <= 48) {
            switch (golongan) {
                case "A":
                    upahMingguan = jamKerja * upahPerJamA;
                    break;
                case "B":
                    upahMingguan = jamKerja * upahPerJamB;
                    break;
                case "C":
                    upahMingguan = jamKerja * upahPerJamC;
                    break;
                case "D":
                    upahMingguan = jamKerja * upahPerJamD;
                    break;
                default:
                    System.out.println("Golongan karyawan tidak valid.");
                    return;
            }
        } else {
            int jamNormal = 48;
            int jamLembur = jamKerja - jamNormal;

            switch (golongan) {
                case "A":
                    upahMingguan = (jamNormal * upahPerJamA) + (jamLembur * upahLembur);
                    break;
                case "B":
                    upahMingguan = (jamNormal * upahPerJamB) + (jamLembur * upahLembur);
                    break;
                case "C":
                    upahMingguan = (jamNormal * upahPerJamC) + (jamLembur * upahLembur);
                    break;
                case "D":
                    upahMingguan = (jamNormal * upahPerJamD) + (jamLembur * upahLembur);
                    break;
                default:
                    System.out.println("Golongan karyawan tidak valid.");
                    return;
            }
        }

        // Menampilkan hasil
        System.out.println("Upah mingguan karyawan adalah: Rp " + upahMingguan);

        // Menutup Scanner
        scanner.close();
    }
}
