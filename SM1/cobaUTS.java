// Nama : Santo Evorius Jehu
// NIM : 2315354054
// Kelas : 1B / TRPL




import java.util.Scanner;

public class cobaUTS {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan jumlah data Mahasiswa: ");
            int jumlahData = key.nextInt();
            String[][] name = new String[jumlahData][2];
            int[][] savenilai = new int[jumlahData][3]; 

            for (int i = 0; i < jumlahData; i++) {
                System.out.print("Masukkan Nama: ");
                name[i][0] = key.next();
                System.out.print("Kelas (A,B,C) : ");
                name[i][1] = key.next();

                for (int j = 0; j < 3; j++) {
                    System.out.print("Masukkan Nilai Mata Kuliah " + (j + 1) + ": ");
                    savenilai[i][j] = key.nextInt();
                }
            }

            System.out.println("\nData Mahasiswa:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". Nama: " + name[i][0] + ", Kelas: " + name[i][1] + ", " +
                        savenilai[i][0] + ", " + savenilai[i][1] + ", " + savenilai[i][2]  + ", RATA2: " + hasilNilai(savenilai[i]));
            }

            System.out.print("Apakah Anda ingin Menginputkan lagi? (true/false): ");
            lanjut = key.nextBoolean();
        }

        key.close();
    }

    public static String hasilNilai(int[] nilai) {
        double rataNilai = (nilai[0] + nilai[1] + nilai[2]) / 3.0;
        if (rataNilai >= 80) {
            return "Bagus" + " (" + rataNilai + ")";
        } else if (rataNilai >= 60 && rataNilai < 80) {
            return "Cukup" + " (" + rataNilai + ")";
        } else {
            return "Kurang" + " (" + rataNilai + ")";
        }
    }
}
