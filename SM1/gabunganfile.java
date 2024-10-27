import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gabunganfile {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Simpan File");
            System.out.println("2. Baca File");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");

            int choice = key.nextInt();
            key.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    simpanFile();
                    break;
                case 2:
                    bacaFile();
                    break;
                case 3:
                    System.out.println("Terima kasih, program selesai.");
                    key.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void simpanFile() {
        Scanner key = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = key.next();

        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMhs = key.next();

        System.out.print("Masukkan Umur: ");
        int umur = key.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUts = key.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUas = key.nextInt();

        System.out.println("\nData yang akan disimpan: ");
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + namaMhs);
        System.out.println("Umur: " + umur);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);

        System.out.print("\nApakah Anda Ingin Menyimpan Data? (y/n): ");
        char konfirmasi = key.next().charAt(0);

        if (konfirmasi == 'y' || konfirmasi == 'Y') {
            tulisDataKeFile("data_mahasiswa.txt", nim, namaMhs, umur, nilaiUts, nilaiUas);
            System.out.println("Data telah disimpan dalam file.");
        } else {
            System.out.println("Data tidak disimpan.");
        }
    }

    public static void bacaFile() {
        String[] nimArray;
        String[] namaMhsArray;
        int[] umurArray;
        int[] nilaiUTSArray;
        int[] nilaiUASArray;

        try {
            int jumlahBaris = hitungJumlahBaris("data_mahasiswa.txt");

            nimArray = new String[jumlahBaris];
            namaMhsArray = new String[jumlahBaris];
            umurArray = new int[jumlahBaris];
            nilaiUTSArray = new int[jumlahBaris];
            nilaiUASArray = new int[jumlahBaris];

            bacaFile("data_mahasiswa.txt", nimArray, namaMhsArray, umurArray, nilaiUTSArray, nilaiUASArray);

            System.out.println("Data Mahasiswa dari File: ");

            for (int i = 0; i < jumlahBaris; i++) {
                System.out.println("NIM: " + nimArray[i] + ", Nama Mahasiswa: " + namaMhsArray[i] + ", Umur: "
                        + umurArray[i] + ", Nilai UTS: " + nilaiUTSArray[i] + ", Nilai UAS: " + nilaiUASArray[i]);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

    private static void tulisDataKeFile(String namaFile, String nim, String namaMhs, int umur, int nilaiUts, int nilaiUas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile, true))) {
            writer.println(nim + "\t" + namaMhs + "\t" + umur + "\t" + nilaiUts + "\t" + nilaiUas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int hitungJumlahBaris(String namaFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            int jumlahBaris = 0;

            while (reader.readLine() != null) {
                jumlahBaris++;
            }

            return jumlahBaris;
        }
    }

    private static void bacaFile(String namaFile, String[] nimArray, String[] namaMhsArray, int[] umurArray,
            int[] nilaiUtsArray, int[] nilaiUasArray) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");

                nimArray[index] = data[0];
                namaMhsArray[index] = data[1];
                umurArray[index] = Integer.parseInt(data[2]);
                nilaiUtsArray[index] = Integer.parseInt(data[3]);
                nilaiUasArray[index] = Integer.parseInt(data[4]);

                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
