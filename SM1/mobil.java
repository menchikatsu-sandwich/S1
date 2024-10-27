import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mobil {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String[] dataPenjualanMobil = new String[0];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input Data Penjualan Mobil");
            System.out.println("2. Sorting Data Penjualan Mobil");
            System.out.println("3. Searching Data Penjualan Mobil");
            System.out.println("4. Simpan Data Penjualan Mobil ke File");
            System.out.println("5. Baca Data Penjualan Mobil dari File");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");

            int choice = key.nextInt();
            key.nextLine();

            switch (choice) {
                case 1:
                    dataPenjualanMobil = inputDataPenjualanMobil(key, dataPenjualanMobil);
                    break;
                case 2:
                    bubbleSort(dataPenjualanMobil);
                    System.out.println("Data Penjualan Mobil setelah sorting:");
                    displayDataPenjualanMobil(dataPenjualanMobil);
                    break;
                case 3:
                    searchDataPenjualanMobil(dataPenjualanMobil, key);
                    break;
                case 4:
                    simpanDataKeFile("data_penjualan_mobil.txt", dataPenjualanMobil);
                    System.out.println("Data Penjualan Mobil telah disimpan dalam file.");
                    break;
                case 5:
                    bacaDataDariFile("data_penjualan_mobil.txt");
                    break;
                case 6:
                    System.out.println("Terima kasih, program selesai.");
                    key.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static String[] inputDataPenjualanMobil(Scanner scanner, String[] data) {
        System.out.print("Masukkan jumlah data penjualan mobil: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] newData = new String[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan merek mobil ke-" + (i + 1) + ": ");
            String merekMobil = scanner.nextLine();

            int hargaMobil = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Masukkan harga mobil (angka) ke-" + (i + 1) + ": ");
                try {
                    hargaMobil = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka.");
                }
            }

            newData[i] = merekMobil + "," + hargaMobil;
        }

        System.out.println("Data Penjualan Mobil berhasil diinput.");
        return newData;
    }

    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        String temp = "";
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                int hargaMobil1 = Integer.parseInt(arr[j-1].split(",")[1]);
                int hargaMobil2 = Integer.parseInt(arr[j].split(",")[1]);

                if(hargaMobil1 > hargaMobil2){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void displayDataPenjualanMobil(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void searchDataPenjualanMobil(String[] data, Scanner scanner) {
        if (data.length == 0) {
            System.out.println("Data Penjualan Mobil belum diinput. Silakan input data terlebih dahulu.");
            return;
        }

        System.out.print("Masukkan merek mobil yang ingin dicari: ");
        String targetMerek = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i].startsWith(targetMerek + ",")) {
                found = true;
                System.out.println("Data " + targetMerek + " ditemukan pada indeks " + i + ": " + data[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("Data " + targetMerek + " tidak ditemukan.");
        }
    }

    private static void simpanDataKeFile(String namaFile, String[] data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            for (int i = 0; i < data.length; i++) {
                writer.println(data[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bacaDataDariFile(String namaFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            System.out.println("Data Penjualan Mobil dari File: ");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
