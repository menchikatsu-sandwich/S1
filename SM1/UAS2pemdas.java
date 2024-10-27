//Nama : Santo Evorius Jehu
//NIM : 2315354054
//Kelas : 1B


import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UAS2pemdas {

    private static void buatfile(String fileName, String koprod, String namprod, int jumprod, int haprod) {
        try (PrintWriter write = new PrintWriter(new FileWriter(fileName, true))) {
            write.println(koprod + "\t" + namprod + "\t" + jumprod + "\t" + haprod + "\t");
        } catch (IOException e) {
            System.err.println("data tidak tersimpan : " + e.getMessage());
        }
    }

    private static int hitungJumlahBaris(String fileName) throws IOException {
        int jumlahBaris = 0;

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            while (read.readLine() != null) {
                jumlahBaris++;
            }
            return jumlahBaris;
        }
    }

    private static void bacaFile(String fileName, String[] koprodArray, String[] namprodArray, int[] jumprodArray, int[] haprodArray) throws IOException {
        String baris;
        int index = 0;
        int[] totalValueArray = new int[jumprodArray.length];

        int totalBarang = 0;
        int totalHargaBarang = 0;

        try (BufferedReader read = new BufferedReader(new FileReader(fileName))) {
            while ((baris = read.readLine()) != null) {
                String[] data = baris.split("\t");

                koprodArray[index] = data[0];
                namprodArray[index] = data[1];
                jumprodArray[index] = Integer.parseInt(data[2]);
                haprodArray[index] = Integer.parseInt(data[3]);

                totalValueArray[index] = jumprodArray[index] * haprodArray[index];

                totalBarang += jumprodArray[index];
                totalHargaBarang += totalValueArray[index];

                index++;
            }
        }

        for (int i = 0; i < jumprodArray.length; i++) {
            System.out.println(koprodArray[i] + "\t" + namprodArray[i] + "\t" + jumprodArray[i] + "\t" + haprodArray[i] + "\t" + totalValueArray[i]);
        }

        System.out.println("\nTotal Jumlah Barang: " + totalBarang);
        System.out.println("Total Harga: " + totalHargaBarang);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Menulis File\n2. Membaca File\n3. Exit");
            System.out.print("Pilih Menu : ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                System.out.println("");
                System.out.print("Masukkan Kode Produk : ");
                String koprod = input.next();

                System.out.print("Masukkan Nama Produk : ");
                String namprod = input.next();

                System.out.print("Jumlah Barang : ");
                int jumprod = input.nextInt();

                System.out.print("Harga Satuan : ");
                int haprod = input.nextInt();

                System.out.println("\nData yang akan disimpan :");
                System.out.println("Kode Produk : " + koprod);
                System.out.println("Nama Produk : " + namprod);
                System.out.println("Jumlah Barang : " + jumprod);
                System.out.println("Harga Satuan : " + haprod);

                System.out.print("Apakah Anda ingin menyimpan data? (y/t) : ");
                String konfirmasi = input.next();

                if (konfirmasi.equalsIgnoreCase("y")) {
                    buatfile("data_penjualan.txt", koprod, namprod, jumprod, haprod);
                    System.out.println("Data Berhasil Disimpan");
                } else {
                    System.out.println("Data Gagal Disimpan");
                }
                break;


                case 2:
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

                    } catch (IOException e) {
                        System.err.println("Terjadi kesalahan : " + e.getMessage());
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Terima Kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (true);
    }
}