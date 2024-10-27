import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.print("Masukkan jumlah data Mahasiswa: ");
            int jumlahData = key.nextInt();
            String[][] name = new String[jumlahData][2];
            int[][] savenilai = new int[jumlahData][3]; 

            inputData(key, savenilai, name);

            System.out.println("\nData Mahasiswa:");
            for (int i = 0; i < jumlahData; i++) {
                double rataNilai = ((savenilai[i][0]) + (savenilai[i][1]) + (savenilai[i][2])) / 3.0;
                System.out.println((i + 1) + ". Nama: " + name[i][0] + ", Kelas: " + name[i][1] + ", " +
                        savenilai[i][0] + ", " + savenilai[i][1] + ", " + savenilai[i][2]  + ", RATA2: " + rataNilai + ", " + hasilNilai(rataNilai));
            }

            System.out.print("Apakah Anda ingin Menginputkan lagi? (true/false): ");
            lanjut = key.nextBoolean();
        }

        key.close();
    }

    public static void inputData(Scanner key, int[][] savenilai, String[][] name) {
        for (int i = 0; i < savenilai.length; i++) {
            System.out.print("Masukkan Nama: ");
            name[i][0] = key.next();
            System.out.print("Kelas (A,B,C) : ");
            name[i][1] = key.next();
            System.out.print("Masukkan Nilai Mata Kuliah 1: ");
            savenilai[i][0] = key.nextInt();
            System.out.print("Masukkan Nilai Mata Kuliah 2: ");
            savenilai[i][1] = key.nextInt();
            System.out.print("Masukkan Nilai Mata Kuliah 3: ");
            savenilai[i][2] = key.nextInt();
        }
    }

    public static String hasilNilai(double rataNilai) {
        if (rataNilai >= 80) {
            return "Bagus";
        } else if (rataNilai >= 60 && rataNilai < 80) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}
