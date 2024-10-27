import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BacaFile1 {
    public static void main(String[] args) {
        String[] nimArray;
        String[] namaMhsArray;
        int[] umurArray;
        int[] nilaiUTSArray;
        int[] nilaiUASArray;

        try {
            //Hitung jumlah baris dalam file untuk menentukan ukuran array
            int jumlahBaris = hitungJumlahBaris("data_mahasiswa.txt");

            //inisialisasi Array
            nimArray = new String[jumlahBaris];
            namaMhsArray = new String[jumlahBaris];
            umurArray = new int[jumlahBaris];
            nilaiUTSArray = new int[jumlahBaris];
            nilaiUASArray = new int[jumlahBaris];

            //baca file dan isi array
            bacaFile("data_mahasiswa.txt", nimArray, namaMhsArray, umurArray, nilaiUTSArray, nilaiUASArray);

            //Tampilkan hasil bacaan
            System.out.println("Data Mahasiswa dari File: ");

            for (int i = 0; i < jumlahBaris; i++) {
                System.out.println("NIM: " + nimArray[i] + ", Nama Mahasiswa: " + namaMhsArray[i] + ", Umur: " + umurArray[i] + ", Nilai UTS: " + nilaiUTSArray[i] + ", Nilai UAS: " + nilaiUASArray[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Fungsi untuk menghitung jumlah baris dalam file
    private static int hitungJumlahBaris(String namaFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            int jumlahBaris = 0;

            //Baca setiap baris dan hitung jumlah baris
            while (reader.readLine() != null) {
                jumlahBaris++;
            }

            return jumlahBaris;
        }
    }

    //Fungsi untuk mencoba file dan mengisi array
    private static void bacaFile(String namaFile, String[] nimArray, String[] namaMhsArray, int[] umurArray, int[] nilaiUtsArray, int[] nilaiUasArray) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            int index = 0;

            //baca setiap baris dan isi array
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");

                nimArray[index] = data[0];
                namaMhsArray[index] = data[1];
                umurArray[index] = Integer.parseInt(data[2]);
                nilaiUtsArray[index] = Integer.parseInt(data[3]);
                nilaiUasArray[index] = Integer.parseInt(data[4]);

                index++;
            }
        }
    }
}
