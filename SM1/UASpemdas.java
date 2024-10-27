import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UASpemdas {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Menulis File");
            System.out.println("2. Membaca File");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");

            int choice = key.nextInt();
            key.nextLine();

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

        System.out.print("Masukkan Kode Produk: ");
        String koprod = key.next();

        System.out.print("Masukkan Nama Produk: ");
        String namprod = key.next();

        System.out.print("Masukkan Jumlah barang: ");
        int jumprod = key.nextInt();

        System.out.print("Masukkan Harga Satuan: ");
        int haprod = key.nextInt();

        System.out.println("\nData yang akan disimpan: ");
        System.out.println("Kode Produk: " + koprod);
        System.out.println("Nama Produk: " + namprod);
        System.out.println("Jumlah Barang: " + jumprod);
        System.out.println("Harga Satuan: " + haprod);

        System.out.print("\nApakah Anda Ingin Menyimpan Data? (y/n): ");
        char konfirmasi = key.next().charAt(0);

        if (konfirmasi == 'y' || konfirmasi == 'Y') {
            tulisDataKeFile("data_penjualan.txt", koprod, namprod, jumprod, haprod);
            System.out.println("Data telah disimpan dalam file.");
        } else {
            System.out.println("Data tidak disimpan.");
        }
    }

    public static void bacaFile() {
        String[] koprodArray;
        String[] namprodArray;
        int[] jumprodArray;
        int[] haprodArray;

        try {
            int jumlahBaris = hitungJumlahBaris("data_penjualan.txt");

            koprodArray = new String[jumlahBaris];
            namprodArray = new String[jumlahBaris];
            jumprodArray = new int[jumlahBaris];
            haprodArray = new int[jumlahBaris];

            bacaFile("data_penjualan.txt", koprodArray, namprodArray, jumprodArray, haprodArray);

            System.out.println("Data Penjualan dari File: ");

            for (int i = 0; i < jumlahBaris; i++) {
                System.out.println("Kode Produk: " + koprodArray[i] + ", Nama Produk: " + namprodArray[i] + ", Jumlah Produk: "
                        + jumprodArray[i] + ", Harga Satuan Produk: Rp." + haprodArray[i]);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

    private static void tulisDataKeFile(String namaFile, String koprod, String namprod, int jumprod, int haprod) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile, true))) {
            // writer.println("KodeProduk" + "\t" + "NamaProduk" + "\t" + "JumlahProduk" + "\t" + "Harga Satuan Produk");
            writer.println(koprod + "\t" + "\t" + namprod + "\t" + "\t"  + jumprod + "\t" + "\t" + "\t" + "\t" + haprod + "\t" );
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

    private static void bacaFile(String namaFile, String[] koprodArray, String[] namprodArray, int[] jumprodArray,
            int[] haprodArray) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");

                koprodArray[index] = data[0];
                namprodArray[index] = data[1];
                jumprodArray[index] = Integer.parseInt(data[2]);
                haprodArray[index] = Integer.parseInt(data[3]);

                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
