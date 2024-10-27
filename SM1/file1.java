import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //input dari pengguna
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

        //menampilakan data yang disismpan
        System.out.println("\nData yang akan disimpan: ");
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + namaMhs);
        System.out.println("Umur: " + umur);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);

        //meminta konfirmasi dari penggua
        System.out.print("\nApakah Anda Ingin Menyimpan Data? (y/n): ");
        char konfirmasi = key.next().charAt(0);

        if (konfirmasi == 'y' || konfirmasi == 'Y') {
            //menyimpan data ke dalam file
            tulisDataKeFile("data_mahasiswa.txt", nim, namaMhs, umur, nilaiUts, nilaiUas);
            System.out.println("Data telah disimpan dalam file.");
        } else {
            System.out.println("Data tidak disimpan.");
        }

        key.close();
    }

    //fungsi untuk menuliskan data mahasiswa ke dalam file
    public static void tulisDataKeFile(String namaFile, String nim, String namaMhs, int umur, int nilaiUts, int nilaiUas) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile, true))) {
            writer.println(nim + "\t" + namaMhs + "\t" + umur + "\t" + nilaiUts + "\t" + nilaiUas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
